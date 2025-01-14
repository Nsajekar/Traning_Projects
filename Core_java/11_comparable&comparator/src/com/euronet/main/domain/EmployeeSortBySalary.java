package com.euronet.main.domain;

import java.util.Comparator;

public class EmployeeSortBySalary implements Comparator<Empolyee> {

	@Override
	public int compare(Empolyee employee1, Empolyee employee2) {
		return -(int)(employee1.getSalary() - employee2.getSalary());
	}

}
