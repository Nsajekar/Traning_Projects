package com.euronet.main.thread;


import com.euronet.main.domain.Account;
public class WithdrawThread implements Runnable {
	private Account account =new Account();
	private double amount;

	public WithdrawThread(Account account, double amount) {
		super();
		this.account = account;
		this.amount = amount;
	}

	@Override
	public void run() {
		account.withdraw(amount);
	}

}
