package com.euronet.main.domain;

public class StaticDemo {
	static private int number1 = 10;
	static private int number2 = 10;

	public static  void  display() {
		System.out.println("number1 =" + number1 +'\n'+ "number2 =" + number2);
		number1++;
		number2++;
		System.out.println("number1 =" + number1 +'\n'+ "number2 =" + number2);

	}
}
