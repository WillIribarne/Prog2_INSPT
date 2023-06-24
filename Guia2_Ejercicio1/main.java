package Guia2_Ejercicio1;

import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        Agenda a = new Agenda();
        Persona p1 = new Persona("41823445", "Juan", "Lopez", new Domicilio("Chile", 1234, "Valparaiso"));
        Persona p2 = new Persona("20990100", "Juana", "Lopetegui", new Domicilio("Av Libertador", 433, "Belgrano"));
        Persona p3 = new Persona("12345678", "Edu", "Chileno", new Domicilio("Av 9 de Julio", 6666, "Microcentro"));
        Persona p4 = new Persona("21231342", "Mister", "K", new Domicilio("DouMomento", 5151, "Lanus"));

        /* a.agregarPersona(p1);
        a.agregarPersona(p2);
        a.agregarPersona(p3);
        a.agregarPersona(p4); */

        a.agregarPersona("41823445", "Juan", "Lopez", new Domicilio("Chile", 1234, "Valparaiso"));
        a.agregarPersona("20990100", "Juana", "Lopetegui", new Domicilio("Av Libertador", 433, "Belgrano"));
        a.agregarPersona("12345678", "Edu", "Chileno", new Domicilio("Av 9 de Julio", 6666, "Microcentro"));
        a.agregarPersona("21231342", "Mister", "K", new Domicilio("DouMomento", 5151, "Lanus"));

        a.listarPersonas();
        a.modificarPersona("12345678", new Domicilio("Chilotron", 1234, "LaWeaPo"));
        System.out.println("/////////");
        a.listarPersonas();
        a.eliminarTodosElementosAMano();
        a.agregarPersona("12345678", "Edu", "Chileno", new Domicilio("Av 9 de Julio", 6666, "Microcentro"));
        a.listarPersonas();
    }
}
