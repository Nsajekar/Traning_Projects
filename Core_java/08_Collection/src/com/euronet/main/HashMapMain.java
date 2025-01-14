package com.euronet.main;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapMain {

	public static void main(String[] args) {
		Map<Integer, String> employeeMap = new HashMap<>();
		employeeMap.put(101, "Mayur");
		employeeMap.put(102, "pranali");
		employeeMap.put(103, "Pravin");
		employeeMap.put(104, "Mandar");
		employeeMap.put(108, "Nitesh");
		employeeMap.put(106, "Ibrahim");
		employeeMap.put(107, "Kiran");
		employeeMap.put(109, "Ritesh");
		System.out.println(employeeMap);
		System.out.println(employeeMap.values());
		for (String name : employeeMap.values()) {
			
			System.out.println("Values"+name);
		}
        for(Map.Entry<Integer, String> entry :employeeMap.entrySet()){
        	Integer Key = entry.getKey();
        	String Values=entry.getValue();
        	
        	System.out.println("entrySet"+ Values);
        	
        }
	}

}
