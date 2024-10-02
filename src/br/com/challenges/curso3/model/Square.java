package br.com.challenges.curso3.model;

public class Square implements Shape{
     public double side;

    @Override
    public double calculateArea() {
        return side * side;
    }
}
