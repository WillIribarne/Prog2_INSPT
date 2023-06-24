package Guia3_Ejercicio10;

import java.util.ArrayList;

public class Programa implements Calificable{
    private int ID;
    private String nombre;
    private String nombreResponsable;
    private boolean flagPruebas;
    private ArrayList<Fuente> fuentes;

    public Programa(int ID, String nombre, String nombreResponsable, boolean flagPruebas, ArrayList<Fuente> fuentes) {
        this.ID = ID;
        this.nombre = nombre;
        this.nombreResponsable = nombreResponsable;
        this.flagPruebas = flagPruebas;
        this.fuentes = fuentes;
    }

    public void mostrarDetalleDeMetodo(String nombreMetodo){
        Metodo m = existeMetodo(nombreMetodo);
        if (m != null){
            System.out.println("Metodo: " + nombreMetodo);
            System.out.println("Parametros: " + m.getCantParametros());
            System.out.println("Instrucciones: " + m.getCantInstrucciones());
            System.out.println("Ramificaciones: " + m.getCantRamificaciones());
        } else {
            System.out.println("El metodo indicado no existe en este programa");
        }
    }

    private Metodo existeMetodo(String nombreMetodo){
        Metodo m = null;
        int i = 0;
        while (i < this.fuentes.size() && m == null){
            Fuente f = this.fuentes.get(i);
            if (f instanceof FuenteLengProgramacion){
                m = f.existeMetodo(nombreMetodo);
            }
            i++;
        }
        return m;
    }

    public ArrayList<Fuente> listadoFuentesMayoresAlPromedio(){
        ArrayList<Fuente> fuentesMayoresAlPromedio = new ArrayList<>();
        double promedio = ControlDeCalidad.promedioCalidadFuentes(this.fuentes);
        for (Fuente f: this.fuentes) {
            if (f.getIndiceCalidad() > promedio){
                fuentesMayoresAlPromedio.add(f);
            }
        }
        return fuentesMayoresAlPromedio;
    }

    @Override
    public String toString() {
        return "Programa{" +
                "ID=" + ID +
                ", nombre='" + nombre + '\'' +
                ", nombreResponsable='" + nombreResponsable + '\'' +
                ", flagPruebas=" + flagPruebas +
                ", fuentes=" + fuentes +
                '}';
    }

    @Override
    public double getIndiceCalidad() {
        double n = 0;
        if (this.flagPruebas){
            n = ControlDeCalidad.promedioCalidadFuentes(this.fuentes);
        }
        return n;
    }
}
