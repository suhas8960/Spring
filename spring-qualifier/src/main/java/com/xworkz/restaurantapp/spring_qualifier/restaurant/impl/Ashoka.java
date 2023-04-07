package com.xworkz.restaurantapp.spring_qualifier.restaurant.impl;

import org.springframework.stereotype.Component;

import com.xworkz.restaurantapp.spring_qualifier.restaurant.Restaurant;

@Component(value = "ashoka")
public class Ashoka implements Restaurant{
	
	@Override
	public String serveFood() {
		System.out.println("Serving Quality food to the customers");
		return Restaurant.super.serveFood();
	}

}
