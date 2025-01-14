package com.euronet.main;

import java.util.Arrays;

public class StreamReduced {
	public static void main(String[] args) {
		int[] arrayofnumbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int sum = 0;
		for (int i = 0; i < arrayofnumbers.length; i++) {
			sum +=  arrayofnumbers[i];
		}
		System.out.println(sum);
		
		int total =Arrays.stream(arrayofnumbers).reduce(0, (a,b) -> {return a+b;});
		System.out.println(total);
	}
}
