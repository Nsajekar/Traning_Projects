package com.euronet.main;

import com.euronet.main.adaptor.Customer;
import com.euronet.main.adaptor.EmployeeClassAdapter;
import com.euronet.main.domain.Employee;

public class Clent {

	public static void main(String[] args) {
		Employee employee = new Employee("Nitesh", "Devloper", "Thane");
		EmployeeClassAdapter adapter = new EmployeeClassAdapter(employee);
		Customer customer = adapter;
		System.out.println("Name: " + customer.getName());
		System.out.println("Designation: " + customer.getDesignation());
		System.out.println("Address: " + customer.getAddresss());
	}

}
