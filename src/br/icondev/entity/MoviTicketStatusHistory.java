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

}
