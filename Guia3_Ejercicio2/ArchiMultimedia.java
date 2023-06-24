package Guia3_Ejercicio2;

public abstract class ArchiMultimedia extends Archivo{

    private int duracion;
    private Boolean estaEnReproduccion;

    public ArchiMultimedia(String nombre, int peso, String localizacion, Boolean estaAbierto, int duracion, Boolean estaEnReproduccion) {
        super(nombre, peso, localizacion, estaAbierto);
        this.duracion = duracion;
        this.estaEnReproduccion = estaEnReproduccion;
    }

    public void reproducir(){
        if (estaEnReproduccion){
            System.out.println("El archivo ya esta en reproduccion");
        } else {
            estaEnReproduccion = true;
        }
    }
    public void parar(){
        if (!estaEnReproduccion){
            System.out.println("El archivo ya esta parado");
        } else {
            estaEnReproduccion = false;
        }
    }
}
