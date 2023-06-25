package INSPT_ProgII_p1Recu_2022_ExamenesDeConducir_IRIBARNE_GUILLERMO;

public abstract class Examen implements Evaluable{
    private String fecha;
    private Persona persona;

    public Examen(String fecha, Persona persona) {
        this.fecha = fecha;
        this.persona = persona;
    }
}
