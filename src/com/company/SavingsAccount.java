package com.company;

public class SavingsAccount extends Account{

    public SavingsAccount(int amount, int balance) {
        super(amount, balance);
    }
    void pay (int amount) {
        super.pay(amount);
    }
     void transfer(Account account, int amount){
         super.transfer(account,amount);
    }
    void addMoney(int amount){
        super.addMoney(amount);
    }

}


