package Clase2;
private double celsius;
private double fahrenheit;

public Temperatura(double celsius) {
    this.celsius = celsius;
    this.fahrenheit = convertirAFahrenheit();
}

private double convertirAFahrenheit() {
    return (celsius * 9/5) + 32;
}

public double getCelsius() {
    return celsius;
}

public double getFahrenheit() {
    return fahrenheit;
}

public void mostrarResultados() {
    System.out.println("RESULTADOS");
    System.out.printf("Temperatura en Celsius: %.2f °C%n", celsius);
    System.out.printf("Temperatura en Fahrenheit: %.2f °F%n", fahrenheit);
}
