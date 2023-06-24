package Guia3_Ejercicio6;

public class BiciElectrica extends Bicicleta{
    private int potencia;

    public BiciElectrica(String marca, String modelo, int cantKm, int potencia) {
        super(marca, modelo, cantKm);
        this.potencia = potencia;
    }
    public boolean puedeRecibirServicio(){
        return (this.potencia <= 250 && this.getCantKm() < 2000);
    }
}
