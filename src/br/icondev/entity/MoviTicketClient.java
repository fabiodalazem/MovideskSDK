package br.icondev.entity;

@SuppressWarnings("serial")
public class MoviTicketClient extends MoviEntity {
	
	private String id;
	private String businessName;
	private String email;
	private String phone;
	private int personType;
	private int profileType;
	private Boolean isDeleted;
	private MoviPerson organization;
	
	public MoviTicketClient() {
		super();
	}

	public MoviTicketClient(String id, String businessName, String email, String phone, int personType, int profileType,
			Boolean isDeleted, MoviPerson organization) {
		super();
		this.id = id;
		this.businessName = businessName;
		this.email = email;
		this.phone = phone;
		this.personType = personType;
		this.profileType = profileType;
		this.isDeleted = isDeleted;
		this.organization = organization;
	}

	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getBusinessName() {
		return businessName;
	}
	
	public void setBusinessName(String businessName) {
		this.businessName = businessName;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getPhone() {
		return phone;
	}
	
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public int getPersonType() {
		return personType;
	}
	
	public void setPersonType(int personType) {
		this.personType = personType;
	}
	
	public int getProfileType() {
		return profileType;
	}
	
	public void setProfileType(int profileType) {
		this.profileType = profileType;
	}
	
	public Boolean getIsDeleted() {
		return isDeleted;
	}
	
	public void setIsDeleted(Boolean isDeleted) {
		this.isDeleted = isDeleted;
	}
	
	public MoviPerson getOrganization() {
		return organization;
	}
	
	public void setOrganization(MoviPerson organization) {
		this.organization = organization;
	}

}
