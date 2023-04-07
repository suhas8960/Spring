package com.xworkz.mvcapp.contoller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.mvcapp.dto.AmusementParkDTO;
import com.xworkz.mvcapp.exception.AmusementParkException;
import com.xworkz.mvcapp.service.AmusementParkService;

@Component
public class AmusementParkController {

	@Autowired
	private AmusementParkService amusementParkService;

	// processing of dto and return the same
	// No of Arguments : 1
	// arugment No 1 : AmusementParkDTO dto(Object)
	// return type : AmusementParkDTO
	public AmusementParkDTO process(AmusementParkDTO dto) throws AmusementParkException {
	
		try {
			if (dto != null) {
				AmusementParkDTO proccessedDTO = amusementParkService.validateAndSave(dto);
			System.out.println("Amusement Park Info successfully added");
				return proccessedDTO;
			} else {

			}
		} catch (AmusementParkException e) {
			e.printStackTrace();
			throw new AmusementParkException();
		}
		return dto;
	}

	// menthods -- which will help to process data(DTO)

}
