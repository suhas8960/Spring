package com.xworkz.devapp.address;

import com.xworkz.devapp.person.Person;

public class PersonTester {

	public static void main(String[] args) {

		Person person = new Person();
		person.setId(1);
		person.setName("Ganga");

		Address address = new Address();

		Country country = new Country();

		State state = new State();

		City city = new City();

		Area area = new Area();

		Street street = new Street();
		street.setStreeNo("No 64  , 6th main  , 7th cross");
		street.setStreetName("Maruthinagar");
         area.setAreaName("Nagarbhavi");
		area.setStreet(street);
		
		city.setCityName("Bangalore");
		city.setArea(area);
		
		state.setStateName("Karnataka");
		state.setCity(city);
		
		country.setCountryName("India");
		country.setState(state);
		address.setCountry(country);
		person.setAddress(address);

		System.out.println(person);

	}

}
