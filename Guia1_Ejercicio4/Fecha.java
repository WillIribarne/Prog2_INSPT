package Guia1_Ejercicio4;

public class Fecha {

    int dia;
    int mes;
    int anio;

    public Fecha(int dia, int mes, int anio) {
        if (dia > 0 && dia < 32){
            this.dia = dia;
        }
        if (mes > 0 && mes < 13){
            this.mes = mes;
        }
        this.anio = anio;
    }
    public boolean esNavidad(){
        return this.dia == 25 && this.mes == 12;
    }

    public void sumaMes(){
        if (this.mes == 12){
           this.mes = 1;
        } else {
            this.mes++;
        }
    }

    @Override
    public String toString() {
        return "Fecha{" + "dia=" + dia + ", mes=" + mes + ", anio=" + anio + '}';
    }
}
