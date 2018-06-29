package br.icondev.entity;

import java.util.List;

@SuppressWarnings("serial")
public class MoviTicketCustomFieldValue extends MoviEntity {
	
	private int customFieldId;
	private int customFieldRuleId;
	private int line;
	private String value;
	private List<MoviCustomItem> items;

}
