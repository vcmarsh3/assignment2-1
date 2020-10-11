package com.meritamerica.assignment2;

public class CDOffering {

  private int term;
  private double interestRate;

  CDOffering(int term, double interestRate) {	// cd offering constructor
    this.term = term;
    this.interestRate = interestRate;
  }

  int getTerm() {
    return term;
  }

  double getInterestRate() {
    return interestRate;
  }
}