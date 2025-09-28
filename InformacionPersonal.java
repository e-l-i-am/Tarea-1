package Clase1;

public class InformacionPersonal {

    private String nombre;
    private int edad;
    private String ciudadNacimiento;
    private double promedio;

    public InformacionPersonal(String nombre, int edad, String ciudad, double promedio){
        this.nombre = nombre;
        this.edad = edad;
        this.ciudadNacimiento = ciudad;
        this.promedio = promedio;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombreCompleto) {
        this.nombre = nombreCompleto;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCiudadNacimiento() {
        return ciudadNacimiento;
    }

    public void setCiudadNacimiento(String ciudadNacimiento) {
        this.ciudadNacimiento = ciudadNacimiento;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedioAcademico) {
        this.promedio = promedioAcademico;
    }

    public void mostrarInformacion() {
        System.out.println("//        DATOS REGISTRADOS         //");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad + " años");
        System.out.println("Ciudad de nacimiento: " + ciudadNacimiento);
        System.out.println("Promedio académico: " + promedio);


    }

}
