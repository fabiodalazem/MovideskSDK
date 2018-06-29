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

}
