package INSPT_ProgII_p1Recu_2022_ExamenesDeConducir_IRIBARNE_GUILLERMO;

import java.util.ArrayList;

public class SedeLicencias {
    private ArrayList<Examen> examenes;

    public Informe obtenerInforme(){
        Informe i = new Informe();
        i.setPorcentajeExamenesDesaprobados(examenes);
        i.setPromedioTiempoExamenesAutoAprobados(examenes);
        return i;
    }
}
