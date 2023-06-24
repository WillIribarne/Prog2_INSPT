package Guia2_Ejercicio10;

import java.util.ArrayList;

public class Clonify {
    private ArrayList<Artista> artistas;
    private ArrayList<Usuario> usuarios;

    public Clonify() {
        this.artistas = new ArrayList<>();
        this.usuarios = new ArrayList<>();
    }

    public Clonify(ArrayList<Artista> a, ArrayList<Usuario> u){
        this.artistas = a;
        this.usuarios = u;
    }

    public void mostrarDuracionPromedio(Artista a){
        int duracionPromedio = a.getDuracionPromedioCanciones();
        int min = duracionMinutos(duracionPromedio);
        int seg = duracionSegundos(duracionPromedio);
        System.out.println("La duracion promedio de las canciones de" + a.getNombre() + " es de " + min + " minutos, " + seg + " segundos.");
    }

    public ArrayList<Cancion> primeras5Canciones(Artista a){
        ArrayList<Cancion> prim5Canciones = a.getPrimeras5Canciones();
        return prim5Canciones;
    }

    public Usuario borrarUsuario(String nombreUsuario){
        Usuario sePudoBorrar = sePudoBorrar(nombreUsuario);

        if (sePudoBorrar != null){ //algo aca explota, arreglar
            borrarLikesDeUsuario(nombreUsuario);

        }
        return sePudoBorrar;
    }

    private int duracionMinutos(int n){
        return n / 60;
    }

    private int duracionSegundos(int n){
        return n % 60;
    }

    private Usuario sePudoBorrar(String nombreUsuario){
        Usuario sePudoBorrar = null;
        int i = 0;
        while (i < this.usuarios.size() && sePudoBorrar == null){
            Usuario us = this.usuarios.get(i);
            if (us.getNombre().equals(nombreUsuario)){
                sePudoBorrar = us;
                this.usuarios.remove(us);
            }
            i++;
        }
        return sePudoBorrar;
    }
    private void borrarLikesDeUsuario(String nombreUsuario){
        for (Artista a: this.artistas) {
            a.borrarLikeDeUsuario(nombreUsuario);
        }
    }
}
