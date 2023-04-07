package com.xworkz.restaurantapp.owner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.xworkz.restaurantapp.spring_qualifier.restaurant.Restaurant;

import lombok.Getter;
import lombok.Setter;

@Component
@Setter
@Getter
public class Owner {
	
	  @Autowired
	  @Qualifier("indraprasta")
	   Restaurant restaurant ; 

}
