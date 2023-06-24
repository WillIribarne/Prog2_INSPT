package Guia2_Ejercicio9;

import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        /* Persona p1 = new Persona(41823445, "Santiago Brussio");
        Persona p2 = new Persona(1234567, "El Ierigol");
        Persona p3 = new Persona(91919, "Facun't");
        Persona p4 = new Persona(69, "Edu neira");
        Persona p5 = new Persona(1, "El Kimaniatico");
        Persona p6 = new Persona(123532, "Maribel");


        ArrayList<Persona> personas1 = new ArrayList<Persona>();
        ArrayList<Persona> personas2 = new ArrayList<Persona>();
        ArrayList<Persona> personas3 = new ArrayList<Persona>();

        personas1.add(p1);
        personas1.add(p2);

        personas2.add(p3);
        personas2.add(p4);

        personas3.add(p5);
        personas3.add(p6);

        ArrayList<Vehiculo> estacionados = new ArrayList<>();
        ArrayList<Vehiculo> retirados = new ArrayList<>();

        Vehiculo v1 = new Vehiculo("A5DR34", personas1, 0);
        Vehiculo v2 = new Vehiculo("Q44YP2", personas2, 4);
        Vehiculo v3 = new Vehiculo("OH3LB3B3", personas2, 2); */

        Empresa e = new Empresa("FooParking");
        e.addGarage("A1");
        Garage g = e.getGarages().get(0);

        g.estacionarVehiculo("A5DR34");
    }
}
