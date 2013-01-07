package com.massive.resources;

import com.google.code.morphia.Datastore;
import com.google.code.morphia.query.Query;
import com.massive.models.Vendor;
import java.net.URI;
import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.POST;
import javax.ws.rs.Produces;

@Path("/vendors")
public class VendorResource extends Resource {

	@Context
	UriInfo uriInfo;

	@GET
	@Produces("application/json")
	public List<Vendor> getVendors() {

		// query the datastore for all Vendors
		Query<Vendor> query = datastore.createQuery(Vendor.class);

		// get the results as a list
		List<Vendor> results = query.asList();

		return results;
	}

	@POST
	@Consumes("application/json")
	public Response createVendor(Vendor vendor) {

		// save the category object to the datastore
		datastore.save(vendor);

		// get the absolute path
		URI path = uriInfo.getAbsolutePath();

		// return a 201 code with the absolute path
		return Response.created(path).build();
	}
}