package br.icondev.entity;

import java.util.Date;

@SuppressWarnings("serial")
public class MoviTicketOwnerHistory extends MoviEntity {
	
	private String ownerTeam;
	private MoviPerson owner;
	private double permanencyTimeFullTime;
	private double permanencyTimeWorkingTime;
	private MoviPerson changedBy;
	private Date changedDate;
	
	public MoviTicketOwnerHistory() {
		super();
	}

	public MoviTicketOwnerHistory(String ownerTeam, MoviPerson owner, double permanencyTimeFullTime,
			double permanencyTimeWorkingTime, MoviPerson changedBy, Date changedDate) {
		super();
		this.ownerTeam = ownerTeam;
		this.owner = owner;
		this.permanencyTimeFullTime = permanencyTimeFullTime;
		this.permanencyTimeWorkingTime = permanencyTimeWorkingTime;
		this.changedBy = changedBy;
		this.changedDate = changedDate;
	}

	public String getOwnerTeam() {
		return ownerTeam;
	}
	
	public void setOwnerTeam(String ownerTeam) {
		this.ownerTeam = ownerTeam;
	}
	
	public MoviPerson getOwner() {
		return owner;
	}
	
	public void setOwner(MoviPerson owner) {
		this.owner = owner;
	}
	
	public double getPermanencyTimeFullTime() {
		return permanencyTimeFullTime;
	}
	
	public void setPermanencyTimeFullTime(double permanencyTimeFullTime) {
		this.permanencyTimeFullTime = permanencyTimeFullTime;
	}
	
	public double getPermanencyTimeWorkingTime() {
		return permanencyTimeWorkingTime;
	}
	
	public void setPermanencyTimeWorkingTime(double permanencyTimeWorkingTime) {
		this.permanencyTimeWorkingTime = permanencyTimeWorkingTime;
	}
	
	public MoviPerson getChangedBy() {
		return changedBy;
	}
	
	public void setChangedBy(MoviPerson changedBy) {
		this.changedBy = changedBy;
	}
	
	public Date getChangedDate() {
		return changedDate;
	}
	
	public void setChangedDate(Date changedDate) {
		this.changedDate = changedDate;
	}
	
}
