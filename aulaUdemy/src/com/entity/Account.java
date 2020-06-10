package com.entity;

import javax.print.DocFlavor;

public class Account {
    private int accountNumber;
    private String accountName;
    private double accountInitialBalance;
    private double accountBalance;

    public Account(int accountNumber, String accountName, double accountInitialBalance, double accountBalance) {
        this.accountNumber = accountNumber;
        this.accountName = accountName;
        this.accountInitialBalance = accountInitialBalance;
        this.accountBalance = accountBalance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountName() {
        return "adao";
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public double getAccountInitialBalance() {
        return accountInitialBalance;
    }

    public void setAccountInitialBalance(double accountInitialBalance) {
        this.accountInitialBalance = accountInitialBalance;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public void depositAccount(double accountBalance ){
        this.accountBalance += accountBalance;
    }

    public void withdrawAccount(double accountBalance ){
        accountBalance = accountBalance + 5;
        this.accountBalance -= accountBalance;
    }

    public String toString(){
        return accountNumber + ", Holder:" + accountName + ", Balance: $ " + accountBalance;
    }
}
