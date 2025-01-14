package com.eurnonet.main.service;

import java.util.List;

import com.eurnonet.main.domain.Employee;

public interface EmployeeServiceInterface {
	public boolean addNewEmployee(Employee employee);

	public boolean updateEmployee(Employee employee);

	public boolean deleteEmployeeByemployeeId(int employeeid);

	public Employee getEmployeeByEmployeeId(int employeeid);

	public List<Employee> getAllEmployee();
}
