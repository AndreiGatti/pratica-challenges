package br.com.challenges.curso3.model;

public class Circle implements Shape{
    public double radius;

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}
