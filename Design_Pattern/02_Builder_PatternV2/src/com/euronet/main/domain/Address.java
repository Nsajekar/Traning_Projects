package com.euronet.main.domain;

public class Address {
	private String housenumber;
	private String street;
	private String city;
	private String zipcode;
	private String state;

	public Address() {
	}

	public Address(String housenumber, String street, String city,
			String zipcode, String state) {
		super();
		this.housenumber = housenumber;
		this.street = street;
		this.city = city;
		this.zipcode = zipcode;
		this.state = state;
	}

	public String getHousenumber() {
		return housenumber;
	}

	public void setHousenumber(String housenumber) {
		this.housenumber = housenumber;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Override
	public String toString() {
		return "Address [housenumber=" + housenumber + ", street=" + street
				+ ", city=" + city + ", zipcode=" + zipcode + ", state="
				+ state + "]";
	}

}
