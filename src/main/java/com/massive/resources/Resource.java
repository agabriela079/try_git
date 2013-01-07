package com.massive.resources;

import com.google.code.morphia.Datastore;
import com.google.code.morphia.Morphia;
import com.mongodb.Mongo;
import java.net.UnknownHostException;
import javax.ws.rs.WebApplicationException;

public abstract class Resource {
	
	protected Mongo mongo;
	protected Datastore datastore;

	public Resource() {

		// initialize a mongo instance, and handle any exceptions
		try {
			mongo = new Mongo("localhost");
		} catch (UnknownHostException e) {
			e.printStackTrace();
			throw new WebApplicationException();
		}

		// create a datastore instance to work w/ mongo
		datastore = new Morphia().createDatastore(mongo, "massive");
	}
}