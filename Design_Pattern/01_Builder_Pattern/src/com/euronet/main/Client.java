package com.euronet.main;

import java.time.LocalDate;

import com.euronet.main.builder.ConcreteUserWebDtoBuilder;
import com.euronet.main.builder.UserDtoBuilder;
import com.euronet.main.domain.Address;
import com.euronet.main.dto.UserDto;

public class Client {

	public static void main(String[] args) {
		UserDtoBuilder builder = new ConcreteUserWebDtoBuilder();
		Address address = new Address("705", "Chandanwadi", "Thane", "400602",
				"Maharshtra");
		LocalDate birthDate = LocalDate.of(2000, 02, 01);
		UserDto dto = builder.withFirstName("Nitesh").withLastName("Sajekar")
				.withBirthDate(birthDate).withAddress(address).build();
		System.out.println(dto);
	}

}
