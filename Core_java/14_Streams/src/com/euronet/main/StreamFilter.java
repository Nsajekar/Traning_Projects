package com.euronet.main;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;


public class StreamFilter {
public static void main(String[] args) {
	List<String> names = Arrays.asList("Vivek","Bahubali","Trupti","Samrath","Aditi");
	System.out.println(1);
	for (String string2 : names) {
			if(!string2.equals("Bahubali")){
			System.out.println(string2);
	}
	}
	System.out.println();

	System.out.println(2);
	Predicate<String >nameslist = (name)-> !name.equals("Bahubali");
	Stream<String>Stramfilterrecords =names.stream().filter(nameslist);
	Stramfilterrecords.forEach((s)-> {System.out.println(s);});
	
	System.out.println();
	System.out.println(3);

	names.stream().filter((name)-> !name.equals("Bahubali")).forEach((s)->{System.out.println(s);});
}
}
