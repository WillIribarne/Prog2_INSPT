package Guia1_Ejercicio1;

import java.time.LocalDate;

public class Persona {
    //Se crean los ATRIBUTOS. Estos tienen que ser privados.
    private String nombre;
    private String apellido;
    private int anioNacimiento;

    public Persona(String nombre, String apellido, int anioNacimiento) { //Esto es un constructor. Esto permite "rellenar" los atributos del objeto recien creado.
        setNombre(nombre);
        setApellido(apellido);
        setAnioNacimiento(anioNacimiento);
    }

    public String nombreCompleto(){ //devuelve "nombre" y "apellido"
        return nombre + " " + apellido;
    }

    public void mostrarEstado(){ //muestra los atributos del objeto. NOTA: 'sout' es tipo void, y la funcion no devuelve nada (por ende, tambien es void)
        System.out.println(toString());
    }

    public int getEdad(){ //devuelve la cantidad de años que tiene
        int anioActual = LocalDate.now().getYear(); // LocalDate.now().getYear() para sacar el año actual
        return anioActual - anioNacimiento;
    }

    public boolean esMayorAUnaEdad(int UnaEdad){ //devuelve si es mayor (True) o no (False). NOTA: este return se puede printear directamente en 'sout'.
        return getEdad() >= UnaEdad;
    }

    public void cambiarNombreYApellido(String nuevoNombre, String nuevoApellido){ //cambia nombre y apellido de un objeto de clase 'persona'
        setNombre(nuevoNombre);
        setApellido(nuevoApellido);

    }

    //Setters y Getters. Los Setters tienen el if para validar los datos (obligatorio)
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre != null && nombre.length() >= 3){
            this.nombre = nombre;
        }
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        if (apellido != null && apellido.length() >= 3) {
            this.apellido = apellido;
        }
    }

    public int getAnioNacimiento() {
        return anioNacimiento;
    }

    public void setAnioNacimiento(int anioNacimiento) {
        if (anioNacimiento > 1800 && anioNacimiento <= LocalDate.now().getYear()) {
            this.anioNacimiento = anioNacimiento;
        }
    }

    @Override
    public String toString() {
        return "Ejercicio1.Persona{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", anioNacimiento=" + anioNacimiento +
                '}';
    }
}
