package com.eurnonet.main.repository;

import java.util.List;

import com.eurnonet.main.domain.Employee;

public interface EmployeerepositoryInterface {

	public boolean addNewEmployee(Employee employee);

	public boolean updateEmployee(Employee employee);

	public boolean deleteEmployeeByemployeeId(int employeeid);

	public Employee getEmployeeByEmployeeId(int employeeid);

	public List<Employee> getAllEmployee();
}
