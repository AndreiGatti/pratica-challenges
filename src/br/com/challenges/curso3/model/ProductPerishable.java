package br.com.challenges.curso3.model;

public class ProductPerishable extends Product{
    String expirationDate;

    public ProductPerishable(String name, double price, int quantity, String expirationDate){
        super(name, price, quantity);
        this.expirationDate = expirationDate;
    }

    @Override
    public String toString() {
        return super.toString() + ", Expiration Date: " + expirationDate;
    }
}
