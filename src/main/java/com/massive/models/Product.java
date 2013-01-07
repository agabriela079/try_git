package com.massive.models;

import com.google.code.morphia.annotations.Entity;
import com.google.code.morphia.annotations.Id;
import com.google.code.morphia.annotations.Property;
import com.google.code.morphia.annotations.Reference;
import com.google.gson.annotations.Expose;
import org.bson.types.ObjectId;
import java.util.List;

@Entity("products")
public class Product {

	@Id
	private ObjectId id;

	@Expose
	private String name;
	
	@Expose
	private String description;
	
	@Expose
	private Integer sku;
	
	@Expose
	private Integer upc;
	
	@Expose
	private Double price; //this will probably turn into an array of price ranges
	
	@Expose
	private List<Category> categories;
	
	@Expose
	private List<String> colors;
	
	@Expose
	private List<String> sizes;
	
	@Expose
	private List<String> productImageURIs;

	// getter/setters
	public String getName() { return name; }
	public void setName(String name) {
		this.name = name;
	}
	
	public String getDescription() { return description; }
	public void setDescription(String description) {
		this.description = description;
	}
	
	public Integer getSKU() { return sku; }
	public void setSKU(Integer sku) {
		this.sku = sku;
	}
	
	public Integer getUPC() { return upc; }
	public void setUPC(Integer sku) {
		this.upc = upc;
	}
	
	public Double getPrice() { return price; }
	public void setUPC(Double price) {
		this.price = price;
	}
	
	public void setCategories(List<Category> categories) { this.categories = categories; }
	public List<Category> getCategories() { 
		return categories; 
	}
	
	public void setColors(List<String> colors) { this.colors = colors; }
	public List<String> getColors() {
		return colors;
	}
	
	public void setSizes(List<String> sizes) { this.sizes = sizes; }
	public List<String> getSizes() {
		return sizes;
	}
}