package org.tclabs.dto;

public class LanguagesKnownDTO {

	private long id;
	private String languageKnown;
	private UserDTO user;

	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}

	public String getLanguageKnown() {
		return languageKnown;
	}
	public void setLanguageKnown(String languageKnown) {
		this.languageKnown = languageKnown;
	}

	public UserDTO getUser() {
		return user;
	}
	public void setUser(UserDTO user) {
		this.user = user;
	}


	@Override
	public String toString() {
		return "LanguagesKnown [id=" + id + ", languageKnown=" + languageKnown + ", user=" + user + "]";
	}
}
