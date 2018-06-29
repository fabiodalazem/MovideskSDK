package br.icondev.entity;

import java.util.Date;

@SuppressWarnings("serial")
public class MoviTicketSatisfactionSurveyResponse extends MoviEntity {
	
	private int id;
	private MoviPerson responsedBy;
	private Date responseDate;
	private int satisfactionSurveyModel;
	private int satisfactionSurveyNetPromoterScoreResponse;
	private int satisfactionSurveyPositiveNegativeResponse;
	private int satisfactionSurveySmileyFacesResponse;
	private String comments;

}
