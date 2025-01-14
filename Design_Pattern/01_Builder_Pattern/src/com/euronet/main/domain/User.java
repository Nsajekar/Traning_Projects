package com.euronet.main.domain;

import java.time.LocalDate;

public class User {
	private String firstname;
	private String lastname;
	private LocalDate birthdate;
	private Address hameAddress;

	public User() {
		// TODO Auto-generated constructor stub
	}

	public User(String firstname, String lastname, LocalDate birthdate,
			Address hameAddress) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.birthdate = birthdate;
		this.hameAddress = hameAddress;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public LocalDate getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(LocalDate birthdate) {
		this.birthdate = birthdate;
	}

	public Address getHameAddress() {
		return hameAddress;
	}

	public void setHameAddress(Address hameAddress) {
		this.hameAddress = hameAddress;
	}

	@Override
	public String toString() {
		return "User [firstname=" + firstname + ", lastname=" + lastname
				+ ", birthdate=" + birthdate + ", hameAddress=" + hameAddress
				+ "]";
	}

}
