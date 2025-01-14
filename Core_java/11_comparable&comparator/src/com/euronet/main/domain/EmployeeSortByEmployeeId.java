package com.euronet.main.domain;

import java.util.Comparator;

public class EmployeeSortByEmployeeId implements Comparator<Empolyee> {

	@Override
	public int compare(Empolyee employee1, Empolyee employee2) {
		return -(employee1.getEmpid() - employee2.getEmpid());
	}

}
