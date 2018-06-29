package br.icondev.entity;

import java.util.Date;

@SuppressWarnings("serial")
public class MoviTicketStatusHistory extends MoviEntity {
	
	private String status;
	private String justification;
	private double permanencyTimeFullTime;
	private double permanencyTimeWorkingTime;
	private MoviPerson changedBy;
	private Date changedDate;
	
	public MoviTicketStatusHistory() {
		super();
	}

	public MoviTicketStatusHistory(String status, String justification, double permanencyTimeFullTime,
			double permanencyTimeWorkingTime, MoviPerson changedBy, Date changedDate) {
		super();
		this.status = status;
		this.justification = justification;
		this.permanencyTimeFullTime = permanencyTimeFullTime;
		this.permanencyTimeWorkingTime = permanencyTimeWorkingTime;
		this.changedBy = changedBy;
		this.changedDate = changedDate;
	}

	public String getStatus() {
		return status;
	}
	
	public void setStatus(String status) {
		this.status = status;
	}
	
	public String getJustification() {
		return justification;
	}
	
	public void setJustification(String justification) {
		this.justification = justification;
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
