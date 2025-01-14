package com.euonet.main;

import java.util.Scanner;

public class WendingMachineMain {
	 static Scanner scanner = new Scanner(System.in);
     public static int choice;
     
	public static void main(String[] args) {
		System.out.println("welcome");
		System.out.println("Select product from the List");
		System.out.println("1: candies : price = 20");
		System.out.println("2: gum : price = 30");
		System.out.println("3: cookies : price = 40");
		System.out.println("4: chips : price = 50");
         choice = scanner.nextInt();
         showSelection(choice);
	}

	public static void showSelection(int choice) {
       switch
	}
}
