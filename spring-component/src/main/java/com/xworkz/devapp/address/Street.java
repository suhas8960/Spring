package com.xworkz.devapp.address;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
@Component
public class Street {
	
	   @Value("Maruthinagar")
	   private String streetName ;
	   @Value("No 64  , 6th Main , 7th cross")
	   private String streeNo ; 

}
