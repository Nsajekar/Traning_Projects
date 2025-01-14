package com.euronet.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortArrayList {

	public static void main(String[] args) {
		List<String> nameslist = new ArrayList<>();
		nameslist.add("Mayur");
		nameslist.add("Pravin");
		nameslist.add("Mandar");
		nameslist.add("Pranali");
		nameslist.add("Nitesh");
		nameslist.add("Ibrahim");
		nameslist.add("Kiran");
		nameslist.add("Ritesh");
		System.out.println(nameslist);
		Collections.sort(nameslist);
		System.out.println(nameslist);
		
		
	}

}
