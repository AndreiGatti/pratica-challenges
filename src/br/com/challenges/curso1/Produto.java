package br.com.challenges.curso1;

public class Produto {
    public static void main(String[] args) {
        double productPrice = 29.99;
        int quantity = 3;
        double total = productPrice * quantity;
        String message = "O valor total da compra é R$" + total;
        System.out.println(message);
    }
}
