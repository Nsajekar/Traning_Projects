package com.euronet.main.domain;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class BookIssueDetails {

	private int issueSerialNumber;
	private LocalDate issueDate;
	private LocalDate returnDate;
	@Autowired
	private BookDetails bookDetails;
	@Autowired
	private MemberDetails memberDetails;

	public BookIssueDetails() {
		System.out.println("Default constructor of BookIssueDetails");
	}

	public BookIssueDetails(int issueSerialNumber, LocalDate issueDate,
			LocalDate returnDate, BookDetails bookDetails,
			MemberDetails memberDetails) {
		System.out.println("Parameterized Constructor of BookIssueDetails");
		this.issueSerialNumber = issueSerialNumber;
		this.issueDate = issueDate;
		this.returnDate = returnDate;
		this.bookDetails = bookDetails;
		this.memberDetails = memberDetails;
	}

	public int getIssueSerialNumber() {
		System.out.println("getIssueSerialNumber method");
		return issueSerialNumber;
	}

	public void setIssueSerialNumber(int issueSerialNumber) {
		System.out.println("setIssueSerailNumber method" + issueSerialNumber);
		this.issueSerialNumber = issueSerialNumber;
	}

	public LocalDate getIssueDate() {
		System.out.println("getIssueDate method");
		return issueDate;
	}

	public void setIssueDate(LocalDate issueDate) {
		System.out.println("setIssueDate method" + issueDate);
		this.issueDate = issueDate;
	}

	public LocalDate getReturnDate() {
		System.out.println("getReturnDate method");
		return returnDate;
	}

	public void setReturnDate(LocalDate returnDate) {
		System.out.println("setReturnDate method" + returnDate);
		this.returnDate = returnDate;
	}

	public BookDetails getBookDetails() {
		System.out.println("getBookDetails method");
		return bookDetails;
	}

	public void setBookDetails(BookDetails bookDetails) {
		System.out.println("setBookDetails method" + bookDetails);
		this.bookDetails = bookDetails;
	}

	public MemberDetails getMemberDetails() {
		System.out.println("getMemberDetails method");
		return memberDetails;
	}

	public void setMemberDetails(MemberDetails memberDetails) {
		System.out.println("setMemberDetails " + memberDetails);
		this.memberDetails = memberDetails;
	}

	@Override
	public String toString() {
		return "BookIssueDetails [issueSerialNumber=" + issueSerialNumber
				+ ", issueDate=" + issueDate + ", returnDate=" + returnDate
				+ ", bookDetails=" + bookDetails + ", memberDetails="
				+ memberDetails + "]";
	}

}
