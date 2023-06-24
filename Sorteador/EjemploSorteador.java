package Sorteador;
import java.util.ArrayList;
import static Sorteador.Sorteador.delay;

public class EjemploSorteador {
    public static void main(String[] args) {
        Sorteador<Integer> sorteador = new Sorteador<Integer>();
        ArrayList<Integer> numeritos = new ArrayList<>();

        numeritos.add(5);
        numeritos.add(6);
        numeritos.add(7);
        numeritos.add(8);
        numeritos.add(9);

        sorteador.add(1);
        sorteador.add(2);
        sorteador.add(3);
        sorteador.add(4);
        sorteador.add(numeritos);

        System.out.println("Iniciando sorteo en ");
        delay(1);
        System.out.println("3..");
        delay(1);
        System.out.println("2..");
        delay(1);
        System.out.println("1..");
        delay(1);

        while (!sorteador.isEmpty()){
            System.out.print("-> Numero: ");
            System.out.println(sorteador.remove());
            delay(1);
        }

        System.out.println("\nFin del Sorteo");
    }
}
