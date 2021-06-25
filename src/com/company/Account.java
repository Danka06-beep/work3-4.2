package com.company;

public abstract class Account {
    protected int amount;
    protected int balance;

    public Account(int amount, int balance) {
        this.amount = amount;
        this.balance = balance;
    }
    void pay(int amount) {
        if (amount > 0)
            this.balance -= amount;
        else
            System.out.println("Сумма должна быть положительной");
    }
    void transfer(Account account, int amount) {
        this.balance -= amount;
    }

    void addMoney(int amount) {
        this.balance += amount;
    }

}