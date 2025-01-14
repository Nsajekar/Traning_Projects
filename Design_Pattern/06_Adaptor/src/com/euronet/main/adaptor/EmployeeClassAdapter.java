package com.euronet.main.adaptor;

import com.euronet.main.domain.Employee;

public class EmployeeClassAdapter extends Employee implements Customer {
	public EmployeeClassAdapter() {
	}

	public EmployeeClassAdapter(Employee employee) {
		this.setFullname(employee.getFullname());
		this.setJobtitle(employee.getJobtitle());
		this.setOfficelocation(employee.getOfficelocation());
	}
	@Override
	public String getName() {
		return getFullname();
	}

	@Override
	public String getDesignation() {
		return getJobtitle();
	}

	@Override
	public String getAddresss() {
		return getOfficelocation();
	}

}
