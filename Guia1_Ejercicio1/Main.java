package Guia1_Ejercicio1;

public class Main {
    public static void main(String[] args) {
        Persona per1 = new Persona("Juan", "Lopez", 1980);

        // El método hashCode() devuelve un int que representa la referencia del objeto
        System.out.println("Probando el objeto " + per1.hashCode());

        System.out.println("Nombre completo: " + per1.nombreCompleto());
        per1.mostrarEstado();
        per1.cambiarNombreYApellido("Carlos", "Rodriguez");
        per1.mostrarEstado();
        System.out.println(per1.getEdad());

        System.out.println("Es mayor que 20?");
        System.out.println(per1.esMayorAUnaEdad(20));
        System.out.println("Es mayor que 60?");
        System.out.println(per1.esMayorAUnaEdad(60));
    }
}
