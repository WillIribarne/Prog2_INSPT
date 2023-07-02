package PrimerParcial2023;

import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        ArrayList<PuntoDeAtraque> puntos = new ArrayList<>();
        PuntoDeAtraque p1 = new PuntoDeAtraque();
        PuntoDeAtraque p2 = new PuntoDeAtraque();
        PuntoDeAtraque p3 = new PuntoDeAtraque();
        PuntoDeAtraque p4 = new PuntoDeAtraque();
        PuntoDeAtraque p5 = new PuntoDeAtraque();
        puntos.add(p1);
        puntos.add(p2);
        puntos.add(p3);
        puntos.add(p4);
        puntos.add(p5);
        EstacionAtlantis eaSports = new EstacionAtlantis(puntos);
        Nave SS_Charleston = new Cargo("Neptuno", 21, new Carga("Baterías recargables", 120));
        Nave ARA_Gaia = new Cruiser("Mercurio", 8, 0);
        Nave CHL_Edu = new Cargo("Marte", 15, new Carga("Sustancias cósmicas", 90));
        Nave FG_Jenny = new Cruiser("Urano", 48, 12);

        eaSports.estacionarNave(SS_Charleston);
        eaSports.estacionarNave(ARA_Gaia);
        eaSports.estacionarNave(CHL_Edu);
        eaSports.estacionarNave(FG_Jenny);
        System.out.println();
        eaSports.mostrarManifiestos();
    }
}
