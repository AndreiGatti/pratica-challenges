package br.com.challenges.curso2.model;

import br.com.challenges.curso2.model.interfaces.Sellable;

public class ProductSellable implements Sellable {
    private String name;
    private double unitPrice;

    @Override
    public double calculateTotalPrice(int quantity) {
        return 0;
    }

    @Override
    public void applyDiscount(double discountPercentage) {

    }
}
