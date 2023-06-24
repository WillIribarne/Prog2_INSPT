package Guia1_Ejercicio4;

public class main {
    public static void main(String[] args) {
        Fecha fecha = new Fecha (25, 11, 1999);
        System.out.println(fecha.toString());
        System.out.println(fecha.esNavidad());
        fecha.sumaMes();
        System.out.println(fecha.toString());
    }
}
