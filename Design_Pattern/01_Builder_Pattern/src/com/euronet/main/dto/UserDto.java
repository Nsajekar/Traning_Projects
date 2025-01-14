package com.euronet.main.dto;

import com.euronet.main.domain.Address;

public interface UserDto {
	String getName();
	void setName(String name);

	String getAddress();
    void setAddress(Address address);
	
	String getAge();
	void setAge(String age);
}
