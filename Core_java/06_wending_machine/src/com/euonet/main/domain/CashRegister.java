package com.euonet.main.domain;

public class CashRegister {
	private int register;
	private int cashOnHand;
	
	public CashRegister() {
	            this .register=500;
	}
	public CashRegister(int amount) {
		super();
		this.cashOnHand = amount;
	}
	public int getCurrentBalance() {
		return cashOnHand;
	}
	public void setCashOnHand(int cashOnHand) {
		this.cashOnHand = cashOnHand;
	}
	@Override
	public String toString() {
		return "CashRegister [cashOnHand=" + cashOnHand + "]";
	}
	
}
