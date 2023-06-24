package Guia2_Ejercicio2;

import Guia2_Ejercicio1.Domicilio;

public class Propiedad {
    private Domicilio dom;
    private double precio;
    private TipoVivienda tipo;

    public Propiedad(Domicilio dom, double precio, TipoVivienda tipo) {
        this.dom = dom;
        this.precio = precio;
        this.tipo = tipo;
    }

    public double getPrecio() {
        return precio;
    }

    public TipoVivienda getTipo() {
        return tipo;
    }
}
