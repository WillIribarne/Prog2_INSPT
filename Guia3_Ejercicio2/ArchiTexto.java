package Guia3_Ejercicio2;

public class ArchiTexto extends Archivo {

    private Codificacion codificacion;

    public ArchiTexto(String nombre, int peso, String localizacion, Boolean estaAbierto) {
        super(nombre, peso, localizacion, estaAbierto);
        this.codificacion = Codificacion.UTF_8;
    }

    public void cifrarContenido(Codificacion codificacion){
        this.codificacion = codificacion;
    }
}
