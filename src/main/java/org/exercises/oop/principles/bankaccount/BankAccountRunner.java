package org.exercises.oop.principles.bankaccount;

public class BankAccountRunner {

  public static void main(String[] args) {
    SavingsAccount userAccount = new SavingsAccount();
    userAccount.deposit(100);
    userAccount.withdraw(1);

    userAccount.showBalance();
  }
}