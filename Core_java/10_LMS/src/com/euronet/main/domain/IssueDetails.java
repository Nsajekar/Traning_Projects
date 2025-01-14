package com.euronet.main.domain;

import java.time.LocalDate;
import java.util.Date;

public class IssueDetails {
private int issueid;
private BookDetails bookDetails;
private MemberDetails memberDetails;
private LocalDate issuedate;
private LocalDate returndate;
public IssueDetails() {
	// TODO Auto-generated constructor stub
}
public IssueDetails(int issueid, BookDetails bookDetails,
		MemberDetails memberDetails, LocalDate issuedate, LocalDate returndate) {
	super();
	this.issueid = issueid;
	this.bookDetails = bookDetails;
	this.memberDetails = memberDetails;
	this.issuedate = issuedate;
	this.returndate = returndate;
}
public int getIssueid() {
	return issueid;
}
public void setIssueid(int issueid) {
	this.issueid = issueid;
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
@Override
public String toString() {
	return "IssueDetails [issueid=" + issueid + ", bookDetails=" + bookDetails
			+ ", memberDetails=" + memberDetails + ", issuedate=" + issuedate
			+ ", returndate=" + returndate + "]";
}


}
