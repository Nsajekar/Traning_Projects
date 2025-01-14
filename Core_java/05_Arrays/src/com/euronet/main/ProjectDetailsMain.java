package com.euronet.main;

import com.euronet.main.domain.Employee;
import com.euronet.main.domain.ProjectDetails;

public class ProjectDetailsMain {

	public static void main(String[] args) {

		ProjectDetails projectDetails = new ProjectDetails();
		// set methods
		projectDetails.setPname("Euronet_Banking_Services");
		projectDetails.setProjectId(01);
		Employee[] employees = new Employee[3];
		employees[0] = new Employee(01, "Nitesh", 22000);
		employees[1] = new Employee(02, "Ibrahim", 23000);
		employees[2] = new Employee(03, "Kiran", 24000);
		projectDetails.setEmployees(employees);
		// get methods
		System.out.println(projectDetails.getPname());
		System.out.println(projectDetails.getProjectId());
		Employee[] projectEmployees = projectDetails.getEmployees();
		for (int i = 0; i < projectEmployees.length; i++) {
			System.out.println(projectEmployees[i]);
		}

	}

}
