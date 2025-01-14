package com.euronet.main.service;

import java.util.List;
import java.util.Set;

import com.euronet.main.domain.Employee;

public interface EmployeeServiceInterface {
	public Employee addNewEmployee(Employee employee);

	public Employee updateEmployee(Employee employee);

	public Employee getEmployeeByEpmloyeeId(int employeeId);
	
	public boolean deleteEmployeeByEmployeeId(int employeeId);

	public Set<Employee>  allEmployees();
	public boolean isEmpty();
	
}
