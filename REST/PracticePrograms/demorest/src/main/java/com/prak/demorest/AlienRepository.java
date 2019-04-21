package com.prak.demorest;

import java.util.ArrayList;
import java.util.List;

public class AlienRepository {
	
	List<Alien> aliens;
	
	public AlienRepository(){
		aliens = new ArrayList<Alien>();
		
		Alien a1 = new Alien();
		a1.setId(1);
		a1.setName("Prakash");
		a1.setPoint(60);
		
		Alien a2 = new Alien();
		a2.setId(2);
		a2.setName("Archana");
		a2.setPoint(60);
		
		aliens.add(a2);
		aliens.add(a1);
	}
	
	public List<Alien> getAliens(){
		return aliens;
	}
	
	public Alien getAlien(int id){
		for(Alien a1 : aliens){
			if(a1.getId() == id){
				return a1;
			}
		}
		return null;
	}
	
	public Alien createAlien(Alien a){
		aliens.add(a);
		return a;
	}

	public void updateAlien(Alien a) {
		// TODO Auto-generated method stub
		
	}

}
