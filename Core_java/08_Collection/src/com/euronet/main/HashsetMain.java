package com.euronet.main;

import java.util.HashSet;
import java.util.Set;

public class HashsetMain {

	public static void main(String[] args) {
		Set<String> nameSet = new HashSet<>();
		nameSet.add("Mayur");
		nameSet.add("Mandar");
		nameSet.add("Nitesh");
		nameSet.add("ibrahim");
		nameSet.add("Pranali");
		nameSet.add("Nitesh");
		System.out.println(nameSet);
		nameSet.remove("Nitesh");
		System.out.println(nameSet);
	}

}
