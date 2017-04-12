package rest.info;

import java.util.Calendar;

public class UserInfo {

	private String emailHash;
	private String emailSalt;
	private String passwordHash;
	private String passwordSalt; 
	private String displayName;
	private Calendar accountCreation;
	public String getEmailHash() {
		return emailHash;
	}
	public void setEmailHash(String emailHash) {
		this.emailHash = emailHash;
	}
	public String getEmailSalt() {
		return emailSalt;
	}
	public void setEmailSalt(String emailSalt) {
		this.emailSalt = emailSalt;
	}
	public String getPasswordHash() {
		return passwordHash;
	}
	public void setPasswordHash(String passwordHash) {
		this.passwordHash = passwordHash;
	}
	public String getPasswordSalt() {
		return passwordSalt;
	}
	public void setPasswordSalt(String passwordSalt) {
		this.passwordSalt = passwordSalt;
	}
	public String getDisplayName() {
		return displayName;
	}
	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}
	public Calendar getAccountCreation() {
		return accountCreation;
	}
	public void setAccountCreation(Calendar accountCreation) {
		this.accountCreation = accountCreation;
	}
}
