package Guia3_Ejercicio2;

public class ArchiAudio extends ArchiMultimedia{

    private String artista;
    private String album;

    public ArchiAudio(String nombre, int peso, String localizacion, Boolean estaAbierto, int duracion, Boolean estaEnReproduccion, String artista, String album) {
        super(nombre, peso, localizacion, estaAbierto, duracion, estaEnReproduccion);
        this.artista = artista;
        this.album = album;
    }


}
