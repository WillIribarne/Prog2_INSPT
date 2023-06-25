package INSPT_ProgII_p1Recu_2022_ExamenesDeConducir_IRIBARNE_GUILLERMO;

public class InfoAuto extends InfoVehiculo{
    private int cantidadPuertas;

    public InfoAuto(String patente, String marca, int cilindrada, int cantidadPuertas) {
        super(patente, marca, cilindrada);
        this.cantidadPuertas = cantidadPuertas;
    }
}
