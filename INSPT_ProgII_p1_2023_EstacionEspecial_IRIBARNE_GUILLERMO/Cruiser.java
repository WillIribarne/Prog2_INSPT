package PrimerParcial2023;

public class Cruiser extends Nave{
    private int cantPasajeros;

    public Cruiser(String planetaOrigen, int cantMiembrosTripulacion, int cantPasajeros) {
        super(planetaOrigen, cantMiembrosTripulacion);
        this.cantPasajeros = cantPasajeros;
    }

    @Override
    public void mostrarManifiesto() {
        muestraPlanetaYTripulacionNave();
        System.out.println("Porcentaje de pasajeros con respecto al total: " + promedioPorcentualPasajerosSobreTotal() + "%");
    }

    @Override
    public boolean puedeEstacionarse() {
        return cantPasajeros > 0;
    }

    private double promedioPorcentualPasajerosSobreTotal(){
        return (double) cantPasajeros / (double) (getCantMiembrosTripulacion() + cantPasajeros) * 100;
    }
}
