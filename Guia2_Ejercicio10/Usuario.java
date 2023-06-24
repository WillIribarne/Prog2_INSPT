package Guia2_Ejercicio10;

import java.util.ArrayList;

public class Usuario {
    private String nombre;
    private EstadoUsuario estadoUsuario;

    public Usuario(String nombre, EstadoUsuario estadoUsuario) {
        this.nombre = nombre;
        this.estadoUsuario = estadoUsuario;
    }

    public int getTotalCancionesLikeadas(ArrayList<Cancion> canciones){
        int likes = 0;
        for (Cancion i: canciones) {
            if (i.fueLikeadaPorUsuario(this.nombre)){
                likes++;
            }
        }
        return likes;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "nombre='" + nombre + '\'' +
                ", estadoUsuario=" + estadoUsuario +
                '}';
    }
}
