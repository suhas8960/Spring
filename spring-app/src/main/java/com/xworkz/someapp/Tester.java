package com.xworkz.someapp;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


import com.xworkz.someapp.book.Books;
import com.xworkz.someapp.library.Library;

public class Tester {

	public static void main(String[] args) {

		// Spring Container == manage(life cycle )
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfiguration.class);

		List<Books> books = applicationContext.getBean(List.class);

		Library library = applicationContext.getBean(Library.class);

		

		library.setBooks(books);
		System.out.println(library);
		// AC is used to manage the life cycle of bean Objects

		/*
		 * Train train = applicationContext.getBean(Train.class);
		 * System.out.println(train);
		 * 
		 * String str = applicationContext.getBean(String.class);
		 * System.out.println(str);
		 */
	}

}
