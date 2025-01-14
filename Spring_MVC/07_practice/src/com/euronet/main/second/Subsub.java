package com.euronet.main.second;

import com.euronet.main.Third.Sub;

public class Subsub extends Sub {

	public static void main(String[] args) {
		Subsub sub = new Subsub();
		System.out.println(sub.j);
		sub.superAccess();
		System.out.println(sub.j);
	}
}
