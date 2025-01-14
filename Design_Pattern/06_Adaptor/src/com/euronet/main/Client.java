package com.euronet.main;

import com.euronet.main.adaptor.Customer;
import com.euronet.main.adaptor.EmployeeClassAdapter;
import com.euronet.main.domain.Employee;

public class Client {

	public static void main(String[] args) {
		// Employee employee =new Employee();
		// employee.setFullname("Nitesh");
		// employee.setJobtitle("Devloper");
		// employee.setOfficelocation("i-Think techno campus");
		//
		// EmployeeClassAdapter classAdapter =new
		// EmployeeClassAdapter(employee);
		// System.out.println(classAdapter.getName());
		// System.out.println(classAdapter.getDesignation());
		// System.out.println(classAdapter.getAddresss());
		// EmployeeClassAdapter adapter =new EmployeeClassAdapter();
		// populateData(adapter);
		// getCustomerDetails(adapter);

	}

	public static void getCustomerDetails(Customer customer) {
		System.out.println("Customer name: " + customer.getName());
		System.out.println("Customer Designation:" + customer.getDesignation());
		System.out.println("Customer Address:" + customer.getAddresss());
	}

	public static void populateData(Employee employee) {
		employee.setFullname("Nitesh");
		employee.setJobtitle("Devloper");
		employee.setOfficelocation("i-Think techno campus");
	}

}
