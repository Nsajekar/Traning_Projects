package com.euronet.main.util;

import com.euronet.main.domain.EmployeeDetails;

public class EmployeeUtil {

	public double calculateYearlySalary(EmployeeDetails employeeDetails) {
		double yearlysalary = 0;
		yearlysalary = employeeDetails.getMonthelySalary() * 12;
		return yearlysalary;
	}

	public double calculateAppraisal(EmployeeDetails employeeDetails) {
		double appraisal = 0;
		if (employeeDetails.getMonthelySalary() < 10000) {
			appraisal = 500;
		} else {
			appraisal = 1000;
		}
		return appraisal;
	}
}
