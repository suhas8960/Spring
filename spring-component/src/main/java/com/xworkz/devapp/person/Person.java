package com.xworkz.devapp.person;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.xworkz.devapp.address.Address;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Getter
@Setter
@NoArgsConstructor
@ToString
public class Person {

	
	
	//  Initilization of Person (Object)
	// 1) Setter Initilization  @Value
	 //2) Constructor Initilization  - @Autowired
	
	
	@Value("1")
	private int id;

	@Value("ganga")
	private String name;
	// has A relationship
	@Autowired  // (Dependency Injection)
	private Address address;

}
