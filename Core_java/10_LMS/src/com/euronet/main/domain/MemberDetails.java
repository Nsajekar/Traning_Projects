package com.euronet.main.domain;

public class MemberDetails {
	private int menberid;
	private String firstname;
	private String lastname;
	private String membertype;

	public MemberDetails() {
		// TODO Auto-generated constructor stub
	}

	public MemberDetails(int menberid, String firstname, String lastname,
			String membertype) {
		super();
		this.menberid = menberid;
		this.firstname = firstname;
		this.lastname = lastname;
		this.membertype = membertype;
	}

	public int getMenberid() {
		return menberid;
	}

	public void setMenberid(int menberid) {
		this.menberid = menberid;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getMembertype() {
		return membertype;
	}

	public void setMembertype(String membertype) {
		this.membertype = membertype;
	}

	@Override
	public String toString() {
		return "MemberDetails [menberid=" + menberid + ", firstname="
				+ firstname + ", lastname=" + lastname + ", membertype="
				+ membertype + "]";
	}

}
