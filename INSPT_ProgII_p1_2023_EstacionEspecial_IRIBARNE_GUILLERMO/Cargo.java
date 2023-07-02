package PrimerParcial2023;

public class Cargo extends Nave{
    private Carga carga;

    public Cargo(String planetaOrigen, int cantMiembrosTripulacion, Carga carga) {
        super(planetaOrigen, cantMiembrosTripulacion);
        this.carga = carga;
    }

    @Override
    public void mostrarManifiesto() {
        muestraPlanetaYTripulacionNave();
        System.out.println(carga.getDescripcion() + " (" + carga.getVolumen() + "m2)");
    }

    @Override
    public boolean puedeEstacionarse() {
        return carga.getVolumen() <= 100;
    }
}
