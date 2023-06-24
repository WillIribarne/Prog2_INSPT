package Guia3_Ejercicio7;

public class TrianguloEquilatero extends Figura{
    private double[] lados;
    private double base;
    private double altura;

    public TrianguloEquilatero(String color, double[] lados, double base, double altura) {
        super(color);
        this.lados = lados;
        this.base = base;
        this.altura = altura;
    }

    public TrianguloEquilatero(String color) {
        super(color);
        lados = new double[3];
    }

    @Override
    public double area() {
        return base * altura / 2;
    }

    @Override
    public double perimetro() {
        return lados[0] + lados[1] + lados[2];
    }
}
