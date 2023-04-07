package com.xworkz.devapp.address;

import org.springframework.beans.factory.annotation.Autowired;
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
public class City {
	    @Value("Bengaluru")
	    private  String cityName ; 
	    @Autowired
	   private Area area ; 
	   

}
