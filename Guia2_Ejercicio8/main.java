package Guia2_Ejercicio8;

import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        ArrayList<Pieza> pOperativas = new ArrayList<>();
        ArrayList<Pieza> pNoOperativas = new ArrayList<>();
        pOperativas.add(new Pieza("Bateria de litio"));
        pOperativas.add(new Pieza("Sensor de proximidad"));
        pNoOperativas.add(new Pieza("Visor nocturno"));
        Droide dr = new Droide(pOperativas, pNoOperativas);
        dr.autoRepararse();
    }
}
