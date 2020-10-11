package com.meritamerica.assignment2;

public class CheckingAccount extends BankAccount {
	
	CheckingAccount(double balance) {	// Create a new bank account using the checking interest rate
		super(balance, 0.0001);
	}
}