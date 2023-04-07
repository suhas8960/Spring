package com.xworkz.restaurantapp.spring_qualifier.restaurant;

public interface Restaurant {
   
	default String serveFood() {
		return null;
	}

}
