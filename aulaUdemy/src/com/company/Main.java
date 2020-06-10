package com.company;

import com.entity.Account;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        double accountBalance = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Bem vindo ao cadastro do Banco Adao! ");
        System.out.print("Informe um numero para sua conta:");
        int accountNumber = sc.nextInt();
        System.out.print("Informe seu nome:");
        String accountName = sc.nextLine();
        sc.nextLine();
        System.out.print("Quer depositar? Coloque 0. ");
        double accountInitialBalance = sc.nextDouble();
        accountBalance = accountInitialBalance + accountBalance;

        Account account = new Account(accountNumber, accountName, accountInitialBalance, accountBalance);

        System.out.println(account.toString());

        System.out.println("Vamos fazer um deposito:");
        double depositValue = sc.nextByte();
        account.depositAccount(depositValue);

        System.out.println(account.toString());
        System.out.println("Vamos fazer uma retirada:");
        double withdrawValue = sc.nextByte();
        account.withdrawAccount(withdrawValue);
        System.out.println(account.toString());
    }
}
