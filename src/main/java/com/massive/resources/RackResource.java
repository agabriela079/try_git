package com.massive.resources;

import com.google.code.morphia.Datastore;
import com.google.code.morphia.query.Query;
import com.massive.models.Rack;
import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/racks")
public class RackResource extends Resource {
	
	@GET
	@Produces("application/json")
	public List<Rack> getVendors() {

		// query the datastore for all Vendors
		Query<Rack> query = datastore.createQuery(Rack.class);

		// get the results as a list
		List<Rack> results = query.asList();

		return results;
	}
}