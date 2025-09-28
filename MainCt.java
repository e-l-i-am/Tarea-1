package Clase3;

import java.util.Scanner;

public class MainCt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Conversor de Temperatura");

        System.out.print("Ingresa grados Celsius: ");
        double celsius = sc.nextDouble();

        ConversorTemperatura conversor = new ConversorTemperatura(celsius);
        conversor.mostrarResultados();

        sc.close();
    }
}
