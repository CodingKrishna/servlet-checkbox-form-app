package org.tclabs.dto;

import java.util.List;

public class UserDTO {

	private long id;
	private String userName;
	private String emailId;
	private Float age;
	
	private List<LanguagesKnownDTO> languagesKnown;


	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	
	public Float getAge() {
		return age;
	}
	public void setAge(Float age) {
		this.age = age;
	}

	public List<LanguagesKnownDTO> getLanguagesKnown() {
		return languagesKnown;
	}
	public void setLanguagesKnown(List<LanguagesKnownDTO> languagesKnown) {
		this.languagesKnown = languagesKnown;
	}
	@Override
	public String toString() {
		return "UserDTO [userName=" + userName + ", emailId=" + emailId + ", age=" + age + "]";
	}
}
