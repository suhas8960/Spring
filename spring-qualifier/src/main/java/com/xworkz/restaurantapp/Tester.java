package com.xworkz.restaurantapp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.restaurantapp.owner.Owner;
import com.xworkz.restaurantapp.spring_qualifier.config.AppConfig;
import com.xworkz.restaurantapp.spring_qualifier.restaurant.Restaurant;

public class Tester {

	public static void main(String[] args) {

		ApplicationContext container = new AnnotationConfigApplicationContext(AppConfig.class);
		Owner owner = container.getBean(Owner.class);
		owner.getRestaurant().serveFood();
	}
}
