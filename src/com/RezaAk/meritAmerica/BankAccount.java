package com.RezaAk.meritAmerica;

// Author: Reza Akhlaqi 		7-10-2019




// 1- the class should have the following attributes: (string) account number, (double) checking balance, (double) savings balance
// 2-Create a class member (static) that has the number of accounts created thus far
// 3- Create a class member (static) that tracks the total amount of money stored in every account created
// 4- Create a private method that returns a random ten digit account number
// 5- In the constructor, call the private method from above so that each user has a random ten digit account
// 6- In the constructor, be sure to increment the account count

// 7- Create a getter method for the user's checking account balance
// 8- Create a getter method for the user's saving account balance.
// 9- Create a method that will allow a user to deposit money into either the checking or saving, be sure to add to total amount stored
// 10- Create a method to withdraw money from one balance. Do not allow them to withdraw money if there are insufficient funds.
// 11- Create a method to see the total money from the checking and saving.
// 12- Users should not be able to set any of the attributes from the class


import java.util.Random;


public class BankAccount {
	
	//1 - 2 - 3
	// declare the class attributes
	private String accountNumber;
	private double checkingBalance;
	private double savingsBalance;
	public static int numberOfAccounts;
	public static double totalBalance;
	
	
	
	
//	public BankAccount() {
//		accountNumber = NewAccoutnNum();
//		checkingBalance = checkingBalance;
//		numberOfAccounts += 1;
//		savingsBalance = savingsBalance;
//		
//		return numberOfAccounts;
//		
//	}
	
	
	
	
	
	//getters and setters for checking
	public double getCheckingBalance() {
		return checkingBalance;
	}
		public void setCheckingBalance(double checkingBalance) {
		this.checkingBalance = checkingBalance;
	}
	
	
	
	//getters and setters for Saving
	public double getSavingsBalance() {
		return savingsBalance;
	}

	public void setSavingsBalance(double savingsBalance) {
		this.savingsBalance = savingsBalance;
	}

	
	
	//getters
	public static int getNumberOfAccounts() {
		return numberOfAccounts;
	}

	public static double getTotalAmount() {
		return totalBalance;
	}

	
	
	
	
	//generate new random account number 
	public String NewAccoutnNum() {
		String account = "";
		Random num = new Random();
		for(int i = 0; i<10; i++) {
			int randNum = num.nextInt(10);
			account += randNum;
			numberOfAccounts =+1;
		}
		return account;
	}

	
	
	
	
	
	//deposit to the account 
	public void Deposit(String type, Double amountdeposit) {
		if (type == "Checking") {
			setCheckingBalance(getCheckingBalance() + amountdeposit);
			totalBalance += amountdeposit;
		}
		else if (type == "savings" || type == "Savings") {
			setSavingsBalance(getSavingsBalance() + amountdeposit);
			totalBalance += amountdeposit;
		} 
	}

	
	
	
	
	
	//withdraw from an account 
	public void WithDraw(String type, Double amountWithdraw) {
		if (type == "Checking") {
			if (getCheckingBalance() < amountWithdraw) {
				System.out.println("error: There is not sufficient found in your checking account \nPlease deposit or choose other account");
			} else {
				setCheckingBalance(getCheckingBalance() - amountWithdraw);
				totalBalance -= amountWithdraw;
			}
		}
		if (type == "Savings") {
			if (getSavingsBalance() < amountWithdraw) {
				System.out.println("error: There is not sufficient found in your Saving account \nPlease make a deposit or choose other account\n");
			} else {
				setSavingsBalance(getSavingsBalance() - amountWithdraw);
				totalBalance -= amountWithdraw;
			}
		}
	}
	
	
	
	public void balanceCheck() {
		System.out.println("********** Summary report of your account: **********");
		Double totalBalance = checkingBalance + savingsBalance;
		System.out.println("your Account Number is: " + NewAccoutnNum());
		System.out.println("your Checking account balance is: " + checkingBalance);
		System.out.println("your Saving account balance is: " + savingsBalance);
		System.out.println("the total balance is: " + totalBalance+"\n\n");
//		return totalBalance;
	}
	
	
	
	


	
	
	
	

}
