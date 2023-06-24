package Guia1_Ejercicio2;

public class main {
    public static void main(String[] args) {
        Empleado empleado = new Empleado(41823445, "Juan", "Dominguez", 10000, EstadoCivil.CASADO, 0);

        System.out.println(empleado.toString());
        System.out.println("Salario Final: " + empleado.obtenerSalarioFinal());
    }
}
