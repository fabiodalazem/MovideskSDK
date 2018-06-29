package br.icondev.entity;

@SuppressWarnings("serial")
public class MoviTeam extends MoviEntity {

	private int id;
	private String name;
	
	public MoviTeam() {
		super();
	}

	public MoviTeam(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
}
