package com.meritamerica.assignment2;

public class MeritAmericaBankApp {
  public static void main(String[] args) {
    System.out.println("Hello Merit America!");
    CDOffering(1, .018);
    CDOffering(2, .019);
    CDOffering(3, .02);
    CDOffering(5, .025);
    CDOffering(10, .022);
    AccountHolder ah1 = new AccountHolder("Chris", "Scott", "Andrews", "374-937-9673");
    ah1.getCheckingAccount(1000);
    ah1.getSavingsAccount(10000);
    ah1.getCheckingAccount(5000);
    ah1.getSavingsAccount(50000);
    ah1.getCheckingAccount(50000);
    ah1.getSavingsAccount(500000);
    ah1.getCheckingAccount(5000);
    ah1.getSavingsAccount(50000);
    ah1.getCheckingAccounts();
    ah1.getBestCDOffering());
    meritBank.addAccountHolder(ah1);
    AccountHolder ah2 = new AccountHolder("Tom", "Bryson", "Hanks", "654-275-7649");
    ah2.getCheckingAccount(1000);
    ah2.getSavingsAccount(10000);
    ah2.getCDAccount(ah2.getSecondBestCDOffering());
    MeritBank.addAccountHolder(ah2);
    MeritBank.clearCDOfferings();
    AccountHolder ah3 = new AccountHolder("Jennifer", "Katie", "Simmons", "243-876-4978");
    ah3.getCDAccount(ah3.getSecondBestCDOffering());
    ah3.getCDAccounts();
    ah3.getCheckingAccount(1000);
    ah3.getSavingsAccount(10000);
    MeritBank.addAccountHolder(ah3);
    System.out.println(MeritBank.totalBalances());
  }
}