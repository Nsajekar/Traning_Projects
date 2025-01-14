package com.euronet.main.domain;

public class Call {
	public synchronized void message(String messages) {
		System.out.print("[  ");
		System.out.print(messages);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.print("  ]");
	}
}
