package Guia3_Ejercicio3;

public class CartaJoker extends Carta{
    private boolean esAColor;

    public CartaJoker(boolean esAColor){
        this.esAColor = esAColor;
    }
    @Override
    public String getRepresentacion(){
        return "Joker " + (esAColor ? "a colores" : "blanco y negro");
    }
}
