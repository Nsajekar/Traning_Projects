package com.euronet.main.domain;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class BookDetails {

	private int bookCode;
	private String title;
	private String author;
	private double price;
	private boolean isIssueable;

	public BookDetails() {
		System.out.println("Default Constructor of BookDetails");
	}

	public BookDetails(int bookCode, String title, String author, double price,
			boolean isIssueable) {
		System.out.println("Parameterized Constructor of BookDetails");

		this.bookCode = bookCode;
		this.title = title;
		this.author = author;
		this.price = price;
		this.isIssueable = isIssueable;
	}

	public int getBookCode() {
		System.out.println("getbookCode method");

		return bookCode;
	}

	public void setBookCode(int bookCode) {
		System.out.println("setbookCode method" + bookCode);
		this.bookCode = bookCode;
	}

	public String getTitle() {
		System.out.println("getTitle method");
		return title;
	}

	public void setTitle(String title) {
		System.out.println("setTitle method" + title);
		this.title = title;
	}

	public String getAuthor() {
		System.out.println("getAuthor method");
		return author;
	}

	public void setAuthor(String author) {
		System.out.println("setAuthor method " + author);
		this.author = author;
	}

	public double getPrice() {
		System.out.println("getPrice");
		return price;
	}

	public void setPrice(double price) {
		System.out.println("setPrice method" + price);
		this.price = price;
	}

	public boolean isIssueable() {
		System.out.println("getisIssueable method");
		return isIssueable;
	}

	public void setIssueable(boolean isIssueable) {
		System.out.println("setIssuable  method" + isIssueable);
		this.isIssueable = isIssueable;
	}

	@Override
	public String toString() {
		return "BookDetails [bookCode=" + bookCode + ", title=" + title
				+ ", author=" + author + ", price=" + price + ", isIssueable="
				+ isIssueable + "]";
	}

}
