package model;

// Ler uma temperatura em graus Celsius e apresentá-la convertida em graus Fahrenheit. A fórmula de conversão é:
// F=(9*C+160) / 5, sendo F a temperatura em Fahrenheit e C a temperatura em Celsius.

public class ConversorTemperatura {
    private double temperaturaCelsius;
    private double temperaturaFahrenheit;

    public ConversorTemperatura() {
    }

    public ConversorTemperatura(double temperaturaCelsius, double temperaturaFahrenheit) {
        this.temperaturaCelsius = temperaturaCelsius;
        this.temperaturaFahrenheit = temperaturaFahrenheit;
    }

    public double getTemperaturaCelsius() {
        return temperaturaCelsius;
    }

    public void setTemperaturaCelsius(double temperaturaCelsius) {
        this.temperaturaCelsius = temperaturaCelsius;
    }

    public double getTemperaturaFahrenheit() {
        return temperaturaFahrenheit;
    }

    public void setTemperaturaFahrenheit(double temperaturaFahrenheit) {
        this.temperaturaFahrenheit = temperaturaFahrenheit;
    }

    public double calcularTemperaturaFahrenheit() {
        return (9 * this.temperaturaCelsius + 160) / 5;
    }
}
