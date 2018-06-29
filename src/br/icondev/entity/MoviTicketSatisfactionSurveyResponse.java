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
	
	public MoviTicketSatisfactionSurveyResponse() {
		super();
	}

	public MoviTicketSatisfactionSurveyResponse(int id, MoviPerson responsedBy, Date responseDate,
			int satisfactionSurveyModel, int satisfactionSurveyNetPromoterScoreResponse,
			int satisfactionSurveyPositiveNegativeResponse, int satisfactionSurveySmileyFacesResponse,
			String comments) {
		super();
		this.id = id;
		this.responsedBy = responsedBy;
		this.responseDate = responseDate;
		this.satisfactionSurveyModel = satisfactionSurveyModel;
		this.satisfactionSurveyNetPromoterScoreResponse = satisfactionSurveyNetPromoterScoreResponse;
		this.satisfactionSurveyPositiveNegativeResponse = satisfactionSurveyPositiveNegativeResponse;
		this.satisfactionSurveySmileyFacesResponse = satisfactionSurveySmileyFacesResponse;
		this.comments = comments;
	}

	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public MoviPerson getResponsedBy() {
		return responsedBy;
	}
	
	public void setResponsedBy(MoviPerson responsedBy) {
		this.responsedBy = responsedBy;
	}
	
	public Date getResponseDate() {
		return responseDate;
	}
	
	public void setResponseDate(Date responseDate) {
		this.responseDate = responseDate;
	}
	
	public int getSatisfactionSurveyModel() {
		return satisfactionSurveyModel;
	}
	
	public void setSatisfactionSurveyModel(int satisfactionSurveyModel) {
		this.satisfactionSurveyModel = satisfactionSurveyModel;
	}
	
	public int getSatisfactionSurveyNetPromoterScoreResponse() {
		return satisfactionSurveyNetPromoterScoreResponse;
	}
	
	public void setSatisfactionSurveyNetPromoterScoreResponse(int satisfactionSurveyNetPromoterScoreResponse) {
		this.satisfactionSurveyNetPromoterScoreResponse = satisfactionSurveyNetPromoterScoreResponse;
	}
	
	public int getSatisfactionSurveyPositiveNegativeResponse() {
		return satisfactionSurveyPositiveNegativeResponse;
	}
	
	public void setSatisfactionSurveyPositiveNegativeResponse(int satisfactionSurveyPositiveNegativeResponse) {
		this.satisfactionSurveyPositiveNegativeResponse = satisfactionSurveyPositiveNegativeResponse;
	}
	
	public int getSatisfactionSurveySmileyFacesResponse() {
		return satisfactionSurveySmileyFacesResponse;
	}
	
	public void setSatisfactionSurveySmileyFacesResponse(int satisfactionSurveySmileyFacesResponse) {
		this.satisfactionSurveySmileyFacesResponse = satisfactionSurveySmileyFacesResponse;
	}
	
	public String getComments() {
		return comments;
	}
	
	public void setComments(String comments) {
		this.comments = comments;
	}
	
}
