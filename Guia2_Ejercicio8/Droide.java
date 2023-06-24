package Guia2_Ejercicio8;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Objects;

public class Droide {
    ArrayList<Pieza> piezasOperativas;
    ArrayList<Pieza> piezasNoOperativas;

    public Droide(ArrayList<Pieza> piezasOperativas, ArrayList<Pieza> piezasNoOperativas) {
        this.piezasOperativas = piezasOperativas;
        this.piezasNoOperativas = piezasNoOperativas;
    }

    public void autoRepararse() {
        if (!estadoPerfecto()) {
            if (!piezasNoOperativas.isEmpty()){
                reparar();
                estadoPerfecto();
            }
        }
    }

    private boolean estadoPerfecto() {
        boolean estaPerfecto = false;
        if (estaPerfecto()) {
            System.out.println(EstadoDroide.COMPLETAMENTE_OPERATIVO);
            estaPerfecto = true;
        }
        return estaPerfecto;
    }

    private ArrayList<Pieza> devuelveArrayPiezasCompletas() {
        ArrayList<Pieza> p = new ArrayList<>();
        p.add(new Pieza("Bateria de litio"));
        p.add(new Pieza("Sensor de proximidad"));
        p.add(new Pieza("Visor nocturno"));
        return p;
    }

    private boolean estaPerfecto() {
        boolean estaPerf = true;
        if (this.piezasOperativas.size() != devuelveArrayPiezasCompletas().size()) {
            estaPerf = false;
        }
        return estaPerf;
    }

    public void reparar (){
        ArrayList<Pieza> p = devuelveArrayPiezasCompletas();
        ArrayList<Pieza> piezasFaltantes = devuelvePiezasFaltantes();
        int tamanioPiezasFaltantes = piezasFaltantes.size();

        if (piezasFaltantes.size() > 0){
            for (int i = 0; i < piezasFaltantes.size(); i++){
                String str = piezasFaltantes.get(i).getNombre();
                if (hayPiezaReemplazable(str)){
                    reemplazarPieza(str);
                    tamanioPiezasFaltantes--;
                }
            }
        }
        if (tamanioPiezasFaltantes == piezasFaltantes.size()){
            System.out.println(EstadoDroide.REPARACION_INCOMPLETA);
        } else {
            System.out.println(EstadoDroide.REPARACION_PARCIAL);
        }
    }

    public ArrayList<Pieza> devuelvePiezasFaltantes(){
        ArrayList<Pieza> piezasFaltantes = new ArrayList<>();
        ArrayList<Pieza> piezasCompletas = devuelveArrayPiezasCompletas();
        int cantPiezasOperativas = this.piezasOperativas.size();
        int k;
        for (int i = 0; i < piezasCompletas.size(); i++) {
            k = 0;
            String str = piezasCompletas.get(i).getNombre();
            boolean piezaEncontrada = false;
            while (cantPiezasOperativas > k && !piezaEncontrada){
                if (this.piezasOperativas.get(k).getNombre().equals(str)){
                    piezaEncontrada = true;
                } else {
                    k++;
                }
            }
            if (!piezaEncontrada){
                piezasFaltantes.add(piezasCompletas.get(i));
            }
        }
        return piezasFaltantes;
    }

    public boolean hayPiezaReemplazable(String str){
        int i = 0;
        boolean hayPiezaReemplazable = false;
        while (i < piezasNoOperativas.size() && !hayPiezaReemplazable){
            if (piezasNoOperativas.get(i).getNombre().equals(str)){
                hayPiezaReemplazable = true;
            }
            i++;
        }
            return hayPiezaReemplazable;
    }

    public void reemplazarPieza(String str){
        piezasOperativas.add(new Pieza(str));
        int i = 0;
        while (i < piezasNoOperativas.size()){
            if (piezasNoOperativas.get(i).getNombre().equals(str)){
                piezasNoOperativas.remove(i);
                i = piezasOperativas.size();
            } else {
                i++;
            }
        }
    }
}