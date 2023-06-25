package INSPT_ProgII_p1Recu_2022_ExamenesDeConducir_IRIBARNE_GUILLERMO;

public class InfoVehiculo {
    private String patente;
    private String marca;
    private int cilindrada;

    public InfoVehiculo(String patente, String marca, int cilindrada) {
        this.patente = patente;
        this.marca = marca;
        this.cilindrada = cilindrada;
    }

    public int getCilindrada() {
        return cilindrada;
    }
}
