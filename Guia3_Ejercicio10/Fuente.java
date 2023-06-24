package Guia3_Ejercicio10;

public abstract class Fuente implements Calificable{
    private String nombre;
    private String path;

    public Fuente(String nombre, String path) {
        this.nombre = nombre;
        this.path = path;
    }

    public Metodo existeMetodo(String nombreMetodo){
        return null;
    }
}
