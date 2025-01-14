package com.euronet.main.domain;

public class BookDetails {
private int bookid;
private String bookname;
private String authername;
private String status;
public BookDetails() {
	// TODO Auto-generated constructor stub
}
public BookDetails(int bookid, String bookname, String authername, String status) {
	super();
	this.bookid = bookid;
	this.bookname = bookname;
	this.authername = authername;
	this.status = status;
}
public int getBookid() {
	return bookid;
}
public void setBookid(int bookid) {
	this.bookid = bookid;
}
public String getBookname() {
	return bookname;
}
public void setBookname(String bookname) {
	this.bookname = bookname;
}
public String getAuthername() {
	return authername;
}
public void setAuthername(String authername) {
	this.authername = authername;
}
public String getStatus() {
	return status;
}
public void setStatus(String status) {
	this.status = status;
}
@Override
public String toString() {
	return "BookDetails [bookid=" + bookid + ", bookname=" + bookname
			+ ", authername=" + authername + ", status=" + status + "]";
}

}
