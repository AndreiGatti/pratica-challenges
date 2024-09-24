package br.com.challenges.curso2.model;

import br.com.challenges.curso2.model.interfaces.Calculable;

public class PhysicalProduct extends Product implements Calculable {
    @Override
    public double calculateFinalPrice() {

        return getPrice() * 1.05;
    }
}
