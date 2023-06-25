package INSPT_ProgII_p1Recu_2022_ExamenesDeConducir_IRIBARNE_GUILLERMO;

public class ExamenDeAuto extends Examen{
    private InfoAuto infoAuto;
    private Circuito circuito;

    public ExamenDeAuto(String fecha, Persona persona, InfoAuto infoAuto) {
        super(fecha, persona);
        this.infoAuto = infoAuto;
    }

    public Circuito getCircuito() {
        return circuito;
    }

    @Override
    public boolean seAprobo() {
        return circuito.seAprobo() && circuito.getTiempo() <= 90;
    }
}
