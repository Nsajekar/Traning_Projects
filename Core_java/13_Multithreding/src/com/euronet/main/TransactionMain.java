package com.euronet.main;

import com.euronet.main.domain.Account;
import com.euronet.main.thread.DepositeThread;
import com.euronet.main.thread.WithdrawThread;

public class TransactionMain {

	public static void main(String[] args) {
		Account account = new Account();
		
		
		
		Runnable withdraw = ()-> {account.withdraw(20000);};
		Runnable deposite = ()-> {account.deposite(30000);;};
		
		Thread withdrawthread = new Thread(withdraw);
		withdrawthread.start();
		
		Thread depositethread = new Thread(deposite);
		depositethread.start();
	}
	
	
}
