package com.euronet.main.builder;

import java.time.LocalDate;

import com.euronet.main.domain.Address;
import com.euronet.main.domain.User;
import com.euronet.main.dto.UserDto;

public interface UserDtoBuilder {
	public UserDtoBuilder withFirstName(String firstname);

	public UserDtoBuilder withLastName(String lastname);

	public UserDtoBuilder withBirthDate(LocalDate birthdate);

	public UserDtoBuilder withAddress(Address address);

	public UserDto build();

	public UserDto getUserDto();
}
