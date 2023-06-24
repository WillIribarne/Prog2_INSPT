package Guia2_Ejercicio3;

import java.util.ArrayList;

public class Alumno {
    private String nombre;
    private int DNI;
    private ArrayList<Evaluacion> evaluaciones;

    public Alumno(String nombre, int DNI) {
        this.nombre = nombre;
        this.DNI = DNI;
        this.evaluaciones = new ArrayList<>();
    }

    public double promedioAlumno(){
        double prom = 0;
        for (Evaluacion ev: this.evaluaciones){
            prom += ev.getNota();
        }
        return prom / evaluaciones.size();
    }

    public int devuelveCantEvaluaciones(){
        return evaluaciones.size();
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "nombre='" + nombre + '\'' +
                ", DNI=" + DNI +
                ", evaluaciones=" + evaluaciones +
                '}';
    }
}
