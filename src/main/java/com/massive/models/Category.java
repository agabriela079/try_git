package com.massive.models;

import com.google.code.morphia.annotations.Entity;
import com.google.code.morphia.annotations.Id;
import com.google.code.morphia.annotations.Property;
import com.google.gson.annotations.Expose;
import org.bson.types.ObjectId;

@Entity("categories")
public class Category {

	@Id
	private ObjectId id;

	@Expose
	private String name;
	
	@Expose
	private String iconURI;

	// getters/setters
	public String getName() { return name; }
	public void setName(String name) {
		this.name = name;
	}

	public String getIconURI() { return iconURI; }
	public void setIconURI(String iconURI) {
		this.iconURI = iconURI;
	}
}