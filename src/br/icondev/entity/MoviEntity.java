package br.icondev.entity;

import java.io.Serializable;

import com.google.gson.GsonBuilder;

@SuppressWarnings("serial")
public abstract class MoviEntity implements Serializable {

	@Override
	public String toString() {
		return this.toJSON();
	}
	
	public String toJSON(){
		return new GsonBuilder().setPrettyPrinting().create().toJson(this);
	}
}
