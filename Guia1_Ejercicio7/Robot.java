package Guia1_Ejercicio7;

public class Robot {
    String nombre;

    public Robot(String nombre) {
        this.nombre = nombre;
    }

    public void saludar(){
        System.out.println("Hola, mi nombre es " + this.nombre + ". En que puedo ayudarte?");
    }
    public void saludar(String nombre){
        System.out.println("Hola " + nombre + ", mi nombre es " + this.nombre + ". En que puedo ayudarte?");
    }
}
