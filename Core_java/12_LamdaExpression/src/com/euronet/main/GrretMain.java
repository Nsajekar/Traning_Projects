package com.euronet.main;

import com.euronet.main.domain.GoodAfterNoon;
import com.euronet.main.domain.GoodMorningGreeting;
import com.euronet.main.domain.Greet;

public class GrretMain {

	public static void main(String[] args) {
		// Greet greet = new GoodMorningGreeting();
		// greet.doGreet();
		// Greet greet2 =new GoodAfterNoon();
		// greet2.doGreet();
		// Greet x = () -> {
		// System.out.println("Good Night");
		// };
		// x.doGreet();
		Greet x = () -> System.out.println("Good Night");
		x.doGreet();

	}

}
