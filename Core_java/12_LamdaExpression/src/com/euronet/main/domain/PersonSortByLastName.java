package com.euronet.main.domain;

import java.util.Comparator;

public class PersonSortByLastName implements Comparator<Person>{

	@Override
	public int compare(Person person1, Person person2) {
			return person1.getLastname().compareTo(person2.getLastname());
	}

	

}
