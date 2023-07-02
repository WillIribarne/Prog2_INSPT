package PrimerParcial2023;

import java.util.ArrayList;

public class EstacionAtlantis {
    private ArrayList<PuntoDeAtraque> puntosDeAtraque;

    public EstacionAtlantis(ArrayList<PuntoDeAtraque> puntosDeAtraque) {
        this.puntosDeAtraque = puntosDeAtraque;
    }

    public void mostrarManifiestos(){
        int i = 1;
        for (PuntoDeAtraque p: puntosDeAtraque) {
            System.out.println("Punto de Atraque " + i + ":");
            p.mostrarManifiestoNaveEstacionada();
            i++;
            System.out.println();
        }
    }

    public void estacionarNave(Nave n){
        boolean hayPuntoLibre = false;
        int i = 0;
        while (!hayPuntoLibre && i < puntosDeAtraque.size()){
            PuntoDeAtraque p = puntosDeAtraque.get(i);
            if (p.getNave() == null){
                hayPuntoLibre = true;
                p.estacionarNave(n);
            } else {
                i++;
            }
        }
        if (i == puntosDeAtraque.size()){
            muestraNoHayPuntosDisponibles();
        }
    }

    public void muestraNoHayPuntosDisponibles(){
        System.out.println("No hay puntos de atraco disponibles. Estacionamiento imposible.");
    }
}
