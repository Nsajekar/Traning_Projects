package com.euronet.main;

import java.util.Arrays;

public class SortArrayMain {

	public static void main(String[] args) {
           String [] names = new String []{"Mayur","Pravin","Mandar","Pranali","Nitesh","Ibrahim","Kiran","Ritesh"};
           System.out.println("Printing Before Sorting");
           for (String strings : names) {
			System.out.print(strings);
		}
           System.out.println();
           Arrays.sort(names);
           System.out.println("Printing After Sorting");
           for (String strings : names) {
   			System.out.print(strings);
   		}
	}

}
