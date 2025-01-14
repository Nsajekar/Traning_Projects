package com.euronet.main.domain;

import java.util.Comparator;

public class EmployeesortByName implements Comparator<Empolyee> {

	@Override
	public int compare(Empolyee employee1, Empolyee employee2) {
		return -(employee1.getName().compareTo(employee2.getName()));
	}

}
