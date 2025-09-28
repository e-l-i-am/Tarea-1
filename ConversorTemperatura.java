package Clase3;

public class ConversorTemperatura {
    private double celsius;
    private double fahrenheit;

    public ConversorTemperatura(double celsius) {
        this.celsius = celsius;
        this.fahrenheit = (celsius * 9/5) + 32;
    }

    public double getCelsius() {
        return celsius;
    }

    public double getFahrenheit() {
        return fahrenheit;
    }

    public void mostrarResultados() {
        System.out.println("Resultados:");
        System.out.println("Celsius: " + celsius + " °C");
        System.out.println("Fahrenheit: " + fahrenheit + " °F");
    }
}
