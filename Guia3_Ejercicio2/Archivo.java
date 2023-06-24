package Guia3_Ejercicio2;

public class Archivo {
    private String nombre;
    private int peso;
    private String localizacion;
    private Boolean estaAbierto;

    public Archivo(String nombre, int peso, String localizacion, Boolean estaAbierto) {
        this.nombre = nombre;
        this.peso = peso;
        this.localizacion = localizacion;
        this.estaAbierto = estaAbierto;
    }

    public Boolean getEstaAbierto() {
        return estaAbierto;
    }

    public void abrir(){
        if (estaAbierto){
            System.out.println("El archivo ya esta abierto");
        } else {
            estaAbierto = true;
        }
    }

    public void cerrar(){
        if (!estaAbierto){
            System.out.println("El archivo ya esta cerrado");
        } else {
            estaAbierto = false;
        }
    }

    public void moverUbicacion(String localizacion){
        this.localizacion = localizacion;
    }

    @Override
    public String toString() {
        return "Archivo{" +
                "nombre='" + nombre + '\'' +
                ", peso=" + peso +
                ", localizacion='" + localizacion + '\'' +
                ", estaAbierto=" + estaAbierto +
                '}';
    }
}
