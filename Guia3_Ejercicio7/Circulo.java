package Guia3_Ejercicio7;
import java.lang.Math;

public class Circulo extends Figura{
    private int radio;

    public Circulo(String color, int radio) {
        super(color);
        this.radio = radio;
    }

    public Circulo(String color) {
        super(color);
    }

    @Override
    public double area() {
        return Math.PI * Math.pow(radio, 2);
    }

    @Override
    public double perimetro() {
        return Math.PI * radio * 2;
    }
}
