package Guia2_Ejercicio9;

import java.util.ArrayList;

public class Tablero {
    private ArrayList<Llave> llaves;

    public Tablero() {
        this.llaves =new ArrayList<>();
    }

    public void loadTablero(ArrayList<Llave> llaves) {
        this.llaves = llaves;
    }

    public boolean estaLlave(String pat){
        boolean estaLlave = false;
        for (Llave l: llaves) {
            if (l.getPatente().equals(pat)){
                estaLlave = true;
                break;
            }
        }
        return estaLlave;
    }
}
