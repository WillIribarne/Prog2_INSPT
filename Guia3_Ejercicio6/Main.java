package Guia3_Ejercicio6;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Bicicleta> bicis = new ArrayList<>();
        bicis.add(new Bicicleta("Rodolfito", "UK455", 1400));
        bicis.add(new BiciElectrica("Manolito", "AKG655", 500, 230));
        bicis.add(new BiciElectrica("Conosito", "PPW123", 20, 400));
        bicis.add(new Bicicleta("Santito", "LPM901", 5400));
        bicis.add(new Bicicleta("Pablito", "AYT22", 2000));

        Taller t = new Taller();
        t.agregaGrupoBicis(bicis);
        System.out.println(t.CantServiciosPosibles(bicis));
    }
}