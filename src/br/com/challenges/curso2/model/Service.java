package br.com.challenges.curso2.model;

import br.com.challenges.curso2.model.interfaces.Sellable;

public class Service implements Sellable {
    private String desc;
    private double hourPrice;

    @Override
    public double calculateTotalPrice(int quantity) {
        return hourPrice * quantity;
    }

    @Override
    public void applyDiscount(double discountPercentage) {
        hourPrice -= hourPrice *(discountPercentage / 100.00);
    }
}
