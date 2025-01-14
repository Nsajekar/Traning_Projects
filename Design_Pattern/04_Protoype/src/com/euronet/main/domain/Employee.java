package com.euronet.main.domain;

public class Employee implements Cloneable {
	private int empid;
	private String name;
	private double salary;
	private Address address;

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(int empid, String name, double salary, Address address) {
		super();
		this.empid = empid;
		this.name = name;
		this.salary = salary;
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", name=" + name + ", salary="
				+ salary + ", address=" + address + "]";
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		Employee employee =(Employee)super.clone();
		employee.address = (Address)address.clone();
		return employee;
	}

}
