package com.meritamerica.assignment2;

import java.util.Arrays;

public class AccountHolder {

  AccountHolder(String firstName, String middleName, String lastName, String ssn) {
    this.firstName = firstName;
    this.middleName = middleName;
    this.lastName = lastName;
    this.ssn = ssn;
  }

  String getFirstName() {
    return firstName;
  }

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

  }

  CheckingAccount addCheckingAccount(CheckingAccount checkingAccount) {

  }

  CheckingAccount[] getCheckingAccounts() {

  }

  int getNumberOfCheckingAccounts() {

  }

  double getCheckingBalance() {

  }

  SavingsAccount addSavingsAccount(double openingBalance) {

  }

  SavingsAccount addSavingsAccount(SavingsAccount savingsAccount) {

  }

  SavingsAccount[] getSavingsAccounts() {

  }

  int getNumberOfSavingsAccounts() {

  }

  double getSavingsBalance() {

  }

  CDAccount addCDAccount(CDOffering offering, double openingBalance) {

  }

  CDAccount addCDAccount(CDAccount cdAccount) {

  }

  CDAccount[] getCDAccounts() {

  }

  int getNumberOfCDAccounts() {

  }

  double getCDBalance() {

  }

  double getCombinedBalance() {

  }
}