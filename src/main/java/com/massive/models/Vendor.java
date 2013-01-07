package com.massive.models;

import com.google.code.morphia.annotations.Entity;
import com.google.code.morphia.annotations.Id;
import com.google.code.morphia.annotations.Property;
import com.google.code.morphia.annotations.Reference;
import com.google.gson.annotations.Expose;
import org.bson.types.ObjectId;
import java.util.ArrayList;
import java.util.List;

@Entity("vendors")
public class Vendor {

	@Id
	private ObjectId id;

	@Expose
	private String name;

	@Expose
	private String description;

	@Expose
	private String storeFrontImageURI;

	@Expose
	private String runningLightsMessage;

	@Expose
	@Reference
	private List<Category> categories = new ArrayList<Category>();

	// getter/setters
	public String getName() { return name; }
	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() { return description; }
	public void setDescription(String description) {
		this.description = description;
	}

	public String getStoreFrontImageURI() { return storeFrontImageURI; }
	public void setStoreFrontImageURI(String storeFrontImageURI) {
		this.storeFrontImageURI = storeFrontImageURI;
	}

	public String getRunningLightsMessage() { return runningLightsMessage; }
	public void setRunningLightsMessage(String runningLightsMessage) {
		this.runningLightsMessage = runningLightsMessage;
	}

	public List<Category> getCategories() { return categories; }
	public void setCategories(List<Category> categories) {
		this.categories = categories;
	}
}