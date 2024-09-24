package br.com.challenges.curso2.model.interfaces;

public interface Sellable{
    double calculateTotalPrice(int quantity);
    void applyDiscount(double discountPercentage);

}
