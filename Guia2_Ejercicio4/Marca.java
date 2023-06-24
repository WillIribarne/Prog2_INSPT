package Guia2_Ejercicio4;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class Marca {
    private ArrayList<Concesionaria> concesionarias;

    public Marca() {
        this.concesionarias = new ArrayList<>();
    }

    public void mostrarVehiculos(){
        int i = 0;
        for (Concesionaria c: this.concesionarias){
            c.mostrarTodosLosVehiculos();
        }
    }

    public ArrayList<Concesionaria> obtenerConcesionariaMaxVeh(){
        ArrayList<Concesionaria> cons = new ArrayList<>();
        int valMax = 0;
        /*  version opcional: for (Concesionaria c: this.concesionarias){
            if (valMax < c.cuentaVehiculos()){
                valMax = c.cuentaVehiculos();
                cons.clear();
                cons.add(c);
            } else if (valMax == c.cuentaVehiculos()){
                cons.add(c);
            }
        } */
        for (Concesionaria c: this.concesionarias){
            if (valMax < c.cuentaVehiculos()){
                valMax = c.cuentaVehiculos();
            }
        }
        for(Concesionaria c: this.concesionarias){
            if (valMax == c.cuentaVehiculos()){
                cons.add(c);
            }
        }
        return cons;
    }

    public void borrarVehiculo(String patente){
        Vehiculo v;
        for (Concesionaria c: this.concesionarias){
            if(c.buscaYEliminaVehiculo(patente)){
                System.out.println("El vehiculo " + patente + " se ha eliminado");
            }
        }
    }

    public void cambiarVehiculoDeConcesionaria(String patente, Concesionaria cons){
        Concesionaria c;
        Vehiculo v;
        boolean sePudoCambiar = false;
        for (Concesionaria concesionaria : concesionarias) {
            c = concesionaria;
            v = c.buscaYDevuelveVehiculo(patente);
            if (v != null) {
                c.buscaYEliminaVehiculo(patente);
                c = cons;
                c.agregarVehiculo(v);
                sePudoCambiar = true;
            }
        }
        if (sePudoCambiar){
            System.out.println("Se ha cambiado el vehiculo de concesionaria");
        } else {
            System.out.println("No se ha podido cambiar el vehiculo de concesionaria");
        }
    }
}
