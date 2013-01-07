package com.massive.misc;

import com.google.code.morphia.Datastore;
import com.google.code.morphia.Morphia;
import com.mongodb.Mongo;
import com.mongodb.DB;
import java.net.UnknownHostException;
import javax.ws.rs.WebApplicationException;
import com.massive.models.Category;
import com.massive.models.Vendor;

public class SampleDataInsert {
	protected static Mongo mongo;
	protected static Datastore datastore;
	
	public static void main(String[] args) {
		// initialize a mongo instance, and handle any exceptions
		try {
			mongo = new Mongo("localhost");
		} catch (UnknownHostException e) {
			e.printStackTrace();
			throw new WebApplicationException();
		}

		// create a datastore instance to work w/ mongo
		datastore = new Morphia().createDatastore(mongo, "massive");
	
		// delete all the previous datas on massive database
		dropDatas();
	
		// add sample datas by using datastore
		addDatas();
	}
	
	public static void dropDatas() {
		DB database = mongo.getDB("massive");
		database.dropDatabase();
	}
	
	public static void addDatas() {
		// adding categories
		Category c1 = buildCategory("tv");
		datastore.save(c1);
		Category c2 = buildCategory("computer");
		datastore.save(c2);
		Category c3 = buildCategory("earphones");
		datastore.save(c3);
		Category c4 = buildCategory("tent");
		datastore.save(c4);
		Category c5 = buildCategory("boat");
		datastore.save(c5);
		Category c6 = buildCategory("bike");
		datastore.save(c6);
		Category c7 = buildCategory("tennis");
		datastore.save(c7);
		Category c8 = buildCategory("baby");
		datastore.save(c8);
		Category c9 = buildCategory("bear");
		datastore.save(c9);
		Category c10 = buildCategory("broom");
		datastore.save(c10);
		Category c11 = buildCategory("diamond");
		datastore.save(c11);
		Category c12 = buildCategory("gun");
		datastore.save(c12);
		Category c13 = buildCategory("medical");
		datastore.save(c13);
		Category c14 = buildCategory("music");
		datastore.save(c14);
		Category c15 = buildCategory("plant");
		datastore.save(c15);
		Category c16 = buildCategory("ps3");
		datastore.save(c16);
		Category c17 = buildCategory("shirt");
		datastore.save(c17);
		
		// adding vendors
		Vendor v1 = buildVendor("Kim's Skateboard Shop", "http://www.anywherelists.com/massive/images/store-box-1.jpg", 
								"Get all your skateboard accessories from Kim's!");
		v1.getCategories().add(c6);
		v1.getCategories().add(c5);
		datastore.save(v1);
		Vendor v2 = buildVendor("Brown's Gun Shop", "http://www.anywherelists.com/massive/images/store-box-2.jpg", 
								"Get your guns at Brown's!");
		v2.getCategories().add(c12);
		datastore.save(v2);
		Vendor v3 = buildVendor("Forever Young Fashion", "http://www.anywherelists.com/massive/images/store-box-3.jpg", 
								"We'll fill all your clothing needs!");
		v3.getCategories().add(c16);
		v3.getCategories().add(c17);
		datastore.save(v3);
		Vendor v4 = buildVendor("Wood's WoodCrafts", "http://www.anywherelists.com/massive/images/store-box-4.jpg", 
								"We'll fill all your wood craft needs!");
		v4.getCategories().add(c4);
		v4.getCategories().add(c5);
		datastore.save(v4);
		Vendor v5 = buildVendor("DorisDoro Ponko Machine", "http://www.anywherelists.com/massive/images/store-box-5.jpg", 
								"Come play some Ponko!");
		v5.getCategories().add(c12);
		v5.getCategories().add(c5);
		datastore.save(v5);
		Vendor v6 = buildVendor("Pachingo Pingo", "http://www.anywherelists.com/massive/images/store-box-6.jpg", 
								"Come play some Pingo!");
		v6.getCategories().add(c11);
		v6.getCategories().add(c16);
		datastore.save(v6);
	}
	
	// build a category
	public static Category buildCategory(String name) {
		Category c = new Category();
		c.setName(name);
		c.setIconURI("images/header-icons/icon-"+name+".png");
		
		return c;
	}
	
	// build a vendor
	public static Vendor buildVendor(String name, String frontURL, String description) {
		Vendor v = new Vendor();
		v.setName(name);
		v.setStoreFrontImageURI(frontURL);
		v.setDescription(description);
		v.setRunningLightsMessage("come on in !!");
		
		return v;
	}
}