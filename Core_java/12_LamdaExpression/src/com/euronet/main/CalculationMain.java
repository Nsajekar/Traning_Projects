package com.euronet.main;

import com.euronet.main.domain.CalculateNum;

public class CalculationMain {

	public static void main(String[] args) {

		CalculateNum addition = (double numOne, double numTwo) -> {
			return numOne + numTwo;
		};
		double result = addition.docalculate(102, 103);
		System.out.println(result);
		printResult((n1, n2) -> {
			return n1 + n2;
		});
		printResult((n1, n2) -> {
			return n1 - n2;
		});
		printResult((n1, n2) -> {
			return n1 * n2;
		});
		printResult((n1, n2) -> {
			return n1 / n2;
		});
	}

	private static void printResult(CalculateNum calculateNum) {
		System.out.println("Prinnting Result : :"
				+ calculateNum.docalculate(10, 20));
	}

}
