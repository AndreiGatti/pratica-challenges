package br.com.challenges.curso2.model;

public class Cat extends Animal{
    @Override
    public void makeNoise(){
        System.out.println("Miau");
    }

    public void sratchFurniture(){
        System.out.println("Gato arranhando móveis");
    }
}
