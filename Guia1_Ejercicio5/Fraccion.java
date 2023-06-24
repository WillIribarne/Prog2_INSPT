package Guia1_Ejercicio5;

public class Fraccion {
    private int numerador;
    private int denominador = 1;

    public Fraccion(int numerador, int denominador) {
        this.numerador = numerador;
        if (denominador !=0){
            this.denominador = denominador;
        }
    }

    public void mostrarFraccion(){
        System.out.println(numerador + "/" + denominador);
    }

    public double obtenerDecimal(){
        return (double) numerador / denominador;
    }

    public void sumarEntero(int entero){
        numerador = numerador + denominador * entero;
    }

    public void sumarFraccion(Fraccion otra){
        this.numerador = otra.numerador * this.denominador + this.numerador * otra.denominador;
        this.denominador = otra.denominador * this.denominador;
    }

    public void simplificarFraccion(){
        for (int i=2; i<numerador || i<denominador; i++){
            if (numerador % i == 0 && denominador % i == 0){
                numerador = numerador / i;
                denominador = denominador / i;
                i=2;
            }
        }
    }

    public TipoFraccion getTipo(){
        if (numerador < denominador){
            return TipoFraccion.PROPIA;
        } else if (numerador > denominador && (numerador % denominador !=0)){
            return TipoFraccion.IMPROPIA;
        } else {
            return TipoFraccion.APARENTE;
        }
    }
}
