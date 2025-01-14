package com.euronet.main.domain;

import java.util.Arrays;

public class ProjectDetails {
	private int projectId;
	private String pname;
	private Employee[] employees;

	public ProjectDetails() {
	}

	public ProjectDetails(int projectId, String pname, Employee[] employees) {
		super();
		this.projectId = projectId;
		this.pname = pname;
		this.employees = employees;
	}

	public int getProjectId() {
		return projectId;
	}

	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public Employee[] getEmployees() {
		return employees;
	}

	public void setEmployees(Employee[] employees) {
		this.employees = employees;
	}

	@Override
	public String toString() {
		return "ProjectDetails [projectId=" + projectId + ", pname=" + pname
				+ ", employees=" + Arrays.toString(employees) + "]";
	}

}
