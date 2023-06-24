package Guia1_Ejercicio5;

public class main {
    public static void main(String[] args) {
        Fraccion f1 = new Fraccion(27, 12);
        Fraccion f2 = new Fraccion(9, 0);
        Fraccion f3 = new Fraccion(-15, 2);

        f1.mostrarFraccion();
        f2.mostrarFraccion();
        f3.mostrarFraccion();

        f1.simplificarFraccion();
        f1.mostrarFraccion();
        System.out.println(f1.obtenerDecimal());
        f1.sumarFraccion(new Fraccion(-5, 7));
        f1.mostrarFraccion();
        System.out.println(f1.getTipo());
    }
}
