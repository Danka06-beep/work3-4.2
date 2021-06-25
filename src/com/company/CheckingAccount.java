package com.company;

public class CheckingAccount extends Account {

    public CheckingAccount(int amount, int balance) {
        super(amount, balance);
    }
    void pay (int amount){
        if (this.balance >= amount) {
            super.pay(amount);
        } else {
            System.out.println("Недостаточно средств");
        }
    }
    void transfer(Account account, int amount){
        if (this.balance - amount >= 0) {
            super.transfer(account,amount);
        } else {
            System.out.println("Недостаточно средств для перевода");
        }
    }
    void addMoney(int amount){
        if (this.balance + amount >= 0) {
            super.addMoney(amount);
        } else {
            System.out.println("Баланс не может быть отрицательным");
        }
    }
}
