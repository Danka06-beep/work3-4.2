package com.company;

public class SavingsAccount extends Account implements iAdd, iTransfer, iPay,Score{

    public SavingsAccount(int amount, int balance) {
        super(amount, balance);
    }

    void pay (int amount){

    }
     void transfer(Account account, int amount){
        account.addMoney(amount);

        if (amount < 0){
            System.out.println("Сберегательный не может уходить в минус");
        }

    }
    void addMoney(int amount){
        balance = balance + amount;
    }

    @Override
    public void PutMoney() {
    }

    @Override
    public void ToPay() {
    }

    @Override
    public void Score() {
    }

    @Override
    public void TransferAccount() {
    }
}
