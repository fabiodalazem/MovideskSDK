package br.icondev.entity;

@SuppressWarnings("serial")
public class MoviPersonAddress extends MoviEntity {
	
	private String addressType;
	private String country;
	private String postalCode;
	private String state;
	private String city;
	private String district;
	private String street;
	private String number;
	private String complement;
	private String reference;
	private Boolean isDefault;
	
	public MoviPersonAddress() {
		super();
	}
	
	public MoviPersonAddress(String addressType, String country, String postalCode, String state, String city,
			String district, String street, String number, String complement, String reference, Boolean isDefault) {
		super();
		this.addressType = addressType;
		this.country = country;
		this.postalCode = postalCode;
		this.state = state;
		this.city = city;
		this.district = district;
		this.street = street;
		this.number = number;
		this.complement = complement;
		this.reference = reference;
		this.isDefault = isDefault;
	}


	public String getAddressType() {
		return addressType;
	}
	
	public void setAddressType(String addressType) {
		this.addressType = addressType;
	}
	
	public String getCountry() {
		return country;
	}
	
	public void setCountry(String country) {
		this.country = country;
	}
	
	public String getPostalCode() {
		return postalCode;
	}
	
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	
	public String getState() {
		return state;
	}
	
	public void setState(String state) {
		this.state = state;
	}
	
	public String getCity() {
		return city;
	}
	
	public void setCity(String city) {
		this.city = city;
	}
	
	public String getDistrict() {
		return district;
	}
	
	public void setDistrict(String district) {
		this.district = district;
	}
	
	public String getStreet() {
		return street;
	}
	
	public void setStreet(String street) {
		this.street = street;
	}
	
	public String getNumber() {
		return number;
	}
	
	public void setNumber(String number) {
		this.number = number;
	}
	
	public String getComplement() {
		return complement;
	}
	
	public void setComplement(String complement) {
		this.complement = complement;
	}
	
	public String getReference() {
		return reference;
	}
	
	public void setReference(String reference) {
		this.reference = reference;
	}
	
	public Boolean getIsDefault() {
		return isDefault;
	}
	
	public void setIsDefault(Boolean isDefault) {
		this.isDefault = isDefault;
	}
	
}
