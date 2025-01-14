package com.euronet.main.domain;

public class Catagory {
	private int catagoryid;
	private String catagoryname;

	public Catagory() {
	}

	public Catagory(int catagoryid, String catagoryname) {
		super();
		this.catagoryid = catagoryid;
		this.catagoryname = catagoryname;
	}

	public int getCatagoryid() {
		return catagoryid;
	}

	public void setCatagoryid(int catagoryid) {
		this.catagoryid = catagoryid;
	}

	public String getCatagoryname() {
		return catagoryname;
	}

	public void setCatagoryname(String catagoryname) {
		this.catagoryname = catagoryname;
	}

	@Override
	public String toString() {
		return "Catagory [catagoryid=" + catagoryid + ", catagoryname="
				+ catagoryname + "]";
	}

}
