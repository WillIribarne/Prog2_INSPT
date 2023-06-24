package Guia2_Ejercicio10;

import java.util.ArrayList;

public class Cancion {
    private int ID;
    private String nombre;
    private int duracion;
    private ArrayList<Usuario> likes;

    public Cancion(int ID, String nombre, int duracion, ArrayList<Usuario> likes) {
        this.ID = ID;
        this.nombre = nombre;
        this.duracion = duracion;
        this.likes = likes;
    }

    public int getDuracion() {
        return duracion;
    }

    public boolean fueLikeadaPorUsuario(String nombreUsuario){
        boolean fueLikeada = false;
        int i = 0;
        while (likes.size() > i && !fueLikeada){
            if (likes.get(i).getNombre().equals(nombreUsuario)){
                fueLikeada = true;
            }
            i++;
        }
        return fueLikeada;
    }
    
    public void borrarLikeDeUsuario(String nombreUsuario){
        boolean seBorro = false;
        int i = 0;
        while (i < this.likes.size() && !seBorro){
            if (this.likes.get(i).getNombre().equals(nombreUsuario)){
                this.likes.remove(i);
                seBorro = true;
            }
            i++;
        }
        //this.likes.removeIf(l -> l.getNombre().equals(nombreUsuario));
    }

    @Override
    public String toString() {
        return "Cancion: {" +
                "ID=" + ID +
                ", nombre='" + nombre + '\'' +
                ", duracion=" + duracion + "s" +
                ", likes=" + likes +
                '}';
    }
}
