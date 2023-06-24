package Guia3_Ejercicio3;

public abstract class CartaConPalo extends Carta{
    private Palo palo;

    public CartaConPalo(Palo palo) {
        this.palo = palo;
    }

    public Palo getPalo() {
        return palo;
    }

    @Override
    public String getRepresentacion(){
        return " de " + getPalo();
    }
}
