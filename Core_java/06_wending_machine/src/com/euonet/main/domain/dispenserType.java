package com.euonet.main.domain;

public class dispenserType {
	// private String productName;
	private int numberOfItems;
	private int cost;

	public dispenserType() {
		this.numberOfItems = 50;
		this.cost = 50;
	}

	public dispenserType(int numberOfItems, int cost) {
		super();
		this.numberOfItems = numberOfItems;
		this.cost = cost;
	}

	public int getNumberOfItems() {
		return numberOfItems;
	}

	public void setNumberOfItems(int numberOfItems) {
		this.numberOfItems = numberOfItems;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}
   
	 public void makeSale() {
		 numberOfItems =numberOfItems-1;
	}
}
