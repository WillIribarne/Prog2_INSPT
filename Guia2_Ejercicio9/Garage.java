package Guia2_Ejercicio9;

import java.util.ArrayList;

public class Garage {
    private String codigo;
    private ArrayList<Vehiculo> estacionados;
    private ArrayList<Vehiculo> retirados;
    private ArrayList<Deudor> deudores;
    private Tablero tablero;

    public Garage(String codigo, Tablero tablero) {
        this.codigo = codigo;
        this.estacionados = new ArrayList<>();
        this.retirados = new ArrayList<>();
        this.deudores = new ArrayList<>();
        this.tablero = tablero;
    }

    public String getCodigo() {
        return codigo;
    }

    public ArrayList<Vehiculo> getEstacionados() {
        return estacionados;
    }

    public int getCantEstacionados(){
        return estacionados.size();
    }

    public boolean buscaLlave(String pat){
        return tablero.estaLlave(pat);
    }

    public void loadGarage(ArrayList<Vehiculo> estacionados, ArrayList<Vehiculo> retirados, ArrayList<Deudor> deudores, ArrayList<Llave> llaves){
        this.estacionados = estacionados;
        this.retirados = retirados;
        this.deudores = deudores;
        tablero.loadTablero(llaves);
    }

    public void setDeudores(ArrayList<Deudor> deudores) {
        this.deudores = deudores;
    }

    public void setTablero(Tablero tablero) {
        this.tablero = tablero;
    }

    public Estacionar estacionarVehiculo(String pat) {
        Estacionar result = Estacionar.INGRESO_OK;
        for (Vehiculo v : estacionados) {
            if (v.getPatente().equals(pat)) {
                result = Estacionar.VEHICULO_YA_ESTACIONADO;
                break;
            }
        }
        for (Deudor d : deudores) {
            if (d.getPatente().equals(pat) && d.getMesesDeuda() > 3) {
                result = Estacionar.NO_ESTACIONA_DEUDA;
                break;
            }
        }
        return result;
    }
    public boolean esPersonaAutorizada(int DNI){
        boolean esAutorizada = false;
        for (Vehiculo v: estacionados){
            for (Persona p: v.getPersonasAutorizadas()){
                if (p.getDNI() == DNI){
                    esAutorizada = true;
                    break;
                }
            }
        }
        return esAutorizada;
    }
}
