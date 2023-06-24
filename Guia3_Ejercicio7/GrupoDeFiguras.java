package Guia3_Ejercicio7;

import java.util.ArrayList;

public class GrupoDeFiguras {
    ArrayList<Figura> figuras;

    public void muestraInfoFiguras(){
        for (Figura f: figuras) {
            System.out.println("Color: " + f.getColor());
            System.out.println("Area: " + f.area());
            System.out.println("Perimetro: " + f.perimetro());
        }
    }
}
