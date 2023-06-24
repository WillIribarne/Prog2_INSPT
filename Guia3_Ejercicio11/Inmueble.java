package Guia3_Ejercicio11;
import java.util.ArrayList;

public class Inmueble {

    private String domicilio;
    private int superficie;
    private int cantAmbientes;
    private double precioDolares;
    private ArrayList<Interesado> interesados;

    public void setPrecio(double p){
        try{
            verificarPrecio(p);
        } catch (Exception ex) {
            System.out.println("No se pudo modificar el precio");
        } finally {
            double precioAnterior = precioDolares;
            precioDolares = p;
            if (!interesados.isEmpty()){
                notificarInteresados(precioAnterior);
            }
        }
    }

    private void verificarPrecio(double p){
        if (p < 0) {
            throw new RuntimeException("El precio no puede ser negativo!");
        }
    }

    private void notificarInteresados(double precioAnterior){
        for (Interesado i: interesados) {
            i.responderAnteCambioPrecio(mensajeParaInteresados(precioAnterior));
        }
    }

    private String mensajeParaInteresados(double precioAnterior){
        return "El inmueble " + this + "por el que ha demostrado interés cambió su precio de " + precioAnterior + " a " + precioDolares + ".";
    }

    @Override
    public String toString() {
        return "Inmueble{" +
                "domicilio='" + domicilio + '\'' +
                ", superficie=" + superficie +
                ", cantAmbientes=" + cantAmbientes +
                ", precioDolares=" + precioDolares +
                ", interesados=" + interesados +
                '}';
    }
}