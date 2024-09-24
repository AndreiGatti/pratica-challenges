package br.com.challenges.curso2.model;

import br.com.challenges.curso2.model.interfaces.FinancialConversion;

public class CurrencyConverter implements FinancialConversion {
    @Override
    public void convertDollarToReal(double dolarValue) {
        double dollarExchangeRate = 5.54;
        double realValue = dolarValue * dollarExchangeRate;
        System.out.println("O valor em reais é: R$" + realValue);
    }
}
