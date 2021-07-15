package com.example.core.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.core.entities.Restaurant;
import com.example.core.entities.RestaurantId;

public interface RestaurantRepository extends JpaRepository<Restaurant, RestaurantId> {
	
	@Query(value="SELECT * FROM restaurant r where r.restaurant_id=?1", nativeQuery=true)
	public List<Restaurant> findByRestaurant_id(String restaurant_id);

}
