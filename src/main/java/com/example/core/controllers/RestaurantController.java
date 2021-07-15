package com.example.core.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.core.entities.Restaurant;
import com.example.core.repos.RestaurantRepository;

@RestController
@CrossOrigin(origins="http://localhost:3000")
public class RestaurantController {
	@Autowired
	private RestaurantRepository restaurantRepo;
	
	@GetMapping("/restaurants")
	public List<Restaurant> findAll(){
		return restaurantRepo.findAll();
	}
	
	@GetMapping("/restaurants/{id}")
	public List<Restaurant> findByRestaurantId(@PathVariable("id") String id){
		List<Restaurant> li = restaurantRepo.findByRestaurant_id(id);
		return li;
		
	}

}
