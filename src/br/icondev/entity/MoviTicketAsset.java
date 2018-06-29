package br.icondev.entity;

@SuppressWarnings("serial")
public class MoviTicketAsset extends MoviEntity {
	
	private String id;
	private String name;
	private String label;
	private String serialNumber;
	private String categoryFull;
	private String categoryFirstLevel;
	private String categorySecondLevel;
	private String categoryThirdLevel;
	private Boolean isDeleted;
	
	public MoviTicketAsset() {
		super();
	}

	public MoviTicketAsset(String id, String name, String label, String serialNumber, String categoryFull,
			String categoryFirstLevel, String categorySecondLevel, String categoryThirdLevel, Boolean isDeleted) {
		super();
		this.id = id;
		this.name = name;
		this.label = label;
		this.serialNumber = serialNumber;
		this.categoryFull = categoryFull;
		this.categoryFirstLevel = categoryFirstLevel;
		this.categorySecondLevel = categorySecondLevel;
		this.categoryThirdLevel = categoryThirdLevel;
		this.isDeleted = isDeleted;
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
	
	public String getLabel() {
		return label;
	}
	
	public void setLabel(String label) {
		this.label = label;
	}
	
	public String getSerialNumber() {
		return serialNumber;
	}
	
	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}
	
	public String getCategoryFull() {
		return categoryFull;
	}
	
	public void setCategoryFull(String categoryFull) {
		this.categoryFull = categoryFull;
	}
	
	public String getCategoryFirstLevel() {
		return categoryFirstLevel;
	}
	
	public void setCategoryFirstLevel(String categoryFirstLevel) {
		this.categoryFirstLevel = categoryFirstLevel;
	}
	
	public String getCategorySecondLevel() {
		return categorySecondLevel;
	}
	
	public void setCategorySecondLevel(String categorySecondLevel) {
		this.categorySecondLevel = categorySecondLevel;
	}
	
	public String getCategoryThirdLevel() {
		return categoryThirdLevel;
	}
	
	public void setCategoryThirdLevel(String categoryThirdLevel) {
		this.categoryThirdLevel = categoryThirdLevel;
	}
	
	public Boolean getIsDeleted() {
		return isDeleted;
	}
	
	public void setIsDeleted(Boolean isDeleted) {
		this.isDeleted = isDeleted;
	}

}
