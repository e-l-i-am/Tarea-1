package Clase1;

import java.util.Scanner;

public class MainInformacionPersonal {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("REGISTRO DE DATOS PERSONALES");
        System.out.print("Nombre completo: ");
        String nombre = teclado.nextLine();

        System.out.print("Edad: ");
        int edad = teclado.nextInt();
        teclado.nextLine();

        System.out.print("Ciudad de nacimiento: ");
        String ciudad = teclado.nextLine();

        System.out.print("Promedio académico: ");
        double promedio = teclado.nextDouble();

        if (promedio < 0 || promedio > 10) {
            System.out.println("Error: Promedio debe estar entre 0 y 10");
            teclado.close();
            return;
        }

        informacion_personal estudiante = new informacion_personal(nombre, edad, ciudad, promedio);

        estudiante.mostrarInformacion();

        teclado.close();
    }
}