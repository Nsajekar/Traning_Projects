package com.euronet.main.thread;


import com.euronet.main.domain.Account;
public class DepositeThread implements Runnable {
	private Account account =new Account();
	private double amount;

	public DepositeThread(Account account, double amount) {
		super();
		this.account = account;
		this.amount = amount;
	}

	@Override
	public void run() {
		account.deposite(amount);;
	}

}
