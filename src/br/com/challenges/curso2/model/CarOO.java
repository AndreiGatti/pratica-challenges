package br.com.challenges.curso2.model;

public class CarOO {
    private String model;
    private double priceYear1;
    private double priceYear2;
    private double priceYear3;

    public void defineModel(String model){
        this.model = model;
    }

    public void definePrice(double priceYear1, double priceYear2, double priceYear3){
        this.priceYear1 = priceYear1;
        this.priceYear2 = priceYear2;
        this.priceYear3 = priceYear3;
    }

    public void showInfo() {
        System.out.println("Modelo: " + model);
        System.out.println("Preço Ano 1: " + priceYear1);
        System.out.println("Preço Ano 2: " + priceYear2);
        System.out.println("Preço Ano 3: " + priceYear3);
        System.out.println("Menor preço: " + calculateLowerPrice());
        System.out.println("Maior preço: " + calculateHigherPrice());
    }

    public double calculateLowerPrice(){
        double lowerPrice = priceYear1;

        if(priceYear2 < lowerPrice){
            lowerPrice = priceYear2;
        }

        if(priceYear3 < lowerPrice){
            lowerPrice = priceYear3;
        }

        return lowerPrice;
    }

    public double calculateHigherPrice(){
        double higherPrice = priceYear1;

        if(priceYear2 > higherPrice){
            higherPrice = priceYear2;
        }

        if(priceYear3 > higherPrice){
            higherPrice = priceYear3;
        }

        return higherPrice;
    }

}
