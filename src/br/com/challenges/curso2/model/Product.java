package br.com.challenges.curso2.model;

public class Product {
    private String name;
    private double price;

    /* public Product(String name, double price){
        this.name = name;
        this.price = price;
    }*/

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void applyDiscount(double discountPercentage) {
        double discount = price * (discountPercentage / 100);
        price -= discount;
    }
}

