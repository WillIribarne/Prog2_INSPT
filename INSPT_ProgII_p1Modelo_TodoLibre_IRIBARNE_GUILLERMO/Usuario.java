package INSPT_ProgII_p1Modelo_TodoLibre_IRIBARNE_GUILLERMO;

public class Usuario {
    private int ID;
    private String nombre;
    private String apellido;
    private String mail;
    private Domicilio domicilio;

    public Domicilio getDomicilio(){
        return domicilio;
    }
}
