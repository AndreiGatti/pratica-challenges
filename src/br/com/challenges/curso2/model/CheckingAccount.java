package br.com.challenges.curso2.model;

public class CheckingAccount extends BankAccountOO{
    private double monthlyFee;

    public void chargeMonthlyFee(){
        balance -= monthlyFee;
        System.out.println("Tarifa mensal de: " + monthlyFee + " cobrada. Saldo atual: " + balance);
    }
}
