package com.euronet.main;

import com.euronet.main.thread.ThreadOne;
import com.euronet.main.thread.ThreadTwo;

public class ThreadJoinEnd {

	public static void main(String[] args) {
		System.out.println("Main Starts ");
		System.out.println("Main is creating child Thread - thread one");
		Thread threadOne =new ThreadOne();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
			threadOne.start();
			try {
				threadOne.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		System.out.println("Main is creating child Thread - thread Two");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Thread threadTwo =new Thread(new ThreadTwo());
			threadTwo.start();
			try {
				threadTwo.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		System.out.println( "Main Ends");
	}

}
