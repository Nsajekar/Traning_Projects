package com.euronet.main;

import java.util.Scanner;
import com.euronet.main.domain.Account;
import com.euronet.main.domain.Current;
import com.euronet.main.domain.Savings;

public class AccountMainV6 {

	public static int accountType;
	static Scanner scanner = new Scanner(System.in);
	static Account account;

	public static void main(String[] args) {
		int choice;
		double amount;
		boolean result;
		String continueChoice;

		System.out.println("Welcome to Euronet Banking Services PVT Limited");

		// select account type
		System.out.println("Select account type : ");
		System.out.println("1. Savings");
		System.out.println("2. Current");
		System.out.println("Enter your Choice  :");
		accountType = scanner.nextInt();
		account = getAccountType(accountType);
		// print confirmation
		if (account instanceof Current) {
			System.out.println(account.toString());
			System.out.println("Your Current account is created succesfully");
		} else if (account instanceof Savings) {
			System.out.println(account.toString());
			if (((Savings) account).isSalary() == true) {
				System.out.println("Your Saving(salary) account is created succesfully");
			} else {
				System.out.println("Your saving account is created succesfully ");
			}
		}//transaction related
		do {
			System.out.println("Menu");
			System.out.println("press 1 to withdrow amount");
			System.out.println("press 2 to deposit amount");
			System.out.println("press 3 to get balance");
			choice = scanner.nextInt();

			switch (choice) {
			case 1:
				System.out.println("Enter amount to withdrow");
				amount = scanner.nextDouble();
				result = account.withdraw(amount);
				if (result) {
					System.out.println("Withdrow is succesful... ");
					System.out.println("Balance is :" + account.getBalance());
					if (account instanceof Current) {
						Current account1 = (Current) account;
						System.out.println("Overdraftbalance is :"
								+ account1.getOverdraftBalance());
					}

				} else {
					System.out.println("withdraw is unsccesfull");
					System.out.println("Balance is :" + account.getBalance());
					if (account instanceof Current) {
						Current account1 = (Current) account;
						System.out.println("Overdraftbalance is :"
								+ account1.getOverdraftBalance());
					}

				}
				break;
			case 2:
				System.out.println("Enter amount to deposit");
				amount = scanner.nextDouble();
				result = account.deposit(amount);

				if (result) {
					System.out.println("deposit is succesful... ");
					System.out.println("Balance is :" + account.getBalance());
					if (account instanceof Current) {
						Current account1 = (Current) account;
						System.out.println("Overdraftbalance is :"+ account1.getOverdraftBalance());
					}
				} else {
					System.out.println("deposit is unsccesfull");
					System.out.println("Balance is :" + account.getBalance());
					if (account instanceof Current) {
						Current account1 = (Current) account;
						System.out.println("Overdraftbalance is :"
								+ account1.getOverdraftBalance());
					}
				}
				break;
			case 3:
				System.out.println(account.getBalance());

			default:
				System.out.println("invalid");
				break;
			}
			System.out.println("Do you want to continue");
			continueChoice = scanner.next();
		} while (continueChoice.equals("yes"));
		System.out.println("Thankyou for banking with us");

	}

	public static Account getAccountType(int accountType) {
		scanner.nextLine();
		if (accountType == 1) {
			System.out.println("Enter Name");
			String name = scanner.nextLine();
			System.out.println("Enter account number");
			int accountNumber = scanner.nextInt();
			System.out.println("Enter balance");
			double balance = scanner.nextDouble();
			System.out.println("Do you want Salary account  ");
			System.out.println("true : For yes");
			System.out.println("false For No");
			boolean isSalary = scanner.nextBoolean();
			return new Savings(accountNumber, name, balance, isSalary);
		} else if (accountType == 2) {
			System.out.println("Enter Name");
			String name = scanner.nextLine();
			System.out.println("Enter account number");
			int accountNumber = scanner.nextInt();
			System.out.println("Enter balance");
			double balance = scanner.nextDouble();
			System.out.println("Enter overdraftbalance");
			double overdraftBalance = scanner.nextDouble();
			return new Current(accountNumber, name, balance, overdraftBalance);
		}
		return null;
	}
}
