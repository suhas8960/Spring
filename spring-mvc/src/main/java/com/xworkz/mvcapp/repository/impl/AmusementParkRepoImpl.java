package com.xworkz.mvcapp.repository.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.mvcapp.dto.AmusementParkDTO;
import com.xworkz.mvcapp.exception.AmusementParkException;
import com.xworkz.mvcapp.repository.AmusementParkRepository;

@Component
public class AmusementParkRepoImpl implements AmusementParkRepository {

	@Autowired
	List<AmusementParkDTO> dtos;

	@Override
	public AmusementParkDTO save(AmusementParkDTO dto) throws AmusementParkException {
		AmusementParkDTO amusementParkDTO = new AmusementParkDTO();
		boolean isAdded = false;
		if (dto != null) {
			isAdded = dtos.add(dto);
		}
		if (isAdded) {
			amusementParkDTO = dto;
		}
		return amusementParkDTO;
	}

}