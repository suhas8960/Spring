package com.xworkz.someapp.library;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.someapp.book.Books;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Component
@ToString
@Getter
@Setter
public class Library  { //Owning bean 

	public Library() {
		System.out.println(this.getClass().getSimpleName() + " Object is created");
	}

	@Autowired
	private List<Books> books; // associated bean
}
