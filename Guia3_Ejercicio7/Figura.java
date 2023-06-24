package Guia3_Ejercicio7;

public abstract class Figura {
    private String color;

    public Figura(String color) {
        this.color = color;
    }

    public String getColor(){
        return this.color;
    }
    public abstract double area();
    public abstract double perimetro();
}
