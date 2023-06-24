package Guia3_Ejercicio8;

public abstract class Empleado {
    private int DNI;
    private String nombre;
    private String apellido;
    private int anioIngreso;

    public Empleado(int DNI, String nombre, String apellido, int anioIngreso) {
        this.DNI = DNI;
        this.nombre = nombre;
        this.apellido = apellido;
        this.anioIngreso = anioIngreso;
    }

    public Empleado(){}

    public int getAnioIngreso() {
        return anioIngreso;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getNombreCompleto(){
        return nombre + " " + apellido;
    }

    public abstract double getSalarioFinal();

    @Override
    public String toString() {
        return "Empleado{" + "DNI=" + DNI + ", nombre='" + nombre + '\'' + ", apellido='" + apellido + '\'' + ", anioIngreso=" + anioIngreso + '}';
    }
}
