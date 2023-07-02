package PrimerParcial_EfectoInvernadero;

import java.util.ArrayList;

public class AreaTundra extends Area{
    private int mmLluviaUltimoAnio;

    public AreaTundra(int extension, int elevacion, ArrayList<Double> temperaturasMedias, int mmLluviaUltimoAnio) {
        super(extension, elevacion, temperaturasMedias);
        this.mmLluviaUltimoAnio = mmLluviaUltimoAnio;
    }

    public boolean criterioPeligroTundra() {
        return (getTemperaturaMaximaRegistrada() > 10 && getElevacion() <= 500);
    }
    @Override
    public boolean estaEnPeligro() {
        return criterioPeligroTundra();
    }
}
