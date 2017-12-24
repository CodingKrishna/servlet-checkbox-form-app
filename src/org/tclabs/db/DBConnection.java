package org.tclabs.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

	public static Connection getConnection() {
		Connection connection = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			try {
				connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/sample", "root", "root");
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return connection;
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			return null;
		}
	}
}
