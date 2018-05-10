package br.icondev.entity;

@SuppressWarnings("serial")
public class MoviPersonEmail extends MoviEntity {
	
	private String emailType;
	private String email;
	private Boolean isDefault;

	public MoviPersonEmail() {
		super();
	}
	
	public MoviPersonEmail(String emailType, String email, Boolean isDefault) {
		super();
		this.emailType = emailType;
		this.email = email;
		this.isDefault = isDefault;
	}

	public String getEmailType() {
		return emailType;
	}
	public void setEmailType(String emailType) {
		this.emailType = emailType;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Boolean getIsDefault() {
		return isDefault;
	}
	public void setIsDefault(Boolean isDefault) {
		this.isDefault = isDefault;
	}
	
	
}
