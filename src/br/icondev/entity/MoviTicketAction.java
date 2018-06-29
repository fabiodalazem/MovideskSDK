package br.icondev.entity;

import java.util.Date;
import java.util.List;

@SuppressWarnings("serial")
public class MoviTicketAction extends MoviEntity {

	private int id;
	private int type; //Tipo do ticket: 1 = Interno 2 = Público.
	private int origin; //Origem da ação (Somente leitura).	1 Via web pelo cliente 2	Via web pelo agente 3 Recebido via email 4 Gatilho do sistema 5 Chat (online) 7	Email enviado pelo sistema 8 Formulário de contato 9 Via web API
	private String description;
	private String htmlDescription;
	private String status;
	private String justification;
	private Date createdDate;
	private MoviPerson createdBy;
	private Boolean isDeleted;
	private List<MoviTicketActionTimeAppointment> timeAppointments;
	private List<MoviTicketActionAttachment> attachments;
	private List<String> tags; //String? "tags": [ "Tag1", "Tag2", "Tag3" ],
	
	public MoviTicketAction() {
		super();
	}
	
	public MoviTicketAction(int id, int type, int origin, String description, String htmlDescription, String status,
			String justification, Date createdDate, MoviPerson createdBy, Boolean isDeleted,
			List<MoviTicketActionTimeAppointment> timeAppointments, List<MoviTicketActionAttachment> attachments,
			List<String> tags) {
		super();
		this.id = id;
		this.type = type;
		this.origin = origin;
		this.description = description;
		this.htmlDescription = htmlDescription;
		this.status = status;
		this.justification = justification;
		this.createdDate = createdDate;
		this.createdBy = createdBy;
		this.isDeleted = isDeleted;
		this.timeAppointments = timeAppointments;
		this.attachments = attachments;
		this.tags = tags;
	}

	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public int getType() {
		return type;
	}
	
	public void setType(int type) {
		this.type = type;
	}
	
	public int getOrigin() {
		return origin;
	}
	
	public void setOrigin(int origin) {
		this.origin = origin;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public String getHtmlDescription() {
		return htmlDescription;
	}
	
	public void setHtmlDescription(String htmlDescription) {
		this.htmlDescription = htmlDescription;
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
	
	public Date getCreatedDate() {
		return createdDate;
	}
	
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	
	public MoviPerson getCreatedBy() {
		return createdBy;
	}
	
	public void setCreatedBy(MoviPerson createdBy) {
		this.createdBy = createdBy;
	}
	
	public Boolean getIsDeleted() {
		return isDeleted;
	}
	
	public void setIsDeleted(Boolean isDeleted) {
		this.isDeleted = isDeleted;
	}
	
	public List<MoviTicketActionTimeAppointment> getTimeAppointments() {
		return timeAppointments;
	}
	
	public void setTimeAppointments(List<MoviTicketActionTimeAppointment> timeAppointments) {
		this.timeAppointments = timeAppointments;
	}
	
	public List<MoviTicketActionAttachment> getAttachments() {
		return attachments;
	}
	
	public void setAttachments(List<MoviTicketActionAttachment> attachments) {
		this.attachments = attachments;
	}

	public List<String> getTags() {
		return tags;
	}

	public void setTags(List<String> tags) {
		this.tags = tags;
	}
	
}
