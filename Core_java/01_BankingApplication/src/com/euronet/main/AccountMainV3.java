package com.euronet.main;

import java.util.Scanner;

import com.euronet.main.domain.Account;
import com.euronet.main.domain.Savings;

public class AccountMainV3 {

	public static void main(String[] args) {
		int choice;
		double amount;
		boolean result;
		boolean isSalary;
		String continueChoice;
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter Name");
		String name = scanner.nextLine();
		System.out.println("Enter account number");
		int accountNumber = scanner.nextInt();
		System.out.println("Enter balance");
		double balance = scanner.nextDouble();
		System.out.println("Do you want salary account yes/no");
		isSalary = scanner.nextBoolean();
		Savings account = new Savings(accountNumber, name, balance, isSalary);

		System.out.println(account);
		do {
			System.out.println("Menu");
			System.out.println("press 1 to withdrow amount");
			System.out.println("press 2 to deposit amount");
			choice = scanner.nextInt();

			switch (choice) {
			case 1:
				System.out.println("Enter amount to withdrow");
				amount = scanner.nextDouble();
				result = account.withdraw(amount);
				if (result) {
					System.out.println("Withdrow is succesful... ");
					System.out.println("Balance is :" + account.getBalance());
				} else {
					System.out.println("withdraw is unsccesfull");
					System.out.println("Balance is :" + account.getBalance());

				}
				break;
			case 2:
				System.out.println("Enter amount to deposit");
				amount = scanner.nextDouble();
				result = account.deposit(amount);

				if (result) {
					System.out.println("deposit is succesful... ");
					System.out.println("Balance is :" + account.getBalance());
				} else {
					System.out.println("deposit is unsccesfull");
					System.out.println("Balance is :" + account.getBalance());
				}
				break;

			default:
				System.out.println("invalid");
				break;
			}
			System.out.println("Do you want to continue");
			continueChoice = scanner.next();
		} while (continueChoice.equals("yes"));
	}

}