package Guia2_Ejercicio10;

import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        ArrayList<Artista> a = new ArrayList<>();
        ArrayList<Cancion> c = new ArrayList<>();
        ArrayList<Usuario> u = new ArrayList<>();
        ArrayList<Usuario> likes = new ArrayList<>();
        u.add(new Usuario("EduTron5000", EstadoUsuario.PRUEBA_GRATIS));
        u.add(new Usuario("reysaktor", EstadoUsuario.HABILITADO));
        u.add(new Usuario("Lautyg0d33", EstadoUsuario.SUSPENDIDO));
        likes.add(u.get(0));
        likes.add(u.get(2));
        c.add(new Cancion(1, "Sabalero", 304, likes));
        c.add(new Cancion(2, "Sabalero Remix Ft. Dua Lipa", 185, likes));
        a.add(new Artista(12345,"Los Palmeras", c));
        Clonify clonify = new Clonify(a, u);
        clonify.mostrarDuracionPromedio(a.get(0));
        System.out.println(a.get(0).esFanDestacado(u.get(2)));
        ArrayList<Cancion> p5 =  clonify.primeras5Canciones(a.get(0));
        for (Cancion ca: p5) {
            System.out.println(ca);
        }
        System.out.println(clonify.borrarUsuario("reysaktor"));
    }
}
