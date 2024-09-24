package br.com.challenges.curso2.model;

public class Dog extends Animal{
    @Override
    public void makeNoise(){
        System.out.println("Au au");
    }

    public void wagTail(){
        System.out.println("Cachorro abanando o rabo");
    }
}
