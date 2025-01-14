package com.eurnonet.main.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.eurnonet.main.domain.Employee;

@Repository
public class EmployeeRepository implements EmployeerepositoryInterface {
	private List<Employee> employeeList = new ArrayList();

	public EmployeeRepository() {
		employeeList.add(new Employee(101, "Pravin", 1000));
		employeeList.add(new Employee(102, "Pranali", 1000));
		employeeList.add(new Employee(103, "Mandar", 1000));
		employeeList.add(new Employee(104, "Ibrahim", 1000));
	}

	public boolean addNewEmployee(Employee employee) {
		return employeeList.add(employee);

	}

	public boolean updateEmployee(Employee employee) {
		for (Employee existingEmployee : employeeList) {
			if (employee.getEmployeeId() == existingEmployee.getEmployeeId()) {
				existingEmployee.setName(employee.getName());
				existingEmployee.setSalary(employee.getSalary());
				return true;
			}
		}
		return false;
	}

	public boolean deleteEmployeeByemployeeId(int employeeid) {
		for (Employee existingEmployee : employeeList) {
			if (existingEmployee.getEmployeeId() == employeeid) {
				employeeList.remove(existingEmployee);
				return true;
			}
		}
		return false;
	}

	public Employee getEmployeeByEmployeeId(int employeeid) {
		for (Employee existingEmployee : employeeList) {
			if (existingEmployee.getEmployeeId() == employeeid) {
				return existingEmployee;
			}
		}
		return null;
	}

	public List<Employee> getAllEmployee() {
		return employeeList;
	}

}
