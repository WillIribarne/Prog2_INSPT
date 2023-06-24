package Guia1_Ejercicio12;

import Guia1_Ejercicio9.Fecha;

public class main {
    public static void main(String[] args) {
        ImpresoraMonocromatica imp = new ImpresoraMonocromatica();

        imp.Encender();
        imp.MuestraEstadoImpresora();
        imp.recargarBandeja(1);
        imp.MuestraEstadoImpresora();
        System.out.println(imp.nivelSegunCantCaracteres(100));

        String cuerpo = "Todo comenzo en el dia que naci, tristemente. Quise utilizar 2 returns en ambos condicionales de un if y el profesor casi me mata";
        Documento doc = new Documento(new Fecha(1, 1, 1990), "Por que no se programar", cuerpo);

        imp.imprimirDocumento(doc);
        imp.MuestraEstadoImpresora();
        imp.recargarBandeja(4);
        imp.imprimirDocumento(doc);
        imp.MuestraEstadoImpresora();
    }
}
