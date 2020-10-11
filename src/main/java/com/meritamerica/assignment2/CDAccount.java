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
	if(balance > 0) {
	    return balance;		
	} else
	return 0;
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
	  return (long)((Math.random() * 15) + 5);	// TODO
  }

  double futureValue() {
    return balance * Math.pow(1 + offering.getInterestRate(), offering.getTerm());
  }
}