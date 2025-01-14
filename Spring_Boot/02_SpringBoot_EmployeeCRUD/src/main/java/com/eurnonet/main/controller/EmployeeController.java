package com.eurnonet.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.eurnonet.main.domain.Employee;
import com.eurnonet.main.service.EmployeeServiceInterface;

@RestController
@RequestMapping("employeeapi")
public class EmployeeController {
	@Autowired
	private EmployeeServiceInterface employeeServiceInterface;

	// http://localhost:8181/employeeapi/employee/all

	@RequestMapping(value = "employee/all", method = RequestMethod.GET)
	public List<Employee> allEmployee() {
		return employeeServiceInterface.getAllEmployee();
	}

	@RequestMapping(value = "employee", method = RequestMethod.POST)
	public boolean addEmployee(@RequestBody Employee employee) {
		return employeeServiceInterface.addNewEmployee(employee);
	}

	@RequestMapping(value = "employee",method = RequestMethod.PUT)
	public boolean updateEmployee(@RequestBody Employee employee) {
		return employeeServiceInterface.updateEmployee(employee);
	}
	
	@RequestMapping(value = "employee/{employeeid}",method = RequestMethod.DELETE)
	public boolean deleteEmployee(@PathVariable  int  employeeid) {
		return employeeServiceInterface.deleteEmployeeByemployeeId(employeeid);
	}
	
	@RequestMapping(value = "employee/{employeeid}",method = RequestMethod.GET)
	public Employee getEmployeeByEmployeeId(@PathVariable  int  employeeid) {
		return employeeServiceInterface.getEmployeeByEmployeeId(employeeid);
	}
	
	
	
	
}
