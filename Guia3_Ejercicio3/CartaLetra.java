package Guia3_Ejercicio3;

public class CartaLetra extends CartaConPalo{
    private char letra;

    public CartaLetra(char letra, Palo palo) {
        super(palo);
        this.letra = letra;
    }
    @Override
    public String getRepresentacion(){
        return letra + super.getRepresentacion();
    }
}
