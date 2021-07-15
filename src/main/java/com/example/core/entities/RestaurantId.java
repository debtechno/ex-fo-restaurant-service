package com.example.core.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class RestaurantId implements Serializable{
	private static final long serialVersionUId = 1L;
	@Column(name="item_id")
	private Integer id;
	private Integer restaurant_id;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getRestaurant_id() {
		return restaurant_id;
	}
	public void setRestaurant_id(Integer restaurant_id) {
		this.restaurant_id = restaurant_id;
	}
	@Override
	public boolean equals(Object obj) {
		RestaurantId id= (RestaurantId)obj;
		if (this == obj)
			return true;
		else if(obj == null || obj.getClass()!= this.getClass())
            return false;
		else if(this.getRestaurant_id().equals(id.getRestaurant_id()) && this.getId().equals(id.getId()))
			return true;
		else
			return false;
	}
	@Override
	public int hashCode() {
		return this.getRestaurant_id()+this.getId();
	}
	public static long getSerialversionuid() {
		return serialVersionUId;
	}
	
}
