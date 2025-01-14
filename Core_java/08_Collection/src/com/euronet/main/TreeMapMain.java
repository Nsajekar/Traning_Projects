package com.euronet.main;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapMain {
public static void main(String[] args) {
	Map<Integer, String> employeeMap = new TreeMap<>();
	employeeMap.put(101, "Mayur");
	employeeMap.put(102, "pranali");
	employeeMap.put(103, "Pravin");
	employeeMap.put(10314, "Mandar");
	employeeMap.put(108458, "Nitesh");
	employeeMap.put(106, "Ibrahim");
	employeeMap.put(1834507, "Kiran");
	employeeMap.put(109, "Ritesh");
	System.out.println(employeeMap);
}
}
