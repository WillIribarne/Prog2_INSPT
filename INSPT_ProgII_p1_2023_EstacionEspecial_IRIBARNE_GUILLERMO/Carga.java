package PrimerParcial2023;

public class Carga {
    private String descripcion;
    private int volumen;

    public Carga(String descripcion, int volumen) {
        this.descripcion = descripcion;
        this.volumen = volumen;
    }

    public int getVolumen() {
        return volumen;
    }

    public String getDescripcion() {
        return descripcion;
    }
}
