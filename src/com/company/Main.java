package com.company;

public class Main {

    public static void main(String[] args) {
        CheckingAccount check = new CheckingAccount(2,900);
        CreditAccount credit = new CreditAccount(2,441);

check.pay(123);
check.addMoney(345);
credit.transfer(check,4);

    }}
