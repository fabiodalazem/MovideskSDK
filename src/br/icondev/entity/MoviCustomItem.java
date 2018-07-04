package br.icondev.entity;

@SuppressWarnings("serial")
public class MoviCustomItem extends MoviEntity{
	
	private int personId;
	private int clientId;
	private String team;
	private String customFieldItem;
	
	public int getPersonId() {
		return personId;
	}
	
	public void setPersonId(int personId) {
		this.personId = personId;
	}
	
	public int getClientId() {
		return clientId;
	}
	
	public void setClientId(int clientId) {
		this.clientId = clientId;
	}
	
	public String getTeam() {
		return team;
	}
	
	public void setTeam(String team) {
		this.team = team;
	}
	
	public String getCustomFieldItem() {
		return customFieldItem;
	}
	
	public void setCustomFieldItem(String customFieldItem) {
		this.customFieldItem = customFieldItem;
	}
	
	public MoviCustomItem(int personId, int clientId, String team, String customFieldItem) {
		super();
		this.personId = personId;
		this.clientId = clientId;
		this.team = team;
		this.customFieldItem = customFieldItem;
	}
	
	public MoviCustomItem() {
		super();
	}
	
	
}
