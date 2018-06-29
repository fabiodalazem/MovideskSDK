package br.icondev.entity;

import java.sql.Time;
import java.util.Date;

@SuppressWarnings("serial")
public class MoviTicketActionTimeAppointment extends MoviEntity {
	
	private int id;
	private String activity;
	private Date date;
	private Time periodStart;
	private Time periodEnd;
	private Time workTime;
	private int workType;
	private MoviPerson createdBy;
	private MoviTeam createdByTeam;
	
	public MoviTicketActionTimeAppointment() {
		super();
	}

	public MoviTicketActionTimeAppointment(int id, String activity, Date date, Time periodStart, Time periodEnd,
			Time workTime, int workType, MoviPerson createdBy, MoviTeam createdByTeam) {
		super();
		this.id = id;
		this.activity = activity;
		this.date = date;
		this.periodStart = periodStart;
		this.periodEnd = periodEnd;
		this.workTime = workTime;
		this.workType = workType;
		this.createdBy = createdBy;
		this.createdByTeam = createdByTeam;
	}

	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getActivity() {
		return activity;
	}
	
	public void setActivity(String activity) {
		this.activity = activity;
	}
	
	public Date getDate() {
		return date;
	}
	
	public void setDate(Date date) {
		this.date = date;
	}
	
	public Time getPeriodStart() {
		return periodStart;
	}
	
	public void setPeriodStart(Time periodStart) {
		this.periodStart = periodStart;
	}
	
	public Time getPeriodEnd() {
		return periodEnd;
	}
	
	public void setPeriodEnd(Time periodEnd) {
		this.periodEnd = periodEnd;
	}
	
	public Time getWorkTime() {
		return workTime;
	}
	
	public void setWorkTime(Time workTime) {
		this.workTime = workTime;
	}
	
	public int getWorkType() {
		return workType;
	}
	
	public void setWorkType(int workType) {
		this.workType = workType;
	}
	
	public MoviPerson getCreatedBy() {
		return createdBy;
	}
	
	public void setCreatedBy(MoviPerson createdBy) {
		this.createdBy = createdBy;
	}
	
	public MoviTeam getCreatedByTeam() {
		return createdByTeam;
	}
	
	public void setCreatedByTeam(MoviTeam createdByTeam) {
		this.createdByTeam = createdByTeam;
	}
	
}
