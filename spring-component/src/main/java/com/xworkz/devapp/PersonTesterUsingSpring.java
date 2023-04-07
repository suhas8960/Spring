package com.xworkz.devapp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.devapp.config.Config;
import com.xworkz.devapp.person.Person;

public class PersonTesterUsingSpring {
	
	public static void main(String[] args) {
		
		//Spring Container  -- which manage bean objects  
		ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		
	  Person person =     context.getBean(Person.class);
		System.out.println(person);
	}

}
