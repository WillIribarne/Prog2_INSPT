package Guia3_Ejercicio10;

public class FuenteLengMarcado extends Fuente{
    private double tamanioArchivoKB;
    private LenguajesMarcado lenguaje;

    public FuenteLengMarcado(String nombre, String path, int tamanioArchivoKB, LenguajesMarcado lenguaje) {
        super(nombre, path);
        this.tamanioArchivoKB = tamanioArchivoKB;
        this.lenguaje = lenguaje;
    }

    @Override
    public String toString() {
        return "FuenteLengMarcado{" +
                "tamanioArchivoKB=" + tamanioArchivoKB +
                ", lenguaje=" + lenguaje +
                '}';
    }

    @Override
    public double getIndiceCalidad() {
        return 450 / this.tamanioArchivoKB;
    }
}
