package com.prak;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AlienResource 
{
	@Autowired
	AlienRepository repo;
	
	@RequestMapping("alien")
	public List<Alien> getAliens(){
		System.out.println("Get Aliens called");
		return (List<Alien>)repo.findAll();
	}
}
