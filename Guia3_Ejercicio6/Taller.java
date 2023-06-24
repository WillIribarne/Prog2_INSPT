package Guia3_Ejercicio6;

import java.util.ArrayList;

public class Taller {
    private ArrayList<Bicicleta> bicicletas;

    public Taller() {
        this.bicicletas = new ArrayList<>();
    }

    public void agregaBici(Bicicleta b){
        this.bicicletas.add(b);
    }

    public void agregaGrupoBicis(ArrayList<Bicicleta> bicis){
        for (Bicicleta b: bicis){
            agregaBici(b);
        }
    }

    public int CantServiciosPosibles(ArrayList<Bicicleta> bicis){
        int cantServPos = 0;
        for (Bicicleta b: bicis){
            if (b.puedeRecibirServicio()){
                cantServPos++;
            }
        }
        return cantServPos;
    }
}
