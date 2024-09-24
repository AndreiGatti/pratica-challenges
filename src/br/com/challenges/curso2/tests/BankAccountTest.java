package br.com.challenges.curso2.tests;

import br.com.challenges.curso2.model.BankAccountOO;
import br.com.challenges.curso2.model.CheckingAccount;

public class BankAccountTest {
    public static void main(String[] args) {
        BankAccountOO account = new BankAccountOO();
        account.deposit(1000);
        account.showBalance();

        CheckingAccount checkingAccount = new CheckingAccount();
        checkingAccount.deposit(200);
        checkingAccount.chargeMonthlyFee();
        checkingAccount.showBalance();
        checkingAccount.withdraw(150);
        checkingAccount.showBalance();
    }
}
