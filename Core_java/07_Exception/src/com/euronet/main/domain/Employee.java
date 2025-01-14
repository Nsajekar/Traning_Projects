package com.euronet.main.domain;

import com.euronet.main.exeption.InvalidEmployeeSalaryException;

public class Employee {
	private String name;
	private int empNO;
	private int salary;

	public Employee() {
	}

	public Employee(String name, int empNO, int salary)
			throws InvalidEmployeeSalaryException {

		this.name = name;
		this.empNO = empNO;
		if (salary > 0) {
			this.salary = salary;
		} else {
			this.salary = 1000;
			throw new InvalidEmployeeSalaryException("Salary cannot be  -ve ");
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getEmpNO() {
		return empNO;
	}

	public void setEmpNO(int empNO) {
		this.empNO = empNO;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) throws InvalidEmployeeSalaryException {
		if(salary>0){
			this.salary = salary;
			}else{
				this.salary=1000;
				throw new InvalidEmployeeSalaryException("Salary cannot be  -ve ");
			}
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", empNO=" + empNO + ", salary="
				+ salary + "]";
	}

}
