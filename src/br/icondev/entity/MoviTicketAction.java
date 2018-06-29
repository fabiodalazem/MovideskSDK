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
	private String tags; //String? "tags": [ "Tag1", "Tag2", "Tag3" ],
	
	public MoviTicketAction() {
		
	}

}
