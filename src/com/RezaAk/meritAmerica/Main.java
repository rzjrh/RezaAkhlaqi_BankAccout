package com.RezaAk.meritAmerica;

public class Main {

	public static void main(String[] args) {

		
		BankAccount case1 = new BankAccount();
		BankAccount case2 = new BankAccount();
		BankAccount case3 = new BankAccount();

		
		case1.Deposit("Checking", 1000.00);
		case1.Deposit("Savings", 1500.00);
		case1.WithDraw("Checking", 500.00);
		case1.WithDraw("Savings", 10.00);
		case1.balanceCheck();


		case2.Deposit("Checking", 4000.00);
		case2.Deposit("Savings", 1652.20);
		case2.WithDraw("Checking", 2800.12);
		case2.WithDraw("Savings", 5850.00);
		case2.balanceCheck();

		
		case3.Deposit("Checking", 2200.01);
		case3.Deposit("Savings", 1850.10);
		case3.WithDraw("Checking", 2300.00);
		case3.WithDraw("Savings", 625.50);
		case3.balanceCheck();

		
		
		
		
		
	}

}
