package com.euronet.main.service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.euronet.main.domain.Employee;

public class EmployeeService implements EmployeeServiceInterface {
	private Set<Employee> employeeList = new HashSet<Employee>();

	@Override
	public Employee addNewEmployee(Employee employee) {

		boolean result = employeeList.add(employee);

		if (result) {
			return employee;
		}
		return null;
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		for (Employee existingEmployee : employeeList) {
			if (existingEmployee.getEmpId() == employee.getEmpId()) {
				existingEmployee.setName(employee.getName());
				existingEmployee.setSalary(employee.getSalary());
				return employee;
			}
		}
		return null;
	}

	@Override
	public Employee getEmployeeByEpmloyeeId(int employeeId) {
		for (Employee existingEmployee : employeeList) {
			if (existingEmployee.getEmpId() == employeeId) {
				return existingEmployee;
			}
		}
		return null;
	}

	@Override
	public boolean deleteEmployeeByEmployeeId(int employeeId) {
		for (Employee existingEmployee : employeeList) {
			if (existingEmployee.getEmpId() == employeeId) {
				boolean result = employeeList.remove(existingEmployee);
				System.out.println("Delete Result :: " + result);
				return result;
			}
		}
		return false;
	}

	@Override
	public Set<Employee> allEmployees() {
		return employeeList;
	}

	public boolean isEmpty() {
		if (employeeList.isEmpty()) {
			return false;
		}
		return true;
	}

}
