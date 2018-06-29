package br.icondev.entity;

import java.util.List;

@SuppressWarnings("serial")
public class MoviPersonCustomFieldValue extends MoviEntity {
	
	private int customFieldId;
	private int customFieldRuleId;
	private int line;
	private String value;
	private List<MoviCustomItem> items;
	
	public MoviPersonCustomFieldValue() {
		super();
	}

	public MoviPersonCustomFieldValue(int customFieldId, int customFieldRuleId, int line, String value,
			List<MoviCustomItem> items) {
		super();
		this.customFieldId = customFieldId;
		this.customFieldRuleId = customFieldRuleId;
		this.line = line;
		this.value = value;
		this.items = items;
	}

	public int getCustomFieldId() {
		return customFieldId;
	}
	
	public void setCustomFieldId(int customFieldId) {
		this.customFieldId = customFieldId;
	}
	
	public int getCustomFieldRuleId() {
		return customFieldRuleId;
	}
	
	public void setCustomFieldRuleId(int customFieldRuleId) {
		this.customFieldRuleId = customFieldRuleId;
	}
	
	public int getLine() {
		return line;
	}
	
	public void setLine(int line) {
		this.line = line;
	}
	
	public String getValue() {
		return value;
	}
	
	public void setValue(String value) {
		this.value = value;
	}
	
	public List<MoviCustomItem> getItems() {
		return items;
	}
	
	public void setItems(List<MoviCustomItem> items) {
		this.items = items;
	}

}
