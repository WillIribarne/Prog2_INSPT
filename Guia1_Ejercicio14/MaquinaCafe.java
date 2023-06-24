package Guia1_Ejercicio14;

public class MaquinaCafe {
    private String marca;
    private boolean estaEncendida;
    private ModuloAgua moduloAgua;
    private ModuloLeche moduloLeche;

    private final int tempAguaCaliente = 75;

    public MaquinaCafe(String marca, Boolean estaEncendida) {
        ModuloAgua ma = new ModuloAgua();
        ModuloLeche ml = new ModuloLeche();
        this.marca = marca;
        this.estaEncendida = estaEncendida;
        this.moduloAgua = ma;
        this.moduloLeche = ml;
    }
    public void servirCafe(TipoCafe tc){
        boolean estadoCafetera = verEstadoCafetera(tc);
        if (estadoCafetera){
            descontarLeche(tc);
            System.out.println("El café " + tc + " se ha servido correctamente");
        }
    }

    public void verEstadoCafetera(){
        System.out.println("Marca: " + this.marca);
        System.out.println("Esta encendida?: " + this.estaEncendida);
        System.out.println("Temperatura agua: " + this.moduloAgua.getTemp() + "°C");
        System.out.println("Requiere mantenimiento?: " + this.moduloAgua.isReqMant());
        System.out.println("Cantidad de leche: " + this.moduloLeche.getLiquido());
        System.out.println("Textura de la maquina: " + this.moduloLeche.getTextura());
    }

    public void cargaLeche(){
        moduloLeche.setLiquido(5);
    }

    public void cargaLeche(int i){
        if (i > 5){
            i = 5;
        }
        moduloLeche.setLiquido(i);
    }

    public void hacerMantenimientoModuloAgua(){
        moduloAgua.setReqMant(true);
    }

    public void romperModuloAgua(){
        moduloAgua.setReqMant(false);
    }

    public void calentarAgua(){
        moduloAgua.setTemp(tempAguaCaliente);
    }

    public void cambiarTextura(Textura t){
        moduloLeche.setTextura(t);
    }

    public void prenderCafetera(){
        estaEncendida = true;
    }

    public void apagarCafetera(){
        estaEncendida = false;
    }

    private boolean verEstadoCafetera(TipoCafe tc){
        boolean estadoCafetera = true;
        if (!verEncendido()){
            System.out.println("La cafetera esta apagada");
            estadoCafetera = false;
        }
        if (!verTempAgua()){
            System.out.println("La temperatura del agua está a menos de 70°C");
            estadoCafetera = false;
        }
        if (verMantenimientoAgua()){
            System.out.println("El modulo de agua necesita mantenimiento");
            estadoCafetera = false;
        }
        if (!verCantLeche(tc)){
            System.out.println("El modulo de leche no tiene suficiente liquido");
            estadoCafetera = false;
        }
        if(!verTextura(tc)){
            System.out.println("La textura para el cafe no es la correcta");
            estadoCafetera = false;
        }
        return estadoCafetera;
    }

    public boolean verEncendido(){
        return this.estaEncendida;
    }

    public boolean verTempAgua(){
        return moduloAgua.getTemp() > 70;
    }

    public boolean verMantenimientoAgua(){
        return moduloAgua.isReqMant();
    }

    public boolean verCantLeche(TipoCafe tc){
        int l = estableceCantLeche(tc);
        return moduloLeche.getLiquido() - l >= 0;
    }

    public boolean verTextura(TipoCafe tc){
        boolean tCorrecta = true;
        if (tc != TipoCafe.EXPRESSO && tc.getTextura() != moduloLeche.getTextura()){
            tCorrecta = false;
        }
        return tCorrecta;
    }

    public void descontarLeche(TipoCafe tc){
        int l = estableceCantLeche(tc);
        moduloLeche.setLiquido(moduloLeche.getLiquido() - l);
    }
    public int estableceCantLeche(TipoCafe tc){
        return tc.getCantLeche();
    }

    public Textura devuelveTexturaSegunCafe(TipoCafe tc){
        return tc.getTextura();
    }
}
