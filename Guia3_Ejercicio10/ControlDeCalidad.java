package Guia3_Ejercicio10;

import java.util.ArrayList;

public abstract class ControlDeCalidad {
    public static double promedioCalidadFuentes(ArrayList<Fuente> fuentes){
        return getIndiceTotal(fuentes) / fuentes.size();
    }

    public static double getIndiceCalidadMetodos(ArrayList<Metodo> metodos){
        return getIndiceTotal(metodos);
    }

    public static double getIndiceTotal(ArrayList<? extends Calificable> calificables){
        double indiceCalidad = 0;
        for (Calificable c: calificables) {
            indiceCalidad += c.getIndiceCalidad();
        }
        return indiceCalidad;
    }
}
