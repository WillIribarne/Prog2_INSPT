package Guia1_Ejercicio13;

public class Ticket {
    private String nombre;
    private String ape;
    private double montoTot;
    private double montoCuota;

    public Ticket(String nombre, String ape, double montoTot, double montoCuota) {
        this.nombre = nombre;
        this.ape = ape;
        this.montoTot = montoTot;
        this.montoCuota = montoCuota;
    }

    @Override
    public String toString() {
        return "SU TICKET: " +
                "nombre: '" + nombre + '\'' +
                ", ape: '" + ape + '\'' +
                ", montoTot=" + montoTot +
                ", montoCuota=" + montoCuota;
    }
}
