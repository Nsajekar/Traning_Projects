package com.euronet.main.builder;

import java.time.LocalDate;
import java.time.Period;

import com.euronet.main.domain.Address;
import com.euronet.main.domain.UserDetails;

public class UserDetailsBuilder {
	private static String firstName;
	private static String lastName;
	private static String age;
	private static  String Address;
	//private static LocalDate birthDate;
	private static UserDetailsBuilder builder =new UserDetailsBuilder();; 

	public static UserDetailsBuilder withFirstName(String firstname) {
		firstName = firstname;
		return builder;
	}

	public static UserDetailsBuilder withLastName(String lastname) {
		lastName = lastname;
		return builder;
	}

	public static UserDetailsBuilder withBirthDate(LocalDate birthdate) {
		Period period = Period.between(birthdate, LocalDate.now());
		age = Integer.toString(period.getYears());
		return builder;
	}

	public UserDetailsBuilder withAddress(Address address) {
		Address = address.getHousenumber() + "" + address.getStreet() + ""
				+ address.getCity() + "" + address.getZipcode() + ""
				+ address.getState();
		return builder;
	}

	public static UserDetails build() {
		UserDetails userDetails = new UserDetails(firstName + " " + lastName,
				age, Address);
		return userDetails;

	}

}
