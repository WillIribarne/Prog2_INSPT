package Guia1_Ejercicio12;

import Guia1_Ejercicio9.Fecha;

public class Documento {
    Fecha fecha;
    String titulo;
    String cuerpo;

    public Documento(Fecha fecha, String titulo, String cuerpo) {
        this.fecha = fecha;
        this.titulo = titulo;
        this.cuerpo = cuerpo;
    }

    public Fecha getFecha() {
        return fecha;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getCuerpo() {
        return cuerpo;
    }

    @Override
    public String toString() {
        return "Documento{" +
                "fecha=" + fecha +
                ", titulo='" + titulo + '\'' +
                ", cuerpo='" + cuerpo + '\'' +
                '}';
    }
}
