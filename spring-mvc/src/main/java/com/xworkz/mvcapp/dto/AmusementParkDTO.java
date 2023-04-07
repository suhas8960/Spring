package com.xworkz.mvcapp.dto;

import java.io.Serializable;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@NoArgsConstructor
public class AmusementParkDTO implements Serializable{
	
          private int amusementParkId;
          private String amusementParkName;
          private String address ; 
          private String cityName;
          private double entryFee ; 
          private String areaOccupied;          
	

}
