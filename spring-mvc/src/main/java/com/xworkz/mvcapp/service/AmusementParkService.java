package com.xworkz.mvcapp.service;

import com.xworkz.mvcapp.dto.AmusementParkDTO;
import com.xworkz.mvcapp.exception.AmusementParkException;

public interface AmusementParkService {

	// validate and save data(DTO) and return the same
	AmusementParkDTO validateAndSave(AmusementParkDTO dto) throws AmusementParkException;

}
