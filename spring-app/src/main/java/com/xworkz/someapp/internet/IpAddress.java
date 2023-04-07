package com.xworkz.someapp.internet;

import org.springframework.stereotype.Component;

@Component
public class IpAddress {
	
	public IpAddress() {
		System.out.println(this.getClass().getSimpleName()+ " Object is created");
	}

}
