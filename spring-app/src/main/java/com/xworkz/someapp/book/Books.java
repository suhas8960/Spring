package com.xworkz.someapp.book;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.ToString;

@Component
@ToString
@AllArgsConstructor
public class Books {

	public Books() {
		System.out.println(this.getClass().getSimpleName() + " Object is created");
	}

	private int id;

	private String authorName;

	private String bookName;

	private String yearOfPublication;

	private int price;
}
