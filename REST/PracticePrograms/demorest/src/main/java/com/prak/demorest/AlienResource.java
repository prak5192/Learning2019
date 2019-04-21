package com.prak.demorest;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("aliens")
public class AlienResource {
	
	AlienRepository alrepo = new AlienRepository();
	
	@GET
	@Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
	public List<Alien> getAliens(){
		System.out.println("Get Aliens called");
		return alrepo.getAliens();
	}
	
	@GET
	@Path("alien/{id}")
	@Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
	public Alien getAlien(@PathParam("id") int id ){
		System.out.println("Get Alien called with ");
		return alrepo.getAlien(id);
	}
	
	
	@POST
	@Path("alien")
	@Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
	public Alien createAlien(Alien a){
		System.out.println("POST request: " + a.toString());
		alrepo.createAlien(a);
		return a;
	}
	
	@PUT
	@Path("alien")
	@Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
	public Alien updateAlien(Alien a){
		System.out.println("PUT request: " + a.toString());
		alrepo.updateAlien(a);
		return a;
	}

	
	@DELETE
	@Path("alien/{id}")
	@Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
	public Alien killAlien(@PathParam("id") int id){
		System.out.println("DELETE request with id : " + id);
		
		return alrepo.getAlien(id);
	}
}
