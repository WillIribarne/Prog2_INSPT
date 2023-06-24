package Guia3_Ejercicio9;

public class Insumo {
    private String nombre;
    private int porcentajeGanancia;
    private double precioLista;
    private Tipo tipo;

    public Insumo(String nombre, int porcentajeGanancia, double precioLista, Tipo tipo) {
        this.nombre = nombre;
        this.porcentajeGanancia = porcentajeGanancia;
        this.precioLista = precioLista;
        this.tipo = tipo;
    }

    public double getMontoTotal(){
        return precioLista + Matematica.sumarPorcentaje(precioLista, porcentajeGanancia) + Matematica.sumarIVA(precioLista);
    }
}
