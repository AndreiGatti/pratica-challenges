package br.com.challenges.curso2.model;

import br.com.challenges.curso2.model.interfaces.MultiplicationTable;

public class MultiplicationTableCalculator implements MultiplicationTable {
    @Override
    public void displayMultiplicationTable(int number) {
        System.out.println("Tabuada de multiplicação do " + number + ":");
        for (int i = 1; i <= 10; i++) {
            int result = number * i;
            System.out.println(number + " x " + i + " = " + result);
        }
    }
}
