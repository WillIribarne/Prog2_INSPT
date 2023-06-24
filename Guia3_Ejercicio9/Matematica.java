package Guia3_Ejercicio9;

public class Matematica {
    private static final int IVA = 21;
    public static double sumarPorcentaje(double valor, int porcentaje){
        return valor * porcentaje / 100;
    }

    public static double sumarIVA(double valor){
        return valor * Matematica.IVA / 100;
    }
}
