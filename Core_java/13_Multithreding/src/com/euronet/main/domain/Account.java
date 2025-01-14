package com.euronet.main.domain;

public class Account {
	private double balance ;
	public Account() {
		balance =10000;
	}
	

	public Account(double balance) {
		super();
		this.balance = balance;
	}
	


	@Override
	public String toString() {
		return "Account [balance=" + balance + "]";
	}


	public double getBalance() {
		return balance;
	}


	public void setBalance(double balance) {
		this.balance = balance;
	}


	public synchronized void withdraw(double amount) {
		System.out.println("Doing withdraw");
		System.out.println("Ba;nace : :"+ balance);

		if (balance < amount) {
			System.out.println("Low balance");
			System.out.println("Waiting for diposit");
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		balance = balance - amount;
		System.out.println("Withdraw completed");
		System.out.println("Balance : :"+ balance);

	}

	public synchronized void deposite(double amount) {
		System.out.println("Doing Deposit");
		System.out.println("Balance : :"+ balance);
		balance = balance + amount;
		System.out.println("Deposit Completed");
		System.out.println("After Balnace : :"+ balance);
		notify();

	}
}
