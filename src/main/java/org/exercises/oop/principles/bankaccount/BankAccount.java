package org.exercises.oop.principles.bankaccount;

public class BankAccount {
    private int accountBalance;

    public void showBalance() {
        System.out.println("Текущий баланс: " + getAccountBalance());
    }

    public int getAccountBalance() {
        return accountBalance;
    }

    public void deposit(int amount) {
        accountBalance += amount;
    }

    public void withdraw(int amount) {
        accountBalance -= amount;
    }
}

class SavingsAccount extends BankAccount {
    @Override
    public void withdraw(int amount) {
        if (getAccountBalance() - amount >= 100) {
            super.withdraw(amount);
        } else {
            System.out.println("Снятие недоступно. Баланс не может быть ниже 100");
        }
    }
}