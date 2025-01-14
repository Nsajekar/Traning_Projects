package com.euronet.main.domain;

public class Employee {
private String fullname;
private String jobtitle;
private String officelocation;
public Employee() {
	// TODO Auto-generated constructor stub
}
public Employee(String fullname, String jobtitle, String officelocation) {
	super();
	this.fullname = fullname;
	this.jobtitle = jobtitle;
	this.officelocation = officelocation;
}
public String getFullname() {
	return fullname;
}
public void setFullname(String fullname) {
	this.fullname = fullname;
}
public String getJobtitle() {
	return jobtitle;
}
public void setJobtitle(String jobtitle) {
	this.jobtitle = jobtitle;
}
public String getOfficelocation() {
	return officelocation;
}
public void setOfficelocation(String officelocation) {
	this.officelocation = officelocation;
}
@Override
public String toString() {
	return "Employee [fullname=" + fullname + ", jobtitle=" + jobtitle
			+ ", officelocation=" + officelocation + "]";
}

}
