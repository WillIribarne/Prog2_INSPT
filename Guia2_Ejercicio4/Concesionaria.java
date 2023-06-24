package Guia2_Ejercicio4;

import java.util.ArrayList;

public class Concesionaria {
    private String nombre;
    private ArrayList<Vehiculo> vehiculos;

    public Concesionaria(String nombre) {
        this.nombre = nombre;
        this.vehiculos = new ArrayList<>();
    }

    public void mostrarVehiculos(TipoVehiculo t){
        for (Vehiculo v: this.vehiculos){
            if (v.getTipo() == t){
                System.out.println(v);
            }
        }
    }
    public void mostrarTodosLosVehiculos(){
        for (Vehiculo v: this.vehiculos){
                System.out.println(v);
        }
    }

    public int cuentaVehiculos(){
        return vehiculos.size();
    }

    public boolean buscaYEliminaVehiculo(String patente){
        boolean sePudoBorrar = false;
        for (Vehiculo v: this.vehiculos){
            if (v.getPatente().equals(patente) && !sePudoBorrar){
                vehiculos.remove(v);
                sePudoBorrar = true;
            }
        }
        return sePudoBorrar;
    }

    public Vehiculo buscaYDevuelveVehiculo(String patente){
        Vehiculo vehiculo = null;
        for (Vehiculo v: this.vehiculos){
            if (v.getPatente().equals(patente)){
                vehiculo = v;
            }
        }
        return vehiculo;
    }

    public void agregarVehiculo(Vehiculo v){
        this.vehiculos.add(v);
    }
}
