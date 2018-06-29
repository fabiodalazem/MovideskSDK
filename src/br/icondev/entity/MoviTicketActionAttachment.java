package br.icondev.entity;

import java.util.Date;

@SuppressWarnings("serial")
public class MoviTicketActionAttachment extends MoviEntity {
	
	private String fileName;
	private String path;
	private MoviPerson createdBy;
	private Date createdDate;
	
	public MoviTicketActionAttachment() {
		super();
	}

	public MoviTicketActionAttachment(String fileName, String path, MoviPerson createdBy, Date createdDate) {
		super();
		this.fileName = fileName;
		this.path = path;
		this.createdBy = createdBy;
		this.createdDate = createdDate;
	}

	public String getFileName() {
		return fileName;
	}
	
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	
	public String getPath() {
		return path;
	}
	
	public void setPath(String path) {
		this.path = path;
	}
	
	public MoviPerson getCreatedBy() {
		return createdBy;
	}
	
	public void setCreatedBy(MoviPerson createdBy) {
		this.createdBy = createdBy;
	}
	
	public Date getCreatedDate() {
		return createdDate;
	}
	
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	
}
