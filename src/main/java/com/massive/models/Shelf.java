package com.massive.models;

import com.google.code.morphia.annotations.Entity;
import com.google.code.morphia.annotations.Id;
import com.google.code.morphia.annotations.Property;
import com.google.code.morphia.annotations.Reference;
import com.google.gson.annotations.Expose;
import org.bson.types.ObjectId;
import java.util.List;

@Entity("shelves")
public class Shelf {

	@Id
	private ObjectId id;
	
	@Expose
	@Reference
	private List<Product> products;
	
	// getter/setters
	public void setProducts(List<Product> products) { this.products = products; }
	public List<Product> getProducts() {
		return products;
	}
}