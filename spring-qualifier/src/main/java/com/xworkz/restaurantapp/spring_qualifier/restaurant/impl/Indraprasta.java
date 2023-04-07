package com.xworkz.restaurantapp.spring_qualifier.restaurant.impl;

import org.springframework.stereotype.Component;

import com.xworkz.restaurantapp.spring_qualifier.restaurant.Restaurant;

@Component("indraprasta")
public class Indraprasta implements Restaurant{
	
	

	
	@Override
	public String serveFood() {
		System.out.println("Serving Quality food  and good service to the customers");
		return Restaurant.super.serveFood();
	}
}
