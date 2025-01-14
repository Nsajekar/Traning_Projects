package com.euronet.main.domain;

public class Savings extends Account {
	private boolean isSalary;

	public Savings() {
		System.out.println("In default Constructor of Savings");
	}

	public Savings(int accountNumber, String name, double balance,
			boolean isSalary) {
		super(accountNumber, name, balance);
		this.isSalary = isSalary;
		System.out.println("In overloaded constructor of Saving");
	}

	public boolean isSalary() {
		return isSalary;
	}

	public void setSalary(boolean isSalary) {
		this.isSalary = isSalary;
	}

	@Override
	public String toString() {
		return "Savings [isSalary=" + isSalary + ", getAccountNumber()="
				+ getAccountNumber() + ", getName()=" + getName()
				+ ", getBalance()=" + getBalance() + "]";
	}

	@Override
	public boolean withdraw(double amount) {
		if (isSalary) {
			if (amount > 0 && getBalance() >= amount) {
				setBalance(getBalance() - amount);
				return true;
			}
		} else {
			if (amount > 0 && (getBalance() - amount >= 1500)) {
				setBalance(getBalance() - amount);
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean deposit(double amount) {
		if (amount > 0) {
			setBalance(getBalance() + amount);
			return true;
		} else {
			return false;
		}
	}
}
