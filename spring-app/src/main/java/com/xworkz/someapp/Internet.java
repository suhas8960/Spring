package com.xworkz.someapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.someapp.internet.Browser;

@Component
public class Internet {

	public Internet() {
		System.out.println(this.getClass().getSimpleName() + " Object is created");
	}

	@Autowired // Dependency Injection
	Browser browser;

}
