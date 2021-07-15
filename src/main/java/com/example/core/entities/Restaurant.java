package com.example.core.entities;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="restaurant")
public class Restaurant {
	@EmbeddedId
	private RestaurantId rId;
	private String restaurant_name;
	private String restaurant_address;
	private Integer restaurant_rating;
	//private String restaurant_img;
	private String name;
	private String description;
	private Double price;
	public RestaurantId getrId() {
		return rId;
	}
	public void setrId(RestaurantId rId) {
		this.rId = rId;
	}
	public String getRestaurant_name() {
		return restaurant_name;
	}
	public void setRestaurant_name(String restaurant_name) {
		this.restaurant_name = restaurant_name;
	}
	public String getRestaurant_address() {
		return restaurant_address;
	}
	public void setRestaurant_address(String restaurant_address) {
		this.restaurant_address = restaurant_address;
	}
	public Integer getRestaurant_rating() {
		return restaurant_rating;
	}
	public void setRestaurant_rating(Integer restaurant_rating) {
		this.restaurant_rating = restaurant_rating;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
		
	
}
