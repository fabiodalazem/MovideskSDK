package br.icondev.entity;

import java.util.List;

@SuppressWarnings("serial")
public class MoviPersonRelationship extends MoviEntity {
	
	private String id;
	private String name;
	private String slaAgreement;
	private Boolean forceChildrenToHaveSomeAgreement;
	private Boolean allowAllServices;
	private Boolean includeInParents;
	private Boolean loadChildOrganizations;
	private List<String> services; //Lista com os serviços que a pessoa terá acesso. *Obrigatório informar ao menos um serviço quando o campo allowAllServices for falso.
	
	public MoviPersonRelationship() {
		super();
	}
	
	public MoviPersonRelationship(String id, String name, String slaAgreement, Boolean forceChildrenToHaveSomeAgreement,
			Boolean allowAllServices, Boolean includeInParents, Boolean loadChildOrganizations, List<String> services) {
		super();
		this.id = id;
		this.name = name;
		this.slaAgreement = slaAgreement;
		this.forceChildrenToHaveSomeAgreement = forceChildrenToHaveSomeAgreement;
		this.allowAllServices = allowAllServices;
		this.includeInParents = includeInParents;
		this.loadChildOrganizations = loadChildOrganizations;
		this.services = services;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getSlaAgreement() {
		return slaAgreement;
	}
	
	public void setSlaAgreement(String slaAgreement) {
		this.slaAgreement = slaAgreement;
	}
	
	public Boolean getForceChildrenToHaveSomeAgreement() {
		return forceChildrenToHaveSomeAgreement;
	}
	
	public void setForceChildrenToHaveSomeAgreement(Boolean forceChildrenToHaveSomeAgreement) {
		this.forceChildrenToHaveSomeAgreement = forceChildrenToHaveSomeAgreement;
	}
	
	public Boolean getAllowAllServices() {
		return allowAllServices;
	}
	
	public void setAllowAllServices(Boolean allowAllServices) {
		this.allowAllServices = allowAllServices;
	}
	
	public Boolean getIncludeInParents() {
		return includeInParents;
	}
	
	public void setIncludeInParents(Boolean includeInParents) {
		this.includeInParents = includeInParents;
	}
	
	public Boolean getLoadChildOrganizations() {
		return loadChildOrganizations;
	}
	
	public void setLoadChildOrganizations(Boolean loadChildOrganizations) {
		this.loadChildOrganizations = loadChildOrganizations;
	}

	public List<String> getServices() {
		return services;
	}

	public void setServices(List<String> services) {
		this.services = services;
	}
	
}
