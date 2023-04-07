package com.xworkz.mvcapp.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.xworkz.mvcapp.dto.AmusementParkDTO;

@Configuration
@ComponentScan(basePackages = "com.xworkz.mvcapp")
public class SpringConfiguration {

	@Bean
	public List<AmusementParkDTO> getList() {

		return new ArrayList<AmusementParkDTO>();

	}

	@Bean
	AmusementParkDTO getAmusementParkDTO() {
		AmusementParkDTO amusementParkDTO = new AmusementParkDTO();
		amusementParkDTO.setAddress(null);
		amusementParkDTO.setCityName(null);
		amusementParkDTO.setEntryFee(0);
		amusementParkDTO.setAmusementParkName(null);
		amusementParkDTO.setAmusementParkId(0);
		amusementParkDTO.setAreaOccupied(null);
		return amusementParkDTO;

	}

}
