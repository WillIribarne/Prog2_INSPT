package Guia3_Ejercicio3;

public class CartaNumerica extends CartaConPalo{
    private int numero;

    public CartaNumerica(int numero, Palo palo) {
        super(palo);
        this.numero = numero;
    }
    @Override
    public String getRepresentacion(){
        return numero + super.getRepresentacion();
    }
}
