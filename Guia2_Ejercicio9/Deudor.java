package Guia2_Ejercicio9;

public class Deudor {
    private String patente;
    private int mesesDeuda;

    public Deudor(String patente, int mesesDeuda) {
        this.patente = patente;
        this.mesesDeuda = mesesDeuda;
    }

    public String getPatente() {
        return patente;
    }

    public int getMesesDeuda() {
        return mesesDeuda;
    }
}
