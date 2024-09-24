package br.com.challenges.curso2.tests;

import br.com.challenges.curso2.model.StandardTemperatureConverter;
import br.com.challenges.curso2.model.interfaces.TemperatureConverter;

public class TemperatureConverterTest {
    public static void main(String[] args) {
        TemperatureConverter converter = new StandardTemperatureConverter();

        double celsiusTemperature= 22;
        double fahrenheitTemperature = converter.celsiusToFahrenheit(celsiusTemperature);
        System.out.println(celsiusTemperature + " Celsius é igual a " + fahrenheitTemperature + " Fahrenheit.");

        fahrenheitTemperature = 77;
        celsiusTemperature = converter.fahrenheitToCelsius(fahrenheitTemperature);
        System.out.println(fahrenheitTemperature + " Fahrenheit é igual a " + celsiusTemperature + " Celsius.");
    }
}
