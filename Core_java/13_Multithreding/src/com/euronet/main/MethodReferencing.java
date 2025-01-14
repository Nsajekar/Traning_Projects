package com.euronet.main;

public class MethodReferencing {

	public static void main(String[] args) {
		MethodReferencing.printMessage();
		Thread thread = new Thread(() -> {
			MethodReferencing.printMessage();
		});
		thread.start();

		Thread thread2 = new Thread(MethodReferencing::printMessage);
		thread2.start();
		MethodReferencing  methodReferencing =new MethodReferencing();
		Thread thread3 = new Thread(methodReferencing :: printMessage1);
		thread3.start();
	}

	private static void printMessage() {
		System.out.println("Lamda Expression is simple");
	}

	public void printMessage1() {
		System.out.println("Lamda non static ");
	}

}
