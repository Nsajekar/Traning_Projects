package com.euronet.main.builder;

import java.time.LocalDate;
import java.time.Period;

import com.euronet.main.domain.Address;
import com.euronet.main.dto.UserDto;
import com.euronet.main.dto.UserWebDto;

public class ConcreteUserWebDtoBuilder implements UserDtoBuilder {
	private String firstName;
	private String lastName;
	private String age;
	private String Address;
	private UserWebDto userWebDto;

	@Override
	public UserDtoBuilder withFirstName(String firstname) {
		this.firstName = firstname;
		return this;
	}

	@Override
	public UserDtoBuilder withLastName(String lastname) {
		this.lastName = lastname;
		return this;
	}

	@Override
	public UserDtoBuilder withBirthDate(LocalDate birthdate) {
		Period ageinyears = Period.between(birthdate, LocalDate.now());
		String age = Integer.toString(ageinyears.getYears());
		this.age = age;
		return this;
	}

	@Override
	public UserDtoBuilder withAddress(Address address) {
		this.Address = address.getHousenumber() + "" + address.getStreet() + ""
				+ address.getCity()+""+ address.getZipcode() +  ""
				+ address.getState();
		return this;
	}

	@Override
	public UserDto build() {
		userWebDto = new UserWebDto(firstName + " "+lastName, Address, age);
		return userWebDto;
	}

	@Override
	public UserDto getUserDto() {
		
		return null;
	}

}
