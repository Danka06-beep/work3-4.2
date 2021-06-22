package com.company;

public class CreditAccount extends Account implements iAdd, iTransfer, iPay,Score{

    public CreditAccount(int amount, int balance) {
        super(amount, balance);

    }
    public void pay (int amount){
        balance = balance - amount;
    }
    public void transfer(Account account, int amount){
        account.addMoney(amount);
        balance = balance - amount;
    }
    public void addMoney(int amount){
        balance = balance + amount;
    }

    public void Score() {
    }

    @Override
    public void PutMoney() {

    }

    @Override
    public void ToPay() {

    }

    @Override
    public void TransferAccount() {

    }
}

