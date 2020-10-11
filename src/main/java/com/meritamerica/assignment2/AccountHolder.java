package com.meritamerica.assignment2;

import java.util.Arrays;

public class AccountHolder {
  // Declares variables for accountHolder constructor
  private String firstName;
  private String middleName;
  private String lastName;
  private String ssn;
  private CheckingAccount[] checkingAccount = new CheckingAccount[10];
  private int checkingIndex;
  private SavingsAccount[] savingsAccount = new SavingsAccount[10];
  private int savingsIndex;
  private CDAccount[] cdAccount = new CDAccount[10];
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
	  CheckingAccount newAccount = new CheckingAccount(openingBalance);
	  return addCheckingAccount(newAccount);
    
  }

  CheckingAccount addCheckingAccount(CheckingAccount checkingAccount) {
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
      total += checkingAccount[i].getBalance();
    }
    return total;
  }

  SavingsAccount addSavingsAccount(double openingBalance) {
	  SavingsAccount newAccount = new SavingsAccount(openingBalance);
	  return addSavingsAccount(newAccount);
  }

  SavingsAccount addSavingsAccount(SavingsAccount savingsAccount) {
	  return savingsAccount;
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
      total += savingsAccount[i].getBalance();
    }
    return total;
  }

  CDAccount addCDAccount(CDOffering offering, double openingBalance) {
	  CDAccount newAccount = new CDAccount(offering, openingBalance);
	  return addCDAccount(newAccount);
  }

  CDAccount addCDAccount(CDAccount cdAccount) {
	  return cdAccount;
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
      total += cdAccount[i].getBalance();
    }
    return total;
  }

  double getCombinedBalance() {
    return getSavingsBalance() + getCheckingBalance();
  }
}