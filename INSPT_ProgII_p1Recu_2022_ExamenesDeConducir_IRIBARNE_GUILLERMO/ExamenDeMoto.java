package INSPT_ProgII_p1Recu_2022_ExamenesDeConducir_IRIBARNE_GUILLERMO;

import java.util.ArrayList;

public class ExamenDeMoto extends Examen{
    private InfoMoto infoMoto;
    private ArrayList<Circuito> circuitos;

    public ExamenDeMoto(String fecha, Persona persona, InfoMoto infoMoto, ArrayList<Circuito> circuitos) {
        super(fecha, persona);
        this.infoMoto = infoMoto;
        this.circuitos = circuitos;
    }

    @Override
    public boolean seAprobo() {
        boolean aprobado;
        if (infoMoto.getCilindrada() > 150){
            aprobado = allCircuitosAprobados();
        } else {
            aprobado = (getCircuitosDesaprobados() <= 1 && getTiempoTotalCircuitos() <= 120);
        }
        return aprobado;
    }

    public boolean allCircuitosAprobados(){
        boolean circuitosAprobados = true;
        if (circuitos.size() > 0){
            int i = 0;
            while (circuitosAprobados && i < circuitos.size()){
                if (!circuitos.get(i).seAprobo()){
                    circuitosAprobados = false;
                }
                i++;
            }
        }
        return circuitosAprobados;
    }

    public int getTiempoTotalCircuitos() {
        int t = 0;
        for (Circuito c: circuitos) {
            t += c.getTiempo();
        }
        return t;
    }

    public int getCircuitosDesaprobados(){
        int cd = 0;
        for (Circuito c: circuitos) {
            if (!c.seAprobo()){
                cd++;
            }
        }
        return cd;
    }
}
