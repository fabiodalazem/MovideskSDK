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

}
