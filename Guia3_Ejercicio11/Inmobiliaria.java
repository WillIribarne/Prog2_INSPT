package Guia3_Ejercicio11;

import java.util.ArrayList;

public class Inmobiliaria implements Interesado {

    private String nombre;
    private String mail;
    private int porcentajeComisionVenta;
    private ArrayList<Inmueble> inmuebles;

    public void responderAnteCambioPrecio(String mensaje){
        System.out.println("Hemos recibido un mail a nuestra casilla " + mail + " con el mensaje: " + mensaje);
    }
}