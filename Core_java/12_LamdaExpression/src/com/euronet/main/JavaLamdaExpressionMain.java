package com.euronet.main;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;

import com.euronet.main.domain.Condition;
import com.euronet.main.domain.Person;

public class JavaLamdaExpressionMain {

	public static void main(String[] args) {
		List<Person> peopleslist = Arrays.asList(new Person("Vivek", "Gohil",
				32), new Person("Trupti", "Gohil", 35), new Person("Gurubux",
				"Gill", 30), new Person("Samarth", "Patil", 10));
		System.out.println("Before Sorting All Elements in List");
		for (Person person : peopleslist) {
			System.out.println(person);
		}
		System.out.println();

//		Collections.sort(peopleslist, (p1, p2) -> {
//			return p1.getLastname().compareTo(p2.getLastname());
//		});
//		System.out.println();
//		System.out.println("Printing all List");
//		printAll(peopleslist);
		System.out.println("Persons lastname starting with G");
		Condition condition =(p)->{return p.getLastname().startsWith("G");};
		JavaLamdaExpressionMain.printConditionally(peopleslist, condition,(c)-> {System.out.println(c.getLastname());});
		System.out.println();
		JavaLamdaExpressionMain.printConditionally(peopleslist, condition,(c)-> {System.out.println(c.getFirstname()+"  "+c.getLastname());});
		System.out.println();
		JavaLamdaExpressionMain.printConditionally(peopleslist, condition,(c)-> {System.out.println(c);});

		
		
		
		
//		System.out.println("Persons lastname Ends  with L");
//		Condition condition1 =(p)->{return p.getLastname().endsWith("l");};
//		JavaLamdaExpressionMain.printConditionally(peopleslist, condition1);
		
		
	}

	public static void printAll(List<Person> personlist) {
		for (Person person : personlist) {
			System.out.println(person);
		}
	}
	
	private static void printConditionally(List<Person>personlist,Condition condition,Consumer<Person> consumer){
		for (Person person : personlist) {
			if(condition.test(person)){
				consumer.accept(person);
			}
		}
	}

}
