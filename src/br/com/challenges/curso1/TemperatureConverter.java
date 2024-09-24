package br.com.challenges.curso1;

public class TemperatureConverter {
    public static void main(String[] args) {
    double celcius = 27.4;
    double fahrenheit = (celcius * 1.8) + 32;

    String message = String.format("A temperatura de %f Celcius é equivalente a %f Fahrenheit", celcius, fahrenheit);
    System.out.println(message);

    int temperature = (int) fahrenheit;
    System.out.println("A temperatura em Fahrenheit inteira é: " + temperature);
    }
}
