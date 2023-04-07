package com.xworkz.mvcapp.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.mvcapp.dto.AmusementParkDTO;
import com.xworkz.mvcapp.exception.AmusementParkException;
import com.xworkz.mvcapp.repository.AmusementParkRepository;
import com.xworkz.mvcapp.service.AmusementParkService;

@Component
public class AmusementParkServiceImpl implements AmusementParkService {

	@Autowired
	private AmusementParkRepository repo;

	@Override
	public AmusementParkDTO validateAndSave(AmusementParkDTO dto) throws AmusementParkException {
		boolean isIdPresent = false;
		boolean isNamePresent = false;
		boolean isCityNamePresent = false;
		boolean isAreaOccupied = false;
		AmusementParkDTO amusementParkDTO = new AmusementParkDTO();
		if (dto.getAmusementParkId() > 0)
			isIdPresent = true;

		if (dto.getCityName() != null && !dto.getCityName().isEmpty())
			isCityNamePresent = true;

		if (dto.getAreaOccupied() != null && !dto.getCityName().isEmpty())
			isAreaOccupied = true;

		if (isCityNamePresent == true && isIdPresent == true && isAreaOccupied == true) {
			amusementParkDTO = repo.save(dto);
		}

		return amusementParkDTO;

	}
}
