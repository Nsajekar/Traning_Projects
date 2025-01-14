package com.euronet.main.domain;

import java.time.LocalDate;

public class BookIssueDetails {
	private int issueserialNumber;
	private LocalDate issuedate;
	private LocalDate returndate;
	private BookDetails bookDetails;
	private MemberDetails memberDetails;

	public BookIssueDetails() {
System.out.println("inside no-arg cunstructor of BookIssueDetails");	
}

	public BookIssueDetails(BookDetails bookDetails,
			MemberDetails memberDetails) {
		super();
		System.out.println("inside arg cunstructor of BookIssueDetails");	

//		this.issueserialNumber = issueserialNumber;
//		this.issuedate = issuedate;
//		this.returndate = returndate;
		this.bookDetails = bookDetails;
		this.memberDetails = memberDetails;
	}

	public int getIssueserialNumber() {
		System.out.println("inside getissueserielid of method ");
		return issueserialNumber;
	}

	public void setIssueserialNumber(int issueserialNumber) {
		System.out.println("inside SETISSUESEREAL of method ");

		this.issueserialNumber = issueserialNumber;
	}

	public LocalDate getIssuedate() {
		System.out.println("inside GETISSUESEREAL of method ");

		return issuedate;
	}

	public void setIssuedate(LocalDate issuedate) {
		System.out.println("inside SETISSUEDATE of method ");

		this.issuedate = issuedate;
	}

	public LocalDate getReturndate() {
		System.out.println("inside GETRETURNDATE of method ");

		return returndate;
	}

	public void setReturndate(LocalDate returndate) {
		System.out.println("inside SETRETURNDATEof method ");

		this.returndate = returndate;
	}

	public BookDetails getBookDetails() {
		System.out.println("inside GETBOOKDETAILS of method ");

		return bookDetails;
	}

	public void setBookDetails(BookDetails bookDetails) {
		System.out.println("inside SETBOOKDETAILS of method ");

		this.bookDetails = bookDetails;
	}

	public MemberDetails getMemberDetails() {
		System.out.println("inside GETMEMBERDETAILS of method ");

		return memberDetails;
	}

	public void setMemberDetails(MemberDetails memberDetails) {
		System.out.println("inside SETMEMBERDETAILS of method ");

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
