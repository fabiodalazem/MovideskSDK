package br.icondev.entity;

@SuppressWarnings("serial")
public class MoviTicketRelative extends MoviEntity {
	
	private int id;
	private String subject;
	private Boolean isDeleted;
	
	public MoviTicketRelative() {
		super();
	}

	public MoviTicketRelative(int id, String subject, Boolean isDeleted) {
		super();
		this.id = id;
		this.subject = subject;
		this.isDeleted = isDeleted;
	}

	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getSubject() {
		return subject;
	}
	
	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	public Boolean getIsDeleted() {
		return isDeleted;
	}
	
	public void setIsDeleted(Boolean isDeleted) {
		this.isDeleted = isDeleted;
	}
	
}
