package com.meritamerica.assignment2;

public class BankAccount {

  private double balance;
  private double interestRate;
  private long accountNumber;

  BankAccount(double balance, double interestRate) {
    this.balance = balance;
    this.interestRate = interestRate;
  }

  BankAccount(long accountNumber, double balance, double interestRate) {
    this.accountNumber = accountNumber;
    this.balance = balance;
    this.interestRate = interestRate;
  }

  long getAccountNumber() {
    return accountNumber;
  }

  double getBalance() {
    return balance;
  }

  double getInterestRate() {
    return interestRate;
  }

  boolean withdraw(double amount) {
    if (amount <= balance) {
      balance -= amount;
      return true;
    }
    return false;
  }

  boolean deposit(double amount) {
    if (amount > 0) {
      balance += amount;
      return true;
    }
    return false;
  }

  double futureValue(int years) {
    return balance * Math.pow(1 + interestRate, years);
  }
}