package Guia1_Ejercicio14;

public class main {
    public static void main(String[] args) {
        MaquinaCafe cafetera = new MaquinaCafe("Nespresso", false);
        cafetera.verEstadoCafetera();
        cafetera.calentarAgua();
        cafetera.prenderCafetera();
        cafetera.cargaLeche();
        cafetera.cambiarTextura(Textura.ESPUMOSA);
        cafetera.servirCafe(TipoCafe.LATTE);
        cafetera.servirCafe(TipoCafe.LATTE);
        cafetera.cargaLeche();
        cafetera.servirCafe(TipoCafe.EXPRESSO);
        cafetera.cambiarTextura(Textura.LIQUIDA);
        cafetera.servirCafe(TipoCafe.LAGRIMA);
        cafetera.verEstadoCafetera();
    }
}
