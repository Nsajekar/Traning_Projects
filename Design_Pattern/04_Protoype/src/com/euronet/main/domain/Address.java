package com.euronet.main.domain;

public class Address implements Cloneable {
private int id;
private String housenumber;
private String buildingname;
private String street;
private String city;
private String pincode;

public Address() {
	// TODO Auto-generated constructor stub
}
public Address(int id, String housenumber, String buildingname, String street,
		String city, String pincode) {
	super();
	this.id = id;
	this.housenumber = housenumber;
	this.buildingname = buildingname;
	this.street = street;
	this.city = city;
	this.pincode = pincode;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getHousenumber() {
	return housenumber;
}
public void setHousenumber(String housenumber) {
	this.housenumber = housenumber;
}
public String getBuildingname() {
	return buildingname;
}
public void setBuildingname(String buildingname) {
	this.buildingname = buildingname;
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
public String getPincode() {
	return pincode;
}
public void setPincode(String pincode) {
	this.pincode = pincode;
}
@Override
public String toString() {
	return "Address [id=" + id + ", housenumber=" + housenumber
			+ ", buildingname=" + buildingname + ", street=" + street
			+ ", city=" + city + ", pincode=" + pincode + "]";
}
@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

}
