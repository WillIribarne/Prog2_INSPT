package PrimerParcial_EfectoInvernadero;

import java.util.ArrayList;

public class AreaGelida extends Area{
    private double porcentajeCongelado;

    public AreaGelida(int extension, int elevacion, ArrayList<Double> temperaturasMedias, double porcentajeCongelado) {
        super(extension, elevacion, temperaturasMedias);
        this.porcentajeCongelado = porcentajeCongelado;
    }

    @Override
    public boolean estaEnPeligro() {
        return (getTemperaturaPromedio() < -10 && porcentajeCongelado > 90);
    }
}
