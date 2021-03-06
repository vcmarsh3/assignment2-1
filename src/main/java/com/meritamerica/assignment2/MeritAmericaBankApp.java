/*
 * MeritAmericaBankApp.java
 * By: Jameson Squyres and Vanessa Marsh
 * This Program will allow a bank to create account holders with multiple checking, savings, and cd accounts
 * While also allowing account holders to deposit, withdraw, open new accounts, find the best cd offerings
 * and get a cd offering. MeritBank will be able to add account holders, offerings, clear offerings
 * and find the best offering for an account by using the balance on the account.
 */
package com.meritamerica.assignment2;

public class MeritAmericaBankApp {
  public static void main(String[] args) {
    System.out.println("Hello Merit America!");
    CDOffering[] CDOfferings = new CDOffering[5];
	CDOfferings[0] = new CDOffering(1, 1.8 / 100);
	CDOfferings[1] = new CDOffering(2, 1.9 / 100);
	CDOfferings[2] = new CDOffering(3, 2.0 / 100);
	CDOfferings[3] = new CDOffering(5, 2.5 / 100);
	CDOfferings[4] = new CDOffering(10, 2.2 / 100);
	MeritBank.setCDOfferings(CDOfferings);
    AccountHolder ah1 = new AccountHolder("Chris", "Scott", "Andrews", "374-937-9673");
    ah1.addCheckingAccount(1000);
    ah1.addSavingsAccount(10000);
    ah1.addCheckingAccount(5000);
    ah1.addSavingsAccount(50000);
    ah1.addCheckingAccount(50000);
    ah1.addSavingsAccount(500000);
    ah1.addCheckingAccount(5000);
    ah1.addSavingsAccount(50000);
    ah1.getCheckingAccounts();
    CDOffering ah1best = MeritBank.getBestCDOffering(5000);
    ah1.addCDAccount(ah1best, 5000);
    MeritBank.addAccountHolder(ah1);
    AccountHolder ah2 = new AccountHolder("Tom", "Bryson", "Hanks", "654-275-7649");
    ah2.addCheckingAccount(1000);
    ah2.addSavingsAccount(10000);
    CDOffering ah2best = MeritBank.getSecondBestCDOffering(5000);
    ah2.addCDAccount(ah2best, 5000);
    MeritBank.addAccountHolder(ah2);
    MeritBank.clearCDOfferings();
    AccountHolder ah3 = new AccountHolder("Jennifer", "Katie", "Simmons", "243-876-4978");
    ah3.addCDAccount(ah2best, 5000);
    ah3.getCDAccounts();
    ah3.addCheckingAccount(1000);
    ah3.addSavingsAccount(10000);
    MeritBank.addAccountHolder(ah3);
    System.out.println(MeritBank.totalBalances());
  }
}