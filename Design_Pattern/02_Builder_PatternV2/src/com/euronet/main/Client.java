package com.euronet.main;

import java.time.LocalDate;

import com.euronet.main.builder.UserDetailsBuilder;
import com.euronet.main.domain.Address;
import com.euronet.main.domain.UserDetails;

public class Client {

	public static void main(String[] args) {
		LocalDate birthDate = LocalDate.of(2000, 02, 01);
		Address homeaddress = new Address("705/shivanjali chsl", "chandanwadi",
				"Thane", "400602", "Maharshtra");
		UserDetails details = UserDetailsBuilder.withFirstName("Nitesh")
				.withLastName("Sajekar").withBirthDate(birthDate)
				.withAddress(homeaddress).build();
		System.out.println(details);
	}

}
