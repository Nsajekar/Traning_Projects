package com.euronet.main;

import java.util.Scanner;

import com.euronet.main.domain.Employee;
import com.euronet.main.service.EmployeeService;
import com.euronet.main.service.EmployeeServiceInterface;

public class EmployeeMainV3 {

	public static void main(String[] args) {
		Employee employee;
		boolean result;
		int choice;
		EmployeeServiceInterface employeeServiceInterface = new EmployeeService();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Welcome to Employee Portal");
		do {
			System.out.println("Menu");
			System.out.println("1: Add_Employee");
			System.out.println("2: Update_Employee");
			System.out.println("3: Delete_Employee");
			System.out.println("4: Get_Single_Employee");
			System.out.println("5: Get_All_Employee");
			choice = scanner.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter Employee id: ");
				int empid = scanner.nextInt();
				
				System.out.println("Enter Employee Name: ");
				String name = scanner.next();
				System.out.println("Enter Employee salary: ");
				int salary = scanner.nextInt();
				 employee = new Employee(empid, name, salary);
				employeeServiceInterface.addNewEmployee(employee);
				System.out.println("Employee Added Succesfully...");
				break;
			case 2:

				if (employeeServiceInterface.isEmpty()) {
					System.out.println("Enter Employee id to Update");
					int existingId = scanner.nextInt();
					System.out.println("Enter Employee Name: ");
					String newName = scanner.next();
					System.out.println("Enter Employee salary: ");
					int newSalary = scanner.nextInt();//remove old employee object first---[ToDo]
					 employee = new Employee(existingId, newName, newSalary);
					employeeServiceInterface.updateEmployee(employee);
					System.out.println("Employee Upadated Succesfully...");
					break;
				} else {
					System.out.println("Update Not Possible first Add Employees");
					break;
				}

			case 3:
				if (employeeServiceInterface.isEmpty()) {
					System.out.println("Enter Employee_id to delete");
					int idtodelete = scanner.nextInt();
					boolean value = employeeServiceInterface
							.deleteEmployeeByEmployeeId(idtodelete);
					if(value){
						System.out.println("Delete is complete...");
						}else{
							System.out.println("Delete Not Complete...");
						}
					break;
				} else {
					System.out.println("Delete Not Possible first Add Employees");
					break;
				}
			case 4:
				if (employeeServiceInterface.isEmpty()) {
					System.out.println("Enter id to retrive");
					int idtoretrive = scanner.nextInt();
					System.out.println("Showing Result...");
					System.out.println(employeeServiceInterface.getEmployeeByEpmloyeeId(idtoretrive));
					break;
				} else {
					System.out
							.println("Employee Not Available");
					break;
				}
			case 5:
				System.out.println("Showing All Employees....");
				for (Employee existingEmployeestring : employeeServiceInterface
						.allEmployees()) {
					System.out.println(existingEmployeestring);
				}

				break;

			default:
				System.out.println("Invalid Choice");
				break;
			}

			System.out.println("Do you want to continue yes/No : true/false");
			result = scanner.nextBoolean();
		} while (result);
		scanner.close();
		System.out.println("Thank You");
	}

}
