package com.euronet.main;

import com.euronet.main.domain.Employee;
import com.euronet.main.exeption.InvalidEmployeeSalaryException;

public class EmployeeMain {

	public static void main(String[] args) {
		try {
			Employee employee = new Employee("Nitesh", 1, 0);
			System.out.println(employee);
		} catch (InvalidEmployeeSalaryException e) {
            System.out.println(e.getMessage());
		}
	}

}
