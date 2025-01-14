package com.euronet.main.domain;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class MemberDetails {

	private int memberCode;
	private String firstName;
	private String lastName;
	private String memberType;
	private int bookIssuedCount;

	public MemberDetails() {
		System.out.println("default constructor of MemberDetails ");
	}

	public MemberDetails(int memberCode, String firstName, String lastName,
			String memberType, int bookIssuedCount) {
		System.out.println("Overloaded costructor of MemberDetails");
		this.memberCode = memberCode;
		this.firstName = firstName;
		this.lastName = lastName;
		this.memberType = memberType;
		this.bookIssuedCount = bookIssuedCount;
	}

	public int getMemberCode() {
		System.out.println("getMemberCode method ");
		return memberCode;
	}

	public void setMemberCode(int memberCode) {
		System.out.println("setMemberCode method" + memberCode);
		this.memberCode = memberCode;
	}

	public String getFirstName() {
		System.out.println("getFirstName method");
		return firstName;
	}

	public void setFirstName(String firstName) {
		System.out.println("setFirstName method" + firstName);
		this.firstName = firstName;
	}

	public String getLastName() {
		System.out.println("getLastName method");
		return lastName;
	}

	public void setLastName(String lastName) {
		System.out.println("setLastName method" + lastName);
		this.lastName = lastName;
	}

	public String getMemberType() {
		System.out.println("getMemberType method");
		return memberType;
	}

	public void setMemberType(String memberType) {
		System.out.println("setMemberType method" + memberType);
		this.memberType = memberType;
	}

	public int getBookIssuedCount() {
		System.out.println("getBookIssuedCount method");
		return bookIssuedCount;
	}

	public void setBookIssuedCount(int bookIssuedCount) {
		System.out.println("setBookIssuedCount method" + bookIssuedCount);
		this.bookIssuedCount = bookIssuedCount;
	}

	@Override
	public String toString() {
		return "MemberDetails [memberCode=" + memberCode + ", firstName="
				+ firstName + ", lastName=" + lastName + ", memberType="
				+ memberType + ", bookIssuedCount=" + bookIssuedCount + "]";
	}

}
