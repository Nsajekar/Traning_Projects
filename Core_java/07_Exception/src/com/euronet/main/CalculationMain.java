package com.euronet.main;

import com.euronet.main.domain.Calculations;

public class CalculationMain {

	public static void main(String[] args) {
		System.out.println("Main starts");
		Calculations calculations = new Calculations();
		calculations.accept();
		calculations.calculate();
		calculations.display();
		System.out.println("Main Ends");
	}

}
