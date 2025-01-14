package com.euronet.main;

import com.euronet.main.domain.Employee;
import com.euronet.main.service.EmployeeService;
import com.euronet.main.service.EmployeeServiceInterface;

public class EmployeeMainV2 {

	public static void main(String[] args) {
		Employee employee = new Employee(1, "Nitesh", 20000);
		Employee employee1 = new Employee(1, "Nitesh", 20000);
		Employee employee2 = new Employee(1, "Ritesh", 20000);
		
		EmployeeServiceInterface employeeServiceInterface = new EmployeeService();
		employeeServiceInterface.addNewEmployee(employee);
		employeeServiceInterface.addNewEmployee(employee1);
		employeeServiceInterface.addNewEmployee(employee2);

		for (Employee existingEmployee : employeeServiceInterface
				.allEmployees()) {
			System.out.println(existingEmployee);
		}
	}

}
