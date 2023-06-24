package Guia3_Ejercicio10;

import java.util.ArrayList;

public class Sophie {
    private ArrayList<Programa> programas;

    public Sophie(ArrayList<Programa> programas) {
        this.programas = programas;
    }

    public ArrayList<Programa> programasPorDebajoDe(double calidadMin){
        ArrayList<Programa> programasBajoCalidad = new ArrayList<>();

        for (Programa p: this.programas) {
            if (p.getIndiceCalidad() < calidadMin){
                programasBajoCalidad.add(p);
            }
        }
        return programasBajoCalidad;
    }
}
