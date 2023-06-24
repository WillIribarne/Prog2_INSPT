package Guia3_Ejercicio6;

public class Bicicleta {
    private String marca;
    private String modelo;
    private int cantKm;

    public Bicicleta(String marca, String modelo, int cantKm) {
        this.marca = marca;
        this.modelo = modelo;
        this.cantKm = cantKm;
    }

    public int getCantKm() {
        return cantKm;
    }

    public boolean puedeRecibirServicio(){
        return this.cantKm < 2000;
    }
}
