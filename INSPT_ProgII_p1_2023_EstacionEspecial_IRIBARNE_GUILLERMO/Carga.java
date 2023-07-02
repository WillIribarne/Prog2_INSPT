package INSPT_ProgII_p1_2023_EstacionEspecial_IRIBARNE_GUILLERMO;

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
