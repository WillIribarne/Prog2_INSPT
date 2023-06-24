package Guia2_Ejercicio3;

public class Evaluacion {
    private TipoEvaluacion tipo;
    private double nota;

    public Evaluacion(TipoEvaluacion tipo, double nota) {
        this.tipo = tipo;
        this.nota = nota;
    }

    public double getNota() {
        return nota;
    }

    @Override
    public String toString() {
        return "Evaluacion{" +
                "tipo=" + tipo +
                ", nota=" + nota +
                '}';
    }
}
