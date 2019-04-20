package com.prak.demorest;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("aliens")
public class AlienResource {
	
	@GET()
	@Produces(MediaType.APPLICATION_XML)
	public List<Alien> getAlien(){
		System.out.println("Get Alien called");
		Alien a1 = new Alien();
		a1.setName("Prakash");
		a1.setPoint(60);
		
		Alien a2 = new Alien();
		a2.setName("Archana");
		a2.setPoint(60);
		
		List<Alien> returnList = new ArrayList<Alien>();
		returnList.add(a1);	
		returnList.add(a2);	
		return returnList;
	
	}

}
