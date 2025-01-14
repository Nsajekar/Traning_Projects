package com.euronet.main.domain;

public class EmployeeDetails {
	private String name;
	private double monthelySalary;
	private int age;

	public EmployeeDetails() {
		// TODO Auto-generated constructor stub
	}

	public EmployeeDetails(String name, double monthelySalary, int age) {
		super();
		this.name = name;
		this.monthelySalary = monthelySalary;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getMonthelySalary() {
		return monthelySalary;
	}

	public void setMonthelySalary(double monthelySalary) {
		this.monthelySalary = monthelySalary;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "EmployeeDetails [name=" + name + ", monthelySalary="
				+ monthelySalary + ", age=" + age + "]";
	}
	
}
