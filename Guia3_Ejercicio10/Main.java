package Guia3_Ejercicio10;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Metodo m1 = new Metodo("noSe", 1, 2, 3);
        Metodo m2 = new Metodo("noSeCodear", 2, 3, 4);
        Metodo m3 = new Metodo("noSeJugar", 3, 4, 5);
        Metodo m4 = new Metodo("noSeAl", 4, 5, 6);
        Metodo m5 = new Metodo("noSeYugioh", 5, 6, 7);
        ArrayList<Metodo> listaMetodos1 = new ArrayList<>();
        ArrayList<Metodo> listaMetodos2 = new ArrayList<>();
        listaMetodos1.add(m1);
        listaMetodos1.add(m3);
        listaMetodos1.add(m5);
        listaMetodos2.add(m2);
        listaMetodos2.add(m4);
        FuenteLengProgramacion fp1 = new FuenteLengProgramacion("FuenTN-TECNO", "c:/downloads/gatitos", listaMetodos1, LenguajesProgra.JAVA);
        FuenteLengProgramacion fp2 = new FuenteLengProgramacion("FuentonDeGuiso", "c:/facultad/ejercicios/guia-C#/soyCrack", listaMetodos2, LenguajesProgra.CSHARP);
        FuenteLengMarcado fm1 = new FuenteLengMarcado("yanosequeponer", "c:/auxilio/no/se/testear", 24, LenguajesMarcado.HTML);
        FuenteLengMarcado fm2 = new FuenteLengMarcado("quieroMiTitulo", "d:/permiso/dijo/el/petiso", 45, LenguajesMarcado.XML);
        ArrayList<Fuente> listaFuentes1 = new ArrayList<>();
        ArrayList<Fuente> listaFuentes2 = new ArrayList<>();
        listaFuentes1.add(fp1);
        listaFuentes1.add(fp2);
        listaFuentes1.add(fm2);
        listaFuentes2.add(fm1);
        Programa p1 = new Programa(303456, "RobotNuclear", "Mi amigo edu", true, listaFuentes1);
        Programa p2 = new Programa(4755122, "ProgramaSuperFachero", "Mi vecino Totoro", false, listaFuentes2);
        ArrayList<Programa> programas = new ArrayList<>();
        programas.add(p1);
        programas.add(p2);
        Sophie sophie = new Sophie(programas);

        System.out.println(sophie.programasPorDebajoDe(48.9039));
        p1.mostrarDetalleDeMetodo("noSeYugioh");
        System.out.println(p1.listadoFuentesMayoresAlPromedio());
    }
}