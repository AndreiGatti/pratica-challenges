package br.com.challenges.curso2.model;

import br.com.challenges.curso2.model.interfaces.TemperatureConverter;

public class StandardTemperatureConverter implements TemperatureConverter {
    @Override
    public double celsiusToFahrenheit(double celsiusTemperature) {
        return (celsiusTemperature * 9 / 5) + 32;
    }

    @Override
    public double fahrenheitToCelsius(double fahrenheitTemperature) {
        return (fahrenheitTemperature - 32) * 5 / 9;
    }
}
