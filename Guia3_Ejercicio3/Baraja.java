package Guia3_Ejercicio3;

import java.util.ArrayList;
import java.util.Collections;

public class Baraja {

    private ArrayList<Carta> cartas = new ArrayList<>();

    public Baraja(){

    }

    public void cargarBaraja(){
        cargarCartasNumericas();
        cargarCartasLetras();
        cargarCartasJoker();
    }

    public void cargarCartasNumericas(){
        final int MIN_VALOR = 2;
        final int MAX_VALOR = 10;
        Palo[] palos = Palo.values(); /* values devuelve los valores del enum */

        for (int i = MIN_VALOR; i <= MAX_VALOR; i++){
            for (int p = 0; p < 4; p++){
                this.cartas.add(new CartaNumerica(i, palos[p]));
            }
        }
    }
    public void cargarCartasLetras(){
        char[] letras = {'A', 'J', 'Q', 'K'};
        Palo[] palos = Palo.values();
        for (int i = 0; i < 4; i++){
            for (int p = 0; p < 4; p++){
                this.cartas.add(new CartaLetra(letras[i], palos[p]));
            }
        }
    }
    public void cargarCartasJoker(){
        cartas.add(new CartaJoker(true));
        cartas.add(new CartaJoker(false));
    }

    public void mostrarBaraja(){
        for (Carta carta: this.cartas){
            carta.darVuelta();
            carta.mostrar();
        }
    }
    public void mezclarBaraja(){
        Collections.shuffle(cartas);
    }
}
