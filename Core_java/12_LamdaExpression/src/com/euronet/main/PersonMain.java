package com.euronet.main;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import com.euronet.main.domain.Condition;
import com.euronet.main.domain.EndingWithL;
import com.euronet.main.domain.Person;
import com.euronet.main.domain.PersonSortByLastName;

public class PersonMain {

	public static void main(String[] args) {
		List<Person> peopleslist = Arrays.asList(new Person("Vivek", "Gohil",
				32), new Person("Trupti", "Gohil", 35), new Person("Gurubux",
				"Gill", 30), new Person("Samarth", "Patil", 10));
		System.out.println("Before Sorting All Elements in List");
		System.out.println(peopleslist);
		System.out.println();

		// 1. Sort the List by last name
//		System.out.println("After Sorting All Elements in List");
//		Collections.sort(peopleslist, new PersonSortByLastName());
//		System.out.println();
//		System.out.println(peopleslist);
//		System.out.println();

		// 2.create a method to print all elements in list
//		System.out.println("Printing All Elements ");
//		printAllElements(peopleslist);
//		System.out.println();

		// 3.create a method to Printing Persons names starts with G
//		System.out.println("Printing Persons names starts with G");
//		printBiginningWithG(peopleslist);
//		System.out.println();

//		// 4.create a method to Printing Persons names ends with L
//		System.out.println("Printing Persons names Ends with l");
//		printEndingWithL(peopleslist);
		printConditionall(peopleslist, new EndingWithL());
		
	}

//	public static void printAllElements(List<Person> peopleslist) {
//		Iterator<Person> iterator = peopleslist.iterator();
//		while (iterator.hasNext()) {
//			System.out.println(iterator.next());
//		}
//	}

//	public static void printBiginningWithG(List<Person> peopleslist) {
//		Iterator<Person> iterator = peopleslist.iterator();
//		while (iterator.hasNext()) {
//			Person person = iterator.next();
//			if (person.getLastname().charAt(0) == 'G') {
//				System.out.println(person);
//			}
//		}
//	}
//
//	private static void printEndingWithL(List<Person> peopleslist) {
//		Iterator<Person> iterator = peopleslist.iterator();
//		while (iterator.hasNext()) {
//			Person person = iterator.next();
//			if (person.getLastname().endsWith("l")) {
//				System.out.println(person);
//			}
//		}
//
//	}
	private static  void printConditionall(List<Person> peopleslist,Condition condition) {
for (Person person : peopleslist) {
	if(condition.test(person)){
		System.out.println(person);
	}
}
	}
}
