package com.xworkz.mvcapp.repository;

import com.xworkz.mvcapp.dto.AmusementParkDTO;
import com.xworkz.mvcapp.exception.AmusementParkException;

public interface AmusementParkRepository {
	
	
	
	   AmusementParkDTO   save(AmusementParkDTO dto) throws AmusementParkException; 
	 // methods SavedDTO save(DTO)

}
