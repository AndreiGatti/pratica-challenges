package br.com.challenges.curso2.model;

import br.com.challenges.curso2.model.interfaces.GeometryCalculation;

public class RectangularRoomCalculator implements GeometryCalculation {
    @Override
    public void calculateArea(double height, double width) {
        double area = height * width;
        System.out.println("A área da sala retangular é: " + area);
    }

    @Override
    public void calculatePerimeter(double height, double width) {
        double perimeter = 2 * (height + width);
        System.out.println("O perímetro da sala retangular é: " + perimeter);
    }
}
