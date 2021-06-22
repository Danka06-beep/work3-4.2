package com.company;

public class CheckingAccount extends Account implements iAdd, iTransfer, iPay,Score{

    public CheckingAccount(int amount, int balance) {
        super(amount, balance);
    }

    void pay (int amount){
        balance = balance - amount;
    }
    void transfer(Account account, int amount){
        account.addMoney(amount);
    }
    void addMoney(int amount){
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
