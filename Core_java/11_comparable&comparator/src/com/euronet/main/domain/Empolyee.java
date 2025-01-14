package com.euronet.main.domain;

import com.euronet.main.EmployeeSortArrayList;

public class Empolyee implements Comparable<Empolyee>{
	private int empid;
	private String name;
	private double salary;

	public Empolyee() {
	}

	public Empolyee(int empid, String name, double salary) {
		super();
		this.empid = empid;
		this.name = name;
		this.salary = salary;
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

	@Override
	public String toString() {
		return "Empolyee [empid=" + empid + ", name=" + name + ", salary="
				+ salary + "]";
	}

	@Override
	public int compareTo(Empolyee empolyee) {
		return name.compareTo(empolyee.getName());
	}

}
