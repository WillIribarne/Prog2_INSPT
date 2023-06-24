package Guia2_Ejercicio9;

import java.util.ArrayList;

public class Vehiculo {
    private String patente;
    private ArrayList<Persona> personasAutorizadas;
    private int mesesAdeudados;

    public Vehiculo(String patente, ArrayList<Persona> personasAutorizadas, int mesesAdeudados) {
        this.patente = patente;
        this.personasAutorizadas = new ArrayList<>();
        this.mesesAdeudados = mesesAdeudados;
    }

    public int getMesesAdeudados() {
        return mesesAdeudados;
    }

    public String getPatente() {
        return patente;
    }

    public ArrayList<Persona> getPersonasAutorizadas() {
        return personasAutorizadas;
    }

    public Estacionar checkYaEstacionado(String pat1, String pat2){
        Estacionar result = Estacionar.INGRESO_OK;
        if (pat1.equals(pat2)) {
            result = Estacionar.VEHICULO_YA_ESTACIONADO;
        }
        return result;
    }
}
