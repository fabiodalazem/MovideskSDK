package br.icondev.entity;

@SuppressWarnings("serial")
public class MoviPersonContact extends MoviEntity {

	private String contactType;
    private String contact;
    private Boolean isDefault;
     
	public MoviPersonContact() {
		super();
	}

	public MoviPersonContact(String contactType, String contact, Boolean isDefault) {
		super();
		this.contactType = contactType;
		this.contact = contact;
		this.isDefault = isDefault;
	}

	public String getContactType() {
		return contactType;
	}
	
	public void setContactType(String contactType) {
		this.contactType = contactType;
	}
	
	public String getContact() {
		return contact;
	}
	
	public void setContact(String contact) {
		this.contact = contact;
	}
	
	public Boolean getIsDefault() {
		return isDefault;
	}
	
	public void setIsDefault(Boolean isDefault) {
		this.isDefault = isDefault;
	}
	
}
