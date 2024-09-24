package br.com.challenges.curso1;

public class Desconto {
    public static void main(String[] args) {
        double originalPrice = 150.0;
        double descountPercentage = 10.0;
        double descountValue = (descountPercentage / 100.0) * originalPrice;
        double newPrice = originalPrice - descountValue;

        System.out.println("Preço original: R$" + originalPrice);
        System.out.println("br.com.challenges.curso1.Desconto: R$" + descountValue);
        System.out.println("Novo preço com desconto: R$" + newPrice);
    }
}
