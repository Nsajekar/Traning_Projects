package com.euronet.main.domain;

public abstract class Account {
	private int accountNumber;
	private String name;
	private double balance;

	public Account() {
		System.out.println("inside default constructor");
	}

	public Account(int accountNumber, String name, double balance) {
		System.out.println("Inside Overloaded Constrctor");
		this.accountNumber = accountNumber;
		this.name = name;
		this.balance = balance;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public boolean withdraw(double amount) {
		if (amount > 0 && balance >= amount) {
			balance  -=  amount;
			return true;
		} else {
			return false;
		}
	}

	public boolean deposit(double amount) {
		if (amount > 0) {
			balance +=  amount;
			return true;
		} else {
			return false;
		}
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		
		this.balance = balance;
	
	}

	@Override
	public String toString() {
		return "Account [accountNumber=" + accountNumber + ", name=" + name
				+ ", balance=" + balance + "]";
	}

}
