package Guia2_Ejercicio4;

public class Vehiculo {
    private String patente;
    private double precio;
    private TipoVehiculo tipo;

    public Vehiculo(String patente, double precio, TipoVehiculo tipo) {
        this.patente = patente;
        this.precio = precio;
        this.tipo = tipo;
    }

    public TipoVehiculo getTipo() {
        return tipo;
    }

    public String getPatente() {
        return patente;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "patente='" + patente + '\'' +
                ", precio=" + precio +
                ", tipo=" + tipo +
                '}';
    }
}
