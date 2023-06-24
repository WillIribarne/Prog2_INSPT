package Guia3_Ejercicio8;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Empleado> personal = new ArrayList<>();
        personal.add(new EmpleadoComision(41823445, "Lionel", "Messi", 2020, 6, 7350));
        personal.add(new EmpleadoSalarioFijo(39820344, "Rodrigo", "DePaul", 2015, 25000));
        personal.add(new EmpleadoSalarioFijo(35875622, "Nico", "Otamendi", 1998, 30000));
        personal.add(new EmpleadoComision(29856434, "Lautaro", "Martinez", 2009, 2, 5000));
        personal.add(new EmpleadoComision(45495743, "German", "Pezzella", 2001, 23, 2400));
        personal.add(new EmpleadoSalarioFijo(69, "Emiliano", "Martinez", 2022, 18000));

        Empresa e = new Empresa(personal);
        e.mostrarSalarios();
        System.out.println(e.empleadoConMasClientes());
    }
}