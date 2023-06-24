package Guia2_Ejercicio3;

import java.util.ArrayList;

public class Curso {
    private String codigo;
    private String titulo;
    private int cantHoras;
    private ArrayList<Alumno> alumnos;

    public Curso(String codigo, String titulo, int cantHoras) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.cantHoras = cantHoras;
        this.alumnos = new ArrayList<>();
    }

    public ArrayList<Alumno> buscarAlumnoPorEncimaDe(double promedio){
        ArrayList<Alumno> lista = new ArrayList<Alumno>();
        for(Alumno a: this.alumnos){
            if (a.devuelveCantEvaluaciones() >= 2 && promedio <= a.promedioAlumno()){
                lista.add(a);
            }
        }
        return lista;
    }
}
