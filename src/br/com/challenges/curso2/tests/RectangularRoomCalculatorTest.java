package br.com.challenges.curso2.tests;

import br.com.challenges.curso2.model.RectangularRoomCalculator;

public class RectangularRoomCalculatorTest {
    public static void main(String[] args) {
        RectangularRoomCalculator calculator = new RectangularRoomCalculator();
        calculator.calculateArea(5, 8);
        calculator.calculatePerimeter(5,8);
    }
}
