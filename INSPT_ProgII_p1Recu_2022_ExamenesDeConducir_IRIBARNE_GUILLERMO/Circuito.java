package INSPT_ProgII_p1Recu_2022_ExamenesDeConducir_IRIBARNE_GUILLERMO;

public class Circuito implements Evaluable{
    private int tiempo;
    private int faltasCometidas;

    public int getTiempo() {
        return tiempo;
    }

    @Override
    public boolean seAprobo() {
        return faltasCometidas <= 2;
    }
}
