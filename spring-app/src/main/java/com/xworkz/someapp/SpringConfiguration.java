package com.xworkz.someapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import com.xworkz.someapp.book.Books;

@Configuration
@ComponentScan(basePackages = "com.xworkz.someapp")
public class SpringConfiguration {

	// create a bean - external objects
	@Bean
	List<Books> getBooks() {
		List<Books> books = new ArrayList<>();
		books.add(new Books(1, "Baba", "Guru", "2023", 500));
		books.add(new Books(2, "Babu", "Jail", "2022", 300));
		return books;
	}

}
