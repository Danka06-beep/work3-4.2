package com.company;

public class Main {

    public static void main(String[] args) {
        CheckingAccount check = new CheckingAccount(1,900);
        Account account = new Account (2,123);
        SavingsAccount saving = new SavingsAccount(3,987);

account.addMoney(10);
account.transfer(saving,34);
account.pay(300);


    }
}
