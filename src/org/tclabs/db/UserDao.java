package org.tclabs.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.tclabs.dto.UserDTO;

public class UserDao {

	public UserDTO saveUserAndLanguages(UserDTO user) {
		
		Connection connection =DBConnection.getConnection();
		String saveUserQuery = "insert into user_trn_tbl(`USER_NAME`, `EMAIL_ID`, `AGE`) values (?, ?, ?)";
		String saveLanguageQuery = "insert into user_languages_trn_tbl(`USER_ID`, `LANGUAGE_KNOWN`) values (?, ?)";
		try {
			PreparedStatement userPreparedStatement = connection.prepareStatement(saveUserQuery);
			userPreparedStatement.setString(1, user.getUserName());
			userPreparedStatement.setString(2, user.getEmailId());
			userPreparedStatement.setFloat(3, user.getAge());
			
			userPreparedStatement.executeUpdate();
			
			ResultSet generatedKeys = userPreparedStatement.getGeneratedKeys();

			if (generatedKeys.next()) {
				user.setId(generatedKeys.getLong(1));
				
				for(int i=0; i<user.getLanguagesKnown().size(); i++) {
					
					PreparedStatement langagePreparedStatement = connection.prepareStatement(saveLanguageQuery);
					
					langagePreparedStatement.setLong(1, user.getId());
					langagePreparedStatement.setString(2, user.getLanguagesKnown().get(i).getLanguageKnown());
					langagePreparedStatement.executeUpdate();
					
					ResultSet langGeneratedKeys = langagePreparedStatement.getGeneratedKeys();
					
					if(langGeneratedKeys.next()) {
						user.getLanguagesKnown().get(i).setId(langGeneratedKeys.getLong(1));
					}
				}
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return user;
	}
}