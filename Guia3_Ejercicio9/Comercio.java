package Guia3_Ejercicio9;

import java.util.ArrayList;

public class Comercio {
    private Historial historial;
    public Historial getHistorial() {
        return historial;
    }
    public Comercio(Historial historial) {
        this.historial = historial;
    }
    public double montoTotalFacturado(){
        return historial.getMontoTotalFacturado();
    }

    public int cantServiciosSimples(){
        return historial.getCantServiciosSimples();
    }
}
