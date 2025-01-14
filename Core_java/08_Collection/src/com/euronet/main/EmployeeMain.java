package com.euronet.main;

import com.euronet.main.domain.Employee;
import com.euronet.main.service.EmployeeService;
import com.euronet.main.service.EmployeeServiceInterface;

public class EmployeeMain {

	public static void main(String[] args) {
		EmployeeServiceInterface employeeServiceInterface = new EmployeeService();
		Employee employee = new Employee(1, "A", 20000);
		Employee employee2 = new Employee(2, "B", 20000);
		Employee employee3 = new Employee(3, "C", 20000);
		Employee employee4 = new Employee(4, "D", 20000);
		
	  employeeServiceInterface.addNewEmployee(employee);
		employeeServiceInterface.addNewEmployee(employee2);
		employeeServiceInterface.addNewEmployee(employee3);
		employeeServiceInterface.addNewEmployee(employee4);
		System.out.println();
		
		System.out.println("Printing Before Updated and after creating");
		for (Employee empolyee : employeeServiceInterface.allEmployees()) {
			System.out.println(empolyee);
		}
		System.out.println();

		Employee updatedEmployee = new Employee(3, "Z", 25000);
		employeeServiceInterface.updateEmployee(updatedEmployee);

		System.out.println("Printing After updating");
		for (Employee empolyee : employeeServiceInterface.allEmployees()) {
			System.out.println(empolyee);
		}
		System.out.println();
		System.out.println("Getting employee by id");
		System.out.println(employeeServiceInterface.getEmployeeByEpmloyeeId(3));
		System.out.println();
		System.out.println("Deleting Employee......");
		boolean result = employeeServiceInterface.deleteEmployeeByEmployeeId(2);
		System.out.println("After Deleing Employee");
		for (Employee empolyee : employeeServiceInterface.allEmployees()) {
			System.out.println(empolyee);
		}

	}
}
