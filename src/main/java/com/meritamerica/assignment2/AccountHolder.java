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

  // Get method for firstName

  String getFirstName() {
    return firstName;
  }

  // Set method for firstName
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

  CheckingAccount addCheckingAccount(double openingBalance) {	// Create new checking account
		  CheckingAccount newAccount = new CheckingAccount(openingBalance);
		  return addCheckingAccount(newAccount);
  }

  CheckingAccount addCheckingAccount(CheckingAccount checkingAccount) {	// If balance is < a number, increase the checking index and create the account
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

  double getCheckingBalance() {	// return the balance of all checking accounts
	  int count = 0;
	    int total = 0;
	    while(checkingAccount[count] != null) {
	    	total += checkingAccount[count].getBalance();
	    	count++;
	    }
	    return total;
  }

  SavingsAccount addSavingsAccount(double openingBalance) {	// new savings account
		  SavingsAccount newAccount = new SavingsAccount(openingBalance);
		  return addSavingsAccount(newAccount);
  }

  SavingsAccount addSavingsAccount(SavingsAccount savingsAccount) {	// If balance is < a number, increase the checking index and create the account
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

  double getSavingsBalance() {	// get savings balance
    int count = 0;
    int total = 0;
    while(savingsAccount[count] != null) {
    	total += savingsAccount[count].getBalance();
    	count++;
    }
    return total;
  }

  CDAccount addCDAccount(CDOffering offering, double openingBalance) {	// create CD Account
	  CDAccount newAccount = new CDAccount(offering, openingBalance);
	  return addCDAccount(newAccount);
  }

  CDAccount addCDAccount(CDAccount cdAccount) {	// Create CD account and increase index by 1
	  cdIndex++;
		return this.cdAccount[cdIndex] = cdAccount;
  }

  CDAccount[] getCDAccounts() {
    return cdAccount;
  }

  int getNumberOfCDAccounts() {
    return cdAccount.length;
  }

  double getCDBalance() {	// get cd balance of all cd accounts
	  int count = 0;
	    int total = 0;
	    while(cdAccount[count] != null) {
	    	total += cdAccount[count].getBalance();
	    	count++;
	    }
	    return total;
  }

  double getCombinedBalance() {	// return the balance of every account of the account holder
	  double total = this.getSavingsBalance() + this.getCheckingBalance() + getCDBalance();
    return total;
  }
}