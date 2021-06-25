package com.company;

public class CreditAccount extends Account {

    public CreditAccount(int amount, int balance) {
        super(amount, balance);

    }
    public void pay (int amount){
        super.pay(amount);
    }
    public void transfer(Account account, int amount){
        if (this.balance - amount <= 0) {
            super.transfer(account, amount);
        } else {
            System.out.println("Баланс может быть отрицательным");
        }
    }
    public void addMoney(int amount){
        if (this.balance + amount <= 0) {
            super.addMoney(amount);
        } else {
            System.out.println("Баланс может быть отрицательным");
        }

    }
}

