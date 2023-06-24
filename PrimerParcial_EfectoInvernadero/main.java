package PrimerParcial_EfectoInvernadero;

import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        ArrayList<Area> areas = new ArrayList<>();
        ArrayList<Double> t1 = new ArrayList<>();
        ArrayList<Double> t2 = new ArrayList<>();
        ArrayList<Double> t3 = new ArrayList<>();
        t1.add(8.0); t1.add(-1.0); t1.add(13.0); t1.add(4.0); t1.add(1.0); t1.add(-6.0);
        t2.add(-5.0); t2.add(3.0); t2.add(-9.0); t2.add(-12.0); t2.add(0.0); t2.add(4.0);
        t3.add(4.0); t3.add(12.0); t3.add(3.0); t3.add(9.0); t3.add(1.0); t3.add(10.0);
        AreaGelida a1 = new AreaGelida(123, 321, t1, 60);
        AreaTundra a2 = new AreaTundra(550, 430, t2, 1800);
        AreaTundraPolar a3 = new AreaTundraPolar( 340, 110, t3, 800, IntensidadViento.FUERTE);

        areas.add(a1);
        areas.add(a2);
        areas.add(a3);

        VigilantesDelEfectoInvernadero vigilantes = new VigilantesDelEfectoInvernadero(areas);


        vigilantes.muestraCantidadAreasEnPeligro();
        vigilantes.muestraTempMaximaAreasTundra();
    }
}
