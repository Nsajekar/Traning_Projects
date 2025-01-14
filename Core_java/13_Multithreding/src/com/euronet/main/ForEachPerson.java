package com.euronet.main;

import java.util.Arrays;
import java.util.List;

import com.euronet.main.domain.Person;

public class ForEachPerson {
	public static void main(String[] args) {
		List<Person> peopleslist = Arrays.asList(new Person("Vivek", "Gohil",
				32), new Person("Trupti", "Gohil", 35), new Person("Gurubux",
				"Gill", 30), new Person("Samarth", "Patil", 10));

		for (Person person : peopleslist) {
			System.out.println(person);
		}

		peopleslist.forEach((p) -> {
			System.out.println(p);
		});
	}

}
