package com.euronet.main.domain;

import java.time.LocalDate;

public class BookIssueDetails {
	private int issueserialNumber;
	private LocalDate issuedate;
	private LocalDate returndate;
	private BookDetails bookDetails;
	private MemberDetails memberDetails;

	public BookIssueDetails() {
		// TODO Auto-generated constructor stub
	}

	public BookIssueDetails(int issueserialNumber, LocalDate issuedate,
			LocalDate returndate, BookDetails bookDetails,
			MemberDetails memberDetails) {
		super();
		this.issueserialNumber = issueserialNumber;
		this.issuedate = issuedate;
		this.returndate = returndate;
		this.bookDetails = bookDetails;
		this.memberDetails = memberDetails;
	}

	public int getIssueserialNumber() {
		return issueserialNumber;
	}

	public void setIssueserialNumber(int issueserialNumber) {
		this.issueserialNumber = issueserialNumber;
	}

	public LocalDate getIssuedate() {
		return issuedate;
	}

	public void setIssuedate(LocalDate issuedate) {
		this.issuedate = issuedate;
	}

	public LocalDate getReturndate() {
		return returndate;
	}

	public void setReturndate(LocalDate returndate) {
		this.returndate = returndate;
	}

	public BookDetails getBookDetails() {
		return bookDetails;
	}

	public void setBookDetails(BookDetails bookDetails) {
		this.bookDetails = bookDetails;
	}

	public MemberDetails getMemberDetails() {
		return memberDetails;
	}

	public void setMemberDetails(MemberDetails memberDetails) {
		this.memberDetails = memberDetails;
	}

	@Override
	public String toString() {
		return "BookIssueDetails [issueserialNumber=" + issueserialNumber
				+ ", issuedate=" + issuedate + ", returndate=" + returndate
				+ ", bookDetails=" + bookDetails + ", memberDetails="
				+ memberDetails + "]";
	}

}
