package br.com.challenges.curso2;

public class Car {
    String model;
    String color;
    int year;

    void showTechincalSheet(){
        System.out.println("O modelo do carro é: "+ model);
        System.out.println("A cor do carro é: "+ color);
        System.out.println("O ano do carro é: "+ year);
    }

    int calcAge(){
        return 2024-year;
    }
}