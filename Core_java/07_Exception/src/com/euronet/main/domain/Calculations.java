package com.euronet.main.domain;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculations {
	private int number1;
	private int number2;
	private int result;

	public void accept() {
		try{
		System.out.println("in accept");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number 1:");
		number1 = scanner.nextInt();
		System.out.println("Enter number 2: ");
		number2 = scanner.nextInt();
		
		}catch (InputMismatchException IME){
			IME.getMessage();
			System.out.println("Please enetr only integer values");
		}
	}

	public void calculate() {
		System.out.println("inside calculate");
		result = number1 / number2;
	}

	public void display() {
		System.out.println("inside display");
		System.out.println("result :" + result);
	}
}
