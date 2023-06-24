package Guia1_Ejercicio9;

public class Persona {

    private String nombre;
    private String apellido;
    private Fecha fecha;
    private Domicilio domicilio;

    public Persona(String nombre, String apellido, Fecha fecha, Domicilio domicilio) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fecha = fecha;
        this.domicilio = domicilio;
    }

    public void setDomicilio(Domicilio domicilio){
        this.domicilio = domicilio;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", fecha=" + fecha +
                ", domicilio=" + domicilio +
                '}';
    }
}
