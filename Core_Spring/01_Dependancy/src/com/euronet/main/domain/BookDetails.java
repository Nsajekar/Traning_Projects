package com.euronet.main.domain;

public class BookDetails {
	private int bookcode;
	private String title;
	private String auther;
	private double price;
	private boolean isIssuable;

	public BookDetails() {
		// TODO Auto-generated constructor stub
	}

	public BookDetails(int bookcode, String title, String auther, double price,
			boolean isIssuable) {
		super();
		this.bookcode = bookcode;
		this.title = title;
		this.auther = auther;
		this.price = price;
		this.isIssuable = isIssuable;
	}

	public int getBookcode() {
		return bookcode;
	}

	public void setBookcode(int bookcode) {
		this.bookcode = bookcode;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuther() {
		return auther;
	}

	public void setAuther(String auther) {
		this.auther = auther;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public boolean isIssuable() {
		return isIssuable;
	}

	public void setIssuable(boolean isIssuable) {
		this.isIssuable = isIssuable;
	}

	@Override
	public String toString() {
		return "BookDetails [bookcode=" + bookcode + ", title=" + title
				+ ", auther=" + auther + ", price=" + price + ", isIssuable="
				+ isIssuable + "]";
	}

}
