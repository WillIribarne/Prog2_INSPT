package PrimerParcial2023;

public class PuntoDeAtraque {
    private Nave nave;

    public PuntoDeAtraque(Nave nave) {
        this.nave = nave;
    }

    public PuntoDeAtraque(){
        this.nave = null;
    }

    public Nave getNave() {
        return nave;
    }

    public void estacionarNave(Nave n){
        if (n.puedeEstacionarse()){
            this.nave = n;
            muestraEstacionamientoExitoso();
        } else {
            muestraEstacionamientoFallido();
        }
    }

    public void liberarNave(){
        this.nave = null;
    }

    public void muestraEstacionamientoExitoso(){
        System.out.println("La nave se ha estacionado con exito");
    }

    public void muestraEstacionamientoFallido(){
        System.out.println("No se ha podido estacionar la nave");
    }

    public void mostrarManifiestoNaveEstacionada(){
        if (nave == null){
            System.out.println("-----");
        } else {
            nave.mostrarManifiesto();
        }
    }
}
