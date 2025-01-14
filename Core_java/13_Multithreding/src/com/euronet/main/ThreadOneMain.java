package com.euronet.main;

import com.euronet.main.thread.ThreadOne;
import com.euronet.main.thread.ThreadTwo;

public class ThreadOneMain {

	public static void main(String[] args) {
		Thread.currentThread().setPriority(5);
		Thread mainThread = Thread.currentThread();
		System.out.println(mainThread);
		System.out.println("Main thread is creation child Thread");
		Thread thread = new ThreadOne();
		thread.start();
		System.out.println("Main thread is creating child thread two");
		Thread thread2 = new Thread(new ThreadTwo());
		thread2.start();
		for (int i = 0; i < 100; i++) {
			System.out.println("Main thread is running");
		}
			System.out.println("Main method end");
		
	}

}
