package com.xworkz.mvcapp.exception;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;


public class AmusementParkException extends RuntimeException {
	
	public AmusementParkException() {
		System.out.println("No Park Found");
	}

}
