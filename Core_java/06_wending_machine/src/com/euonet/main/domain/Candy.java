package com.euonet.main.domain;

public class Candy implements Product {
	private String name = "Candy";
	private int price = 20;

	@Override
	public String getName() {
		return name;
	}

	@Override
	public int getprice() {
		return price;
	}

}
