package com.meritamerica.assignment2;

import java.util.Date;

public class CDAccount {

  private CDOffering offering = null;
  private double balance;
  private Date date = new Date();

  CDAccount(CDOffering offering, double balance) {	// cd account constructor
    this.offering = offering;
    this.balance = balance;
  }

  double getBalance() {	// return the balance
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

  java.util.Date getStartDate() {	// return the date of the offering
	  return date;
  }

  long getAccountNumber() {
	  return (long)((Math.random() * 15) + 5);
  }

  double futureValue() {	// return the future value of the account in terms
    return balance * Math.pow(1 + offering.getInterestRate(), offering.getTerm());
  }
}