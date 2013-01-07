package com.massive.models;

import com.google.code.morphia.annotations.Entity;
import com.google.code.morphia.annotations.Id;
import com.google.code.morphia.annotations.Property;
import com.google.code.morphia.annotations.Reference;
import com.google.gson.annotations.Expose;
import org.bson.types.ObjectId;
import java.util.List;

@Entity("racks")
public class Rack {

	@Id
	private ObjectId id;
	//like a rack id
	
	@Expose
	private String name;
	//rack of guns
	
	@Expose
	private String advertisingMessage;
	
	// TODO incorporate a 2-D array (shelves and slots) of Product objects
	// how will that work with a data base in a web server - we will see
	@Expose
	@Reference
	private List<Shelf> shelves;
	
	// getter/setters
	public String getName() { return name; }
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAdvertisingMessage(String advertisingMessage) { this.advertisingMessage = advertisingMessage; }
	public String getAdvertisingMessage() {
		return advertisingMessage;
	}
	
	public void setShelves(List<Shelf> shelves) { this.shelves = shelves; }
	public List<Shelf> getShelves() {
		return shelves;
	}
}