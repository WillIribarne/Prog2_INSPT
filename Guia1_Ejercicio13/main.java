package Guia1_Ejercicio13;

import Guia1_Ejercicio9.Domicilio;
import Guia1_Ejercicio9.Fecha;

public class main {
    public static void main(String[] args) {
        POSNET posnet = new POSNET();

        Domicilio dom = new Domicilio("Av. Chile", 1234, "Valparaiso");
        Titular t = new Titular("Juancito", "Perez", new Fecha(1, 1, 1990), dom);
        TarjetaCred tar = new TarjetaCred(EntidadBancaria.CREDICOOP, EntidadFinanciera.CABAL, t,41823445, 15000);

        System.out.println(tar);
        posnet.efectuarPago(tar, 10000, 5);
        System.out.println(tar);
        posnet.efectuarPago(tar, 5000, 1);

    }
}
