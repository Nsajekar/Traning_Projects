package com.euronet.main.domain;

public class MemberDetails {
	private int membercode;
	private String firstname;
	private String lastname;
	private String membertype;
	private int bookissuecount;

	public MemberDetails() {
		System.out.println("Inside no-arg-cunstructor of MemberDetails");
	}

	public MemberDetails(int membercode, String firstname, String lastname,
			String membertype, int bookissuecount) {
		System.out.println("Inside arg-cunstructor of MemberDetails");

		this.membercode = membercode;
		this.firstname = firstname;
		this.lastname = lastname;
		this.membertype = membertype;
		this.bookissuecount = bookissuecount;
	}

	public int getMembercode() {
		System.out.println("Inside arg-cunstructor of MemberDetails");

		return membercode;
	}

	public void setMembercode(int membercode) {
		System.out.println("Inside arg-cunstructor of MemberDetails");

		this.membercode = membercode;
	}

	public String getFirstname() {
		System.out.println("Inside GETFIRSTNAME of MemberDetails");

		return firstname;
	}

	public void setFirstname(String firstname) {
		System.out.println("Inside SETFIRSTNAME of MemberDetails");

		this.firstname = firstname;
	}

	public String getLastname() {
		System.out.println("Inside GETLASTNAME of MemberDetails");

		return lastname;
	}

	public void setLastname(String lastname) {
		System.out.println("Inside SETLASTNAME of MemberDetails");

		this.lastname = lastname;
	}

	public String getMembertype() {
		System.out.println("Inside GETMEMBERTYPE of MemberDetails");

		return membertype;
	}

	public void setMembertype(String membertype) {
		System.out.println("Inside SETMEMBERTYPEr of MemberDetails");

		this.membertype = membertype;
	}

	public int getBookissuecount() {
		System.out.println("Inside GETBOOKISSUECOUNT of MemberDetails");

		return bookissuecount;
	}

	public void setBookissuecount(int bookissuecount) {
		System.out.println("Inside SETBOOKISSUECOUNT of MemberDetails");

		this.bookissuecount = bookissuecount;
	}

	@Override
	public String toString() {
		return "MemberDetails [membercode=" + membercode + ", firstname="
				+ firstname + ", lastname=" + lastname + ", membertype="
				+ membertype + ", bookissuecount=" + bookissuecount + "]";
	}

}
