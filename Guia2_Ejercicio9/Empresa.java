package Guia2_Ejercicio9;

import java.util.ArrayList;

public class Empresa {
    private String nombre;
    private ArrayList<Garage> garages;
    private ArrayList<EstadoGarage> estadoGarages;

    public Empresa(String nombre) {
        this.garages = new ArrayList<>();
        this.nombre = nombre;
    }

    public ArrayList<EstadoGarage> obtenerInformeEstadoGarages(){
        ArrayList<EstadoGarage> estadoGarages1 = new ArrayList<>();
        for (Garage g: this.garages){
            EstadoGarage e = new EstadoGarage(g.getCodigo(), g.getCantEstacionados());
            estadoGarages1.add(e);
        }
        return estadoGarages1;
    }

    public void addGarage(String codigo){
        Garage g = new Garage(codigo, new Tablero());
        garages.add(g);
    }

    public ArrayList<Garage> getGarages() {
        return garages;
    }

    public void loadGarage(String codigo, ArrayList<Vehiculo> estacionados, ArrayList<Vehiculo> retirados, ArrayList<Deudor> deudores, ArrayList<Llave> llaves){
        for (Garage g: this.garages){
            if (g.getCodigo().equals(codigo)){
                g.loadGarage(estacionados, retirados, deudores, llaves);
            }
        }
    }

    public void mostrarVehiculosSinLlave(){
        for (Garage g: this.garages){
            System.out.println("Garage " + g.getCodigo() + ": Vehiculos estacionados sin llave");
            System.out.println();
            for (Vehiculo v: g.getEstacionados()){
                if (!g.buscaLlave(v.getPatente())){
                    System.out.println(v.getPatente());
                }
            }
        }
    }
}
