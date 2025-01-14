package com.euronet.main.adaptor;

import com.euronet.main.domain.Employee;

public class EmployeeClassAdapter implements Customer {
	private Employee employee;

	public EmployeeClassAdapter() {
	}

	public EmployeeClassAdapter(Employee employee) {
		this.employee = employee;
	}

	// public EmployeeClassAdapter(Employee employee) {
	// this.setFullname(employee.getFullname());
	// this.setJobtitle(employee.getJobtitle());
	// this.setOfficelocation(employee.getOfficelocation());
	// }
	@Override
	public String getName() {
		return employee.getFullname();
	}

	@Override
	public String getDesignation() {
		return employee.getJobtitle();
	}

	@Override
	public String getAddresss() {
		return employee.getOfficelocation();
	}

}
