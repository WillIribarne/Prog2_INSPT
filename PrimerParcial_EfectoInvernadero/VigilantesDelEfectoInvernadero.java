package PrimerParcial_EfectoInvernadero;

import java.util.ArrayList;

public class VigilantesDelEfectoInvernadero {
    private static final double MIN_TEMP = -100;
    ArrayList<Area> areas;

    public VigilantesDelEfectoInvernadero(ArrayList<Area> areas) {
        this.areas = areas;
    }

    public int getAreasEnPeligro(){
        int areasEnPeligro = 0;
        for (Area a: areas) {
            if (a.estaEnPeligro()){
                areasEnPeligro++;
            }
        }
        return areasEnPeligro;
    }

    public double getTempMaximaAreasTundra(){
        int i = 0;
        double tempMax = MIN_TEMP;
        while (i < areas.size()){
            if (areas.get(i) instanceof AreaTundra){
                double t = areas.get(i).getTemperaturaMaximaRegistrada();
                if (t > tempMax){
                    tempMax = t;
                }
            }
            i++;
        }
        return tempMax;
    }

    public void muestraCantidadAreasEnPeligro(){
        System.out.println("Cantidad de áreas en peligro: " + getAreasEnPeligro());
    }

    public void muestraTempMaximaAreasTundra(){
        System.out.println("Temperatura maxima registrada en áreas de Tundra: " + getTempMaximaAreasTundra() + "°C. ");
    }
}
