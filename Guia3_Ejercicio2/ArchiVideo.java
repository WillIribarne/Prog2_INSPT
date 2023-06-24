package Guia3_Ejercicio2;

public class ArchiVideo extends ArchiMultimedia{

    private int alto;
    private int ancho;
    private FormatoVideo formato;

    public ArchiVideo(String nombre, int peso, String localizacion, Boolean estaAbierto, int duracion, Boolean estaEnReproduccion, int alto, int ancho, FormatoVideo formato) {
        super(nombre, peso, localizacion, estaAbierto, duracion, estaEnReproduccion);
        this.alto = alto;
        this.ancho = ancho;
        this.formato = formato;
    }

    @Override
    public String toString() {
        return "ArchiVideo{" +
                "alto=" + alto +
                ", ancho=" + ancho +
                ", formato=" + formato +
                '}';
    }
}
