package com.euronet.main;

import com.euronet.main.domain.Address;
import com.euronet.main.domain.Employee;

public class Client {
	public static void main(String[] args) {
		Address homeaddress = new Address(1, "705", "Shivanjali CHSL",
				"Chandanwadi", "Thane", "400602");
		Employee employee = new Employee(1, "Nitesh", 20645, homeaddress);
		System.out.println(employee);
	
		Employee employee2 = null;
		try {
			 employee2 = (Employee) employee.clone();
			System.out.println(employee2);
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		System.out.println();
		System.out.println("After Changing in employee");
			employee.setName("Nitesh Sajekar");
			employee.getAddress().setBuildingname("Vasant lawns");
			System.out.println(employee);
			System.out.println(employee.hashCode());
			System.out.println(employee.getAddress().hashCode());
			System.out.println();
			System.out.println(employee2);
			System.out.println(employee2.hashCode());
			System.out.println(employee2.getAddress().hashCode());
//			Employee employee3;
//			try {
//				 employee3 = (Employee) employee.clone();
//				System.out.println(employee3);
//			} catch (CloneNotSupportedException e) {
//				e.printStackTrace();
//			}
	}
}
