package PrimerParcial_EfectoInvernadero;

import java.util.ArrayList;

public class AreaTundraPolar extends AreaTundra{

    private IntensidadViento intensidadVientoHabitual;

    public AreaTundraPolar(int extension, int elevacion, ArrayList<Double> temperaturasMedias, int mmLluviaUltimoAnio, IntensidadViento intensidadVientoHabitual) {
        super(extension, elevacion, temperaturasMedias, mmLluviaUltimoAnio);
        this.intensidadVientoHabitual = intensidadVientoHabitual;
    }

    @Override
    public boolean estaEnPeligro() {
        return criterioPeligroTundra() || ((getTemperaturaMaximaRegistrada() > 8) && this.intensidadVientoHabitual.equals(IntensidadViento.FUERTE));
    }
}
