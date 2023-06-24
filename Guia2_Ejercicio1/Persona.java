package Guia2_Ejercicio1;

public class Persona {
    private String DNI;
    private String nombre;
    private String apellido;
    private Domicilio domicilio;

    public Persona(String DNI, String nombre, String apellido, Domicilio domicilio) {
        this.DNI = DNI;
        this.nombre = nombre;
        this.apellido = apellido;
        this.domicilio = domicilio;
    }

    public void setDomicilio(Domicilio domicilio) {
        this.domicilio = domicilio;
    }

    public String getDNI() {
        return DNI;
    }

    @Override
    public String toString() {
        return "Persona:" +
                "nombre: '" + nombre + '\'' +
                ", apellido: '" + apellido + '\'' +
                ", " + domicilio +
                '}';
    }
}
