package Guia3_Ejercicio3;

public abstract class Carta {
    private boolean estaTapada;

    public Carta() {
        this.estaTapada = true;
    }

    public boolean isEstaTapada() {
        return estaTapada;
    }

    public void darVuelta(){
         estaTapada = !estaTapada;
    }

    public void mostrar(){
        if (estaTapada){
            System.out.println("*********************");
        } else {
            System.out.println(getRepresentacion());
        }
    }

    public abstract String getRepresentacion();
}
