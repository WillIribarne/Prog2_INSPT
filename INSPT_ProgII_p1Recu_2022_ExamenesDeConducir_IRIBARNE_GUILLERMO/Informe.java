package INSPT_ProgII_p1Recu_2022_ExamenesDeConducir_IRIBARNE_GUILLERMO;

import java.util.ArrayList;

public class Informe {
    private int porcentajeExamenesDesaprobados;
    private int promedioTiempoExamenesAutoAprobados;

    public void setPorcentajeExamenesDesaprobados(ArrayList<Examen> examenes) {
        this.porcentajeExamenesDesaprobados = getporcentajeExamenesDesaprobados(examenes);
    }

    public void setPromedioTiempoExamenesAutoAprobados(ArrayList<Examen> examenes) {
        this.promedioTiempoExamenesAutoAprobados = getpromedioTiempoExamenesAutoAprobados(examenes);
    }

    private int getporcentajeExamenesDesaprobados(ArrayList<Examen> examenes){
        int d = 0;
        for (Examen e: examenes){
            if (!e.seAprobo()){
                d++;
            }
        }
        return d * 100 / examenes.size();
    }

    private int getpromedioTiempoExamenesAutoAprobados(ArrayList<Examen> examenes){
        int p = 0;
        for (Examen e: examenes){
            p += ((ExamenDeAuto) e).getCircuito().getTiempo();
        }
        return p / examenes.size();
    }
}
