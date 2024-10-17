package com.vladproduction.classes;

public class MainBankApp {
    public static void main(String[] args) {
        int depositAmount = 100;
        int withdrawAmount = 50;

        BankAccount bankAccount = new BankAccount();
        bankAccount.deposit(depositAmount);
        bankAccount.withdraw(withdrawAmount);

        int result = bankAccount.getBalance();
        System.out.println("result = " + result);
    }

}
