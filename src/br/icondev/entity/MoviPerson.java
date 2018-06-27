package br.icondev.entity;

import java.util.Date;
import java.util.List;

@SuppressWarnings("serial")
public class MoviPerson extends MoviEntity {

	private String id;
	private String codeReferenceAdditional;
	private Boolean isActive;
	private int personType;
	private int profileType;
	private String accessProfile;
	private String businessName;
	private String corporateName;
	private String cpfCnpj;
	private String userName;
	private String password;
	private String role;
	private String bossId;
	private String bossName;
	private String classification;
	private String cultureId;
	private String timeZoneId;
	private Date createdDate;
	private String createdBy;
	private Date changedDate;
	private String changedBy;
	private String observations;
	private String authenticateOn;

	private List<MoviPersonAddress> addresses;
	private List<MoviPersonContact> contacts;
	private List<MoviPersonEmail> emails;
	private List<String> teams;
	private List<MoviPersonRelationship> relationships;
	private List<MoviPersonCustomFieldValue> customFieldValues;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getCodeReferenceAdditional() {
		return codeReferenceAdditional;
	}
	public void setCodeReferenceAdditional(String codeReferenceAdditional) {
		this.codeReferenceAdditional = codeReferenceAdditional;
	}
	public Boolean getIsActive() {
		return isActive;
	}
	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}
	public int getPersonType() {
		return personType;
	}
	/**
	 * Tipo da pessoa. Pessoa = 1, Empresa = 2, Departamento = 4.
	 * @param personType
	 */
	public void setPersonType(int personType) {
		this.personType = personType;
	}
	public int getProfileType() {
		return profileType;
	}
	/**
	 * Tipo do perfil. Agente = 1, Cliente = 2, Agente e Cliente = 3
	 * @param profileType
	 */
	public void setProfileType(int profileType) {
		this.profileType = profileType;
	}
	public String getAccessProfile() {
		return accessProfile;
	}
	/**
	 * Campo Perfil de acesso. Deve ser um perfil de acesso já cadastrado no Movidesk. Se informado um perfil de acesso inválido, o sistema retornará erro
	 * @param accessProfile
	 */
	public void setAccessProfile(String accessProfile) {
		this.accessProfile = accessProfile;
	}
	public String getBusinessName() {
		return businessName;
	}
	public void setBusinessName(String businessName) {
		this.businessName = businessName;
	}
	public String getCorporateName() {
		return corporateName;
	}
	public void setCorporateName(String corporateName) {
		this.corporateName = corporateName;
	}
	public String getCpfCnpj() {
		return cpfCnpj;
	}
	public void setCpfCnpj(String cpfCnpj) {
		this.cpfCnpj = cpfCnpj;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getBossId() {
		return bossId;
	}
	public void setBossId(String bossId) {
		this.bossId = bossId;
	}
	public String getBossName() {
		return bossName;
	}
	public void setBossName(String bossName) {
		this.bossName = bossName;
	}
	public String getClassification() {
		return classification;
	}
	public void setClassification(String classification) {
		this.classification = classification;
	}
	public String getCultureId() {
		return cultureId;
	}
	public void setCultureId(String cultureId) {
		this.cultureId = cultureId;
	}
	public String getTimeZoneId() {
		return timeZoneId;
	}
	public void setTimeZoneId(String timeZoneId) {
		this.timeZoneId = timeZoneId;
	}
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	public Date getChangedDate() {
		return changedDate;
	}
	public void setChangedDate(Date changedDate) {
		this.changedDate = changedDate;
	}
	public String getChangedBy() {
		return changedBy;
	}
	public void setChangedBy(String changedBy) {
		this.changedBy = changedBy;
	}
	public String getObservations() {
		return observations;
	}
	public void setObservations(String observations) {
		this.observations = observations;
	}
	public String getAuthenticateOn() {
		return authenticateOn;
	}
	public void setAuthenticateOn(String authenticateOn) {
		this.authenticateOn = authenticateOn;
	}
	public List<MoviPersonAddress> getAddresses() {
		return addresses;
	}
	public void setAddresses(List<MoviPersonAddress> addresses) {
		this.addresses = addresses;
	}
	public List<MoviPersonContact> getContacts() {
		return contacts;
	}
	public void setContacts(List<MoviPersonContact> contacts) {
		this.contacts = contacts;
	}
	public List<MoviPersonEmail> getEmails() {
		return emails;
	}
	
	public MoviPersonEmail getEmailPrincipal(){
		for(MoviPersonEmail m: emails){
			if (m.getIsDefault())
				return m;
		}
		return null;
	}
	
	public void setEmails(List<MoviPersonEmail> emails) {
		this.emails = emails;
	}
	public List<String> getTeams() {
		return teams;
	}
	public void setTeams(List<String> teams) {
		this.teams = teams;
	}
	public List<MoviPersonRelationship> getRelationships() {
		return relationships;
	}
	public void setRelationships(List<MoviPersonRelationship> relationships) {
		this.relationships = relationships;
	}
	public List<MoviPersonCustomFieldValue> getCustomFieldValues() {
		return customFieldValues;
	}
	public void setCustomFieldValues(List<MoviPersonCustomFieldValue> customFieldValues) {
		this.customFieldValues = customFieldValues;
	}
}
