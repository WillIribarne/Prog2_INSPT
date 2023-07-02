package PrimerParcial_EfectoInvernadero;

import java.util.ArrayList;

public abstract class Area {
    private static final double MIN_TEMP = -100;
    private int extension;
    private int elevacion;
    private ArrayList<Double> temperaturasMedias;

    public Area(int extension, int elevacion, ArrayList<Double> temperaturasMedias) {
        this.extension = extension;
        this.elevacion = elevacion;
        this.temperaturasMedias = temperaturasMedias;
    }

    public int getElevacion(){
        return this.elevacion;
    }

    public abstract boolean estaEnPeligro();

    public double getTemperaturaPromedio(){
        double sumaTemp = 0;
        for (double t: temperaturasMedias) {
            sumaTemp += t;
        }
        return sumaTemp / temperaturasMedias.size();
    }

    public double getTemperaturaMaximaRegistrada(){
        double tempMax = MIN_TEMP;
        for (double t: temperaturasMedias) {
            if (tempMax < t){
                tempMax = t;
            }
        }
        return tempMax;
    }
}
