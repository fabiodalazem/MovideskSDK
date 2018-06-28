package br.icondev.entity;

@SuppressWarnings("serial")
public class MoviPersonRelationship extends MoviEntity {
	
	private String id;
	private String name;
	private String slaAgreement;
	private Boolean forceChildrenToHaveSomeAgreement;
	private Boolean allowAllServices;
	private Boolean includeInParents;
	private Boolean loadChildOrganizations;
//	private List<> services; //Lista com os serviços que a pessoa terá acesso. *Obrigatório informar ao menos um serviço quando o campo allowAllServices for falso.
	// private String services; []
}
