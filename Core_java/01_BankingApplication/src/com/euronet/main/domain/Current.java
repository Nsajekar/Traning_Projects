package com.euronet.main.domain;

public class Current extends Account {
	private double overdraftBalance;
	private double overdraftlimit ;

	public Current() {
		System.out.println("inside default constructor of current");
	}

	public Current(int accountNumber, String name, double balance,
			double overdraftBalance) {
		super(accountNumber, name, balance);
		this.overdraftBalance = overdraftBalance;
		overdraftlimit = overdraftBalance;
		System.out.println("inside parameterize constructor of current");
	}

	public double getOverdraftBalance() {
		return overdraftBalance;
	}

	public void setOverdraftBalance(double overdraftBalance) {
		this.overdraftBalance = overdraftBalance;
	}

	@Override
	public String toString() {
		return "Current [overdraftBalance=" + overdraftBalance
				+ ", getAccountNumber()=" + getAccountNumber() + ", getName()="
				+ getName() + ", getBalance()=" + getBalance() + "]";
	}

	@Override
	public boolean withdraw(double amount) {
		// if withdraw amount is less than balance
		if (amount <= getBalance()) {
			if (amount > 0) {
				setBalance(getBalance() - amount);
				return true;
			}//
		} else if (amount > getBalance()) {// add one condition to set limit on
											// withdraw from overfdraft
			if (amount > getBalance() + overdraftBalance) {
				return false;
			} else {
				amount = amount - getBalance();
				overdraftBalance = overdraftBalance - amount;
				setBalance(0);
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean deposit(double amount) {
		if (amount > 0 && overdraftBalance < overdraftlimit) {
           	if (overdraftBalance + amount < overdraftlimit) {
				overdraftBalance = overdraftBalance + amount;
				return true;
			} else {
				double addmoneyintooverdraft = overdraftlimit - overdraftBalance;
				overdraftBalance = overdraftBalance + addmoneyintooverdraft;
				double addmoneyintobankbalance = amount - addmoneyintooverdraft;
				setBalance(getBalance() + addmoneyintobankbalance);
				return true;
			}
		} else if (overdraftBalance == overdraftlimit) {
			setBalance(getBalance() + amount);
			return true;

		}

		return false;
	}

}
