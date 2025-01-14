package com.euronet.main.domain;

public class EndingWithL implements Condition {

	@Override
	public boolean test(Person person) {
		if(person.getLastname().endsWith("l")){
			return true;
		}
		return false;
	}

}
