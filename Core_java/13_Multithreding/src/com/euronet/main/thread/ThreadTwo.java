package com.euronet.main.thread;

public class ThreadTwo implements Runnable {

	@Override
	public void run() {
		Thread.currentThread().setPriority(5);
		Thread mainThread = Thread.currentThread();
		System.out.println(mainThread);
		for (int i = 0; i < 100; i++) {
			System.out.println(" thread 2 is running");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}


	}

}
