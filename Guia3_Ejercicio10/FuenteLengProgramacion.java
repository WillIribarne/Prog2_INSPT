package Guia3_Ejercicio10;

import java.util.ArrayList;

public class FuenteLengProgramacion extends Fuente{
    private ArrayList<Metodo> metodos;
    private LenguajesProgra lenguaje;

    public FuenteLengProgramacion(String nombre, String path, ArrayList<Metodo> metodos, LenguajesProgra lenguaje) {
        super(nombre, path);
        this.metodos = metodos;
        this.lenguaje = lenguaje;
    }

    public Metodo existeMetodo(String nombreMetodo){
        Metodo m = null;
        int i = 0;
        while (i < this.metodos.size() && m == null){
            if (this.metodos.get(i).esNombreIgualA(nombreMetodo)){
                m = this.metodos.get(i);
            } else {
                i++;
            }
        }
        return m;
    }

    @Override
    public String toString() {
        return "FuenteLengProgramacion{" +
                "metodos=" + metodos +
                ", lenguaje=" + lenguaje +
                '}';
    }

    @Override
    public double getIndiceCalidad() {
        double n = 0;
        if (!this.metodos.isEmpty()){
            n = ControlDeCalidad.getIndiceCalidadMetodos(this.metodos);
        }
        return n;
    }
}
