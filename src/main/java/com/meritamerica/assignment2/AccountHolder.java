package com.meritamerica.assignment2;


public class AccountHolder {
  // Declares variables for accountHolder constructor
  private String firstName;
  private String middleName;
  private String lastName;
  private String ssn;
  private CheckingAccount[] checkingAccount = new CheckingAccount[10];
  private int checkingIndex = -1;
  private SavingsAccount[] savingsAccount = new SavingsAccount[10];
  private int savingsIndex = -1;
  private CDAccount[] cdAccount = new CDAccount[10];
  private int cdIndex = -1;

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
	  if(getCombinedBalance() < 245000) {
		  checkingIndex++;
		  return this.checkingAccount[checkingIndex] = checkingAccount;
	  }	else
	  return null;
  }

  CheckingAccount[] getCheckingAccounts() {
    return checkingAccount;
  }

  int getNumberOfCheckingAccounts() {
    return checkingAccount.length;
  }

  double getCheckingBalance() {
	  int count = 0;
	    int total = 0;
	    while(checkingAccount[count] != null) {
	    	total += checkingAccount[count].getBalance();
	    	count++;
	    }
	    return total;
  }

  SavingsAccount addSavingsAccount(double openingBalance) {
		  SavingsAccount newAccount = new SavingsAccount(openingBalance);
		  return addSavingsAccount(newAccount);
  }

  SavingsAccount addSavingsAccount(SavingsAccount savingsAccount) {
	  if(this.getCombinedBalance() < 245000) {
		  savingsIndex++;
		  return this.savingsAccount[savingsIndex] = savingsAccount;
	  }	else
	  return null;
  }

  SavingsAccount[] getSavingsAccounts() {
    return savingsAccount;
  }

  int getNumberOfSavingsAccounts() {
    return savingsAccount.length;
  }

  double getSavingsBalance() {
    int count = 0;
    int total = 0;
    while(savingsAccount[count] != null) {
    	total += savingsAccount[count].getBalance();
    	count++;
    }
    return total;
  }

  CDAccount addCDAccount(CDOffering offering, double openingBalance) {
	  CDAccount newAccount = new CDAccount(offering, openingBalance);
	  return addCDAccount(newAccount);
  }

  CDAccount addCDAccount(CDAccount cdAccount) {
	  cdIndex++;
		return this.cdAccount[cdIndex] = cdAccount;
  }

  CDAccount[] getCDAccounts() {
    return cdAccount;
  }

  int getNumberOfCDAccounts() {
    return cdAccount.length;
  }

  double getCDBalance() {
	  int count = 0;
	    int total = 0;
	    while(cdAccount[count] != null) {
	    	total += cdAccount[count].getBalance();
	    	count++;
	    }
	    return total;
  }

  double getCombinedBalance() {
	  double total = this.getSavingsBalance() + this.getCheckingBalance() + getCDBalance();
    return total;
  }
}