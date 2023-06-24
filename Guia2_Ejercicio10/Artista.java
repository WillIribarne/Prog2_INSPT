package Guia2_Ejercicio10;

import java.util.ArrayList;

public class Artista {
    private int ID;
    private String nombre;
    private ArrayList<Cancion> canciones;

    public Artista(int ID, String nombre, ArrayList<Cancion> canciones) {
        this.ID = ID;
        this.nombre = nombre;
        this.canciones = canciones;
    }

    public boolean esFanDestacado(Usuario u){
        return (canciones.size() / 2) < u.getTotalCancionesLikeadas(this.canciones);
    }

    public int getDuracionPromedioCanciones(){
        return getDuracionTotalCanciones() / this.canciones.size();
    }

    private int getDuracionTotalCanciones(){
        int dTotal = 0;
        for (int i = 0; i < this.canciones.size(); i++) {
            dTotal += this.canciones.get(i).getDuracion();
        }
        return dTotal;
    }

    public String getNombre() {
        return nombre;
    }

    public ArrayList<Cancion> getPrimeras5Canciones(){
        ArrayList<Cancion> primeras5Canciones = new ArrayList<>();
        for (int i = 0; i < this.canciones.size() && i < 5; i++) {
            primeras5Canciones.add(this.canciones.get(i));
        }
        return primeras5Canciones;
    }

    public ArrayList<Cancion> getCanciones() {
        return canciones;
    }

    public void borrarLikeDeUsuario(String nombreUsuario){
        for (Cancion c: this.canciones) { //modificar para no romper el encapsulamiento
            c.borrarLikeDeUsuario(nombreUsuario);
        }
    }
}
