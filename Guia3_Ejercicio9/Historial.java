package Guia3_Ejercicio9;

import java.util.ArrayList;

public class Historial {
    private ArrayList<Insumo> insumosVendidos;
    private ArrayList<Servicio> serviciosPrestados;


    public Historial() {
        this.insumosVendidos = new ArrayList<>();
        this.serviciosPrestados = new ArrayList<>();
    }

    public void agregaListaInsumos(ArrayList<Insumo> insumos){
        this.insumosVendidos.addAll(insumos);
    }

    public void agregaListaServicios(ArrayList<Servicio> servicios){
        this.serviciosPrestados.addAll(servicios);
    }

    public double getMontoTotalFacturado(){
        double montoTotal = 0;
        for (Insumo i: insumosVendidos){
            montoTotal += i.getMontoTotal();
        }
        for (Servicio s: serviciosPrestados){
            montoTotal += s.getMontoTotal();
        }
        return montoTotal;
    }

    public int getCantServiciosSimples(){
        int servSimples = 0;
        for (Servicio s: serviciosPrestados){
            if (s instanceof ServicioReparacion){
                if (((ServicioReparacion) s).esServSimple()){
                    servSimples++;
                }
            }
        }
        return servSimples;
    }
}
