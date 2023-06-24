package Guia1_Ejercicio8;

public class main {
    public static void main(String[] args) {
        Password password = new Password("Rawr");

        System.out.println(password.esFuerte());
        System.out.println("Se pudo establecer el valor? " + password.nuevoValor("Dinosaurio"));

    }
}
