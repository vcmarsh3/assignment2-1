package com.meritamerica.assignment2;

import java.util.Date;

public class CDAccount {

  private CDOffering offering = null;
  private double balance;
  private Date date = new Date();

  CDAccount(CDOffering offering, double balance) {
    this.offering = offering;
    this.balance = balance;
  }

  double getBalance() {
    return balance;
  }

  double getInterestRate() {
    return offering.getInterestRate();
  }

  int getTerm() {
    return offering.getTerm();
  }

  java.util.Date getStartDate() {
	  return date;
  }

  long getAccountNumber() {
    return accountNumber; // TODO
  }

  double futureValue() {
    return balance * Math.pow(1 + offering.getInterestRate(), offering.getTerm());
  }
}