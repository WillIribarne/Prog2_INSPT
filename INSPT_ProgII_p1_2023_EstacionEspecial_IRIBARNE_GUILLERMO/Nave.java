package PrimerParcial2023;

public abstract class Nave {
    private String planetaOrigen;
    private int cantMiembrosTripulacion;

    public Nave(String planetaOrigen, int cantMiembrosTripulacion) {
        this.planetaOrigen = planetaOrigen;
        this.cantMiembrosTripulacion = cantMiembrosTripulacion;
    }

    public int getCantMiembrosTripulacion() {
        return cantMiembrosTripulacion;
    }

    public abstract void mostrarManifiesto();
    public abstract boolean puedeEstacionarse();

    public void muestraPlanetaYTripulacionNave(){
        System.out.println("Planeta de Origen: " + planetaOrigen);
        System.out.println("Cantidad de tripulantes: " + cantMiembrosTripulacion);
    }
}
