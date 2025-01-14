package com.euronet.main;

import java.io.ObjectInputStream.GetField;
import java.util.Scanner;

import com.euronet.main.domain.Account;
import com.euronet.main.domain.Current;
import com.euronet.main.domain.Savings;

public class AccountMainV5 {

	public static void main(String[] args) {
		int choice;
//		double amount;
//		boolean result;
//		String continueChoice;
//		double overdraftBalance;
//
     	Scanner scanner = new Scanner(System.in);
//
//		System.out.println("Enter Name");
//		String name = scanner.nextLine();
//		System.out.println("Enter account number");
//		int accountNumber = scanner.nextInt();
//		System.out.println("Enter balance");
//		double balance = scanner.nextDouble();
//		System.out.println("Enter overdraft balance");
//		overdraftBalance = scanner.nextDouble();
//
//		Current current = new Current(accountNumber, name, balance,
//				overdraftBalance);
//
//		System.out.println(current);
//		do {
//			System.out.println("Menu");
//			System.out.println("press 1 to withdrow amount");
//			System.out.println("press 2 to deposit amount");
//			choice = scanner.nextInt();
//
//			switch (choice) {
//			case 1:
//				System.out.println("Enter amount to withdrow");
//				amount = scanner.nextDouble();
//				result = current.withdraw(amount);
//				if (result) {
//					System.out.println("Withdrow is succesful... ");
//					System.out.println("Balance is :" + current.getBalance());
//					System.out.println("Overdraftbalance is :"
//							+ current.getOverdraftBalance());
//				} else {
//					System.out.println("withdraw is unsccesfull");
//					System.out.println("Balance is :" + current.getBalance());
//					System.out.println("Overdraftbalance is :"
//							+ current.getOverdraftBalance());
//				}
//				break;
//			case 2:
//				System.out.println("Enter amount to deposit");
//				amount = scanner.nextDouble();
//				result = current.deposit(amount);
//
//				if (result) {
//					System.out.println("deposit is succesful... ");
//					System.out.println("Balance is :" + current.getBalance());
//					System.out.println("Overdraftbalance is :"
//							+ current.getOverdraftBalance());
//
//				} else {
//					System.out.println("deposit is unsccesfull");
//					System.out.println("Balance is :" + current.getBalance());
//					System.out.println("Overdraftbalance is :"
//							+ current.getOverdraftBalance());
//
//				}
//				break;
//
//			default:
//				System.out.println("invalid");
//				break;
//			}
//			System.out.println("Do you want to continue");
//			continueChoice = scanner.next();
//		} while (continueChoice.equals("yes"));
     	
     	System.out.println("Select account type : ");
     	System.out.println("1. Savings"); 
     	System.out.println("2. Current");
     	System.out.println("Enter your Choice  :");
     	choice= scanner.nextInt();
     	Account account = getAccountType(choice);
     	if(account instanceof Savings){
     		System.out.println("Savings Account .");
     	}
     	if(account instanceof Current){
     		System.out.println("Current Account");
     	}
	}
	
	   public static Account getAccountType(int choice){
		if (choice == 1){
			return new Savings();
		}
		else if(choice == 2){
			return new Current();
		}
		return null;
	}

}
