package br.icondev.entity;

import java.util.Date;
import java.util.List;

public class MoviPerson {

	private String id;
	private String codeReferenceAdditional;
	private Boolean isActive;
	private int personType;
	private int profileType;
	private String accessProfile;
	private String businessName;
	private String corporateName;
	private String cpfCnpj;
	private String userName;
	private String password;
	private String role;
	private String bossId;
	private String bossName;
	private String classification;
	private String cultureId;
	private String timeZoneId;
	private Date createdDate;
	private String createdBy;
	private Date changedDate;
	private String changedBy;
	private String observations;
	private String authenticateOn;

	private List<MoviPersonAddress> addressess;
	private List<MoviPersonContact> contacts;
	private List<MoviPersonEmail> emails;
	private List<MoviPersonTeam> teams;
	private List<MoviPersonRelationship> relationships;
	private List<MoviPersonCustomFieldValue> customFieldValues;

}
