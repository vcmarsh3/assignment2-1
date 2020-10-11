package com.meritamerica.assignment2;

import java.util.Arrays;

public class AccountHolder {
  // Declares variables for accountHolder constructor
  private String firstName;
  private String middleName;
  private String lastName;
  private String ssn;
  private CheckingAccount[] checkingAccount = new CheckingAccount[0];
  private int checkingIndex;
  private SavingsAccount[] savingsAccount = new SavingsAccount[0];
  private int savingsIndex;
  private CDAccount[] cdAccount = new CDAccount[0];
  private int cdIndex;

  // Declares accountHolder constructor while passing variables

  AccountHolder(String firstName, String middleName, String lastName, String ssn) {
    this.firstName = firstName;
    this.middleName = middleName;
    this.lastName = lastName;
    this.ssn = ssn;
  }

  // Declares getter method for firstName

  String getFirstName() {
    return firstName;
  }

  // Declares set method for firstName
  void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  String getMiddleName() {
    return middleName;
  }

  void setMiddleName(String middleName) {
    this.middleName = middleName;
  }

  String getLastName() {
    return lastName;
  }

  void setLastName(String lastName) {
    this.lastName = lastName;
  }

  String getSSN() {
    return ssn;
  }

  void setSSN(String ssn) {
    this.ssn = ssn;
  }

  CheckingAccount addCheckingAccount(double openingBalance) {
    return checkingAccount[checkingIndex] = new CheckingAccount(openingBalance);
    
    
  }

  CheckingAccount addCheckingAccount(CheckingAccount checkingAccount) {
	  checkingIndex++;
	return checkingAccount;
  }

  CheckingAccount[] getCheckingAccounts() {
    return checkingAccount;
  }

  int getNumberOfCheckingAccounts() {
    return checkingAccount.length;
  }

  double getCheckingBalance() {
    double total = 0;
    for(int i = 0; i < cdAccount.length; i++) {
      total += this.checkingAccount[i].getBalance();
    }
    return total;
  }

  SavingsAccount addSavingsAccount(double openingBalance) {
	  return savingsAccount[checkingIndex] = new savingsAccount(openingBalance);
  }

  SavingsAccount addSavingsAccount(SavingsAccount savingsAccount) {

  }

  SavingsAccount[] getSavingsAccounts() {
    return savingsAccount;
  }

  int getNumberOfSavingsAccounts() {
    return savingsAccount.length;
  }

  double getSavingsBalance() {
    double total = 0;
    for(int i = 0; i < cdAccount.length; i++) {
      total += this.savingsAccount[i].getBalance();
    }
    return total;
  }

  CDAccount addCDAccount(CDOffering offering, double openingBalance) {
    
  }

  CDAccount addCDAccount(CDAccount cdAccount) {
    
  }

  CDAccount[] getCDAccounts() {
    return cdAccount;
  }

  int getNumberOfCDAccounts() {
    return cdAccount.length;
  }

  double getCDBalance() {
    double total = 0;
    for(int i = 0; i < cdAccount.length; i++) {
      total += this.cdAccount[i].getBalance();
    }
    return total;
  }

  double getCombinedBalance() {
    return getSavingsBalance() + getCheckingBalance() + getCDBalance();
  }
}