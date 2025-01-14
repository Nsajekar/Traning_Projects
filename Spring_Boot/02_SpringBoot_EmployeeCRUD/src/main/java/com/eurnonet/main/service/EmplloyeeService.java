package com.eurnonet.main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eurnonet.main.domain.Employee;
import com.eurnonet.main.repository.EmployeerepositoryInterface;

@Service
public class EmplloyeeService implements EmployeeServiceInterface {
	@Autowired
	private EmployeerepositoryInterface employeerepositoryInterface;

	public boolean addNewEmployee(Employee employee) {
		return employeerepositoryInterface.addNewEmployee(employee);
	}

	public boolean updateEmployee(Employee employee) {
		return employeerepositoryInterface.updateEmployee(employee);
	}

	public boolean deleteEmployeeByemployeeId(int employeeid) {
		return employeerepositoryInterface
				.deleteEmployeeByemployeeId(employeeid);
	}

	public Employee getEmployeeByEmployeeId(int employeeid) {
		return employeerepositoryInterface.getEmployeeByEmployeeId(employeeid);
	}

	public List<Employee> getAllEmployee() {
		return employeerepositoryInterface.getAllEmployee();
	}

}
