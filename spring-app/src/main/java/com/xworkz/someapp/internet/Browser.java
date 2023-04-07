package com.xworkz.someapp.internet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component  // invoke default constructor of a bean- 
public class Browser {
	
	   @Autowired
	   IpAddress address ; 
	
	
	public Browser() {
		System.out.println(this.getClass().getSimpleName()+" Object is created");
	}

}
