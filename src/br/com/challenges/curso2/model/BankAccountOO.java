package br.com.challenges.curso2.model;

public class BankAccountOO {
    protected double balance;

    public void deposit(double value){
        balance += value;
        System.out.println("Depósito de " + value + " realizado. Saldo atual: " + balance);
    }

    public void withdraw(double value){
        if (value <= balance){
            balance -= value;
            System.out.println("Saque de " + value + " realizado. Saldo atual: " + balance);
        } else {
            System.out.println("Saldo insuficiente para saque.");
        }
    }

    public void showBalance(){
        System.out.println("Saldo atual: " + balance);
    }
}
