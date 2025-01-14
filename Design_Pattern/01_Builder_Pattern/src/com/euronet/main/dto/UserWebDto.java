package com.euronet.main.dto;

import com.euronet.main.domain.Address;

public class UserWebDto implements UserDto {
private String name;
private String address;
private String age;

public UserWebDto() {
	// TODO Auto-generated constructor stub
}

public UserWebDto(String name, String address, String age) {
	super();
	this.name = name;
	this.address = address;
	this.age = age;
}



public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getAddress() {
	return address;
}

public void setAddress(Address address) {
	
}

public String getAge() {
	return age;
}

public void setAge(String age) {
	this.age = age;
}

@Override
public String toString() {
	return "UserWebDto [name=" + name + ", address=" + address + ", age=" + age
			+ "]";
}





}
