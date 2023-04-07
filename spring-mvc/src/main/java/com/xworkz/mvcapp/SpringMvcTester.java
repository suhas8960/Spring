package com.xworkz.mvcapp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;

import com.xworkz.mvcapp.config.SpringConfiguration;
import com.xworkz.mvcapp.contoller.AmusementParkController;
import com.xworkz.mvcapp.dto.AmusementParkDTO;

public class SpringMvcTester {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfiguration.class);

		\
		AmusementParkController controller = context.getBean(AmusementParkController.class);

		AmusementParkDTO dto = context.getBean(AmusementParkDTO.class);
		AmusementParkDTO savedDTO = controller.process(dto);
		System.out.println(savedDTO);
	}

}
