package Guia3_Ejercicio11;

public class Cliente implements Interesado {

    private String apellido;
    private String nombre;
    private String telefono;
    private String mail;

    public void responderAnteCambioPrecio(String mensaje){
        System.out.println("He recibido un SMS en mi telefono " + telefono + " con el mensaje: " + mensaje);
    }
}