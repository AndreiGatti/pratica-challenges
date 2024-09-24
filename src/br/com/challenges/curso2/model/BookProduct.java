package br.com.challenges.curso2.model;

import br.com.challenges.curso2.model.interfaces.Calculable;

public class BookProduct extends Product implements Calculable {
    private String author;


    public double calculateFinalPrice() {
        return getPrice() * 0.9;
    }
}
