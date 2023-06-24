package Guia3_Ejercicio9;

public abstract class Servicio {
    private int horas;

    public Servicio(int horas) {
        this.horas = horas;
    }

    public int getHoras() {
        return horas;
    }

    public abstract double getPrecioServicio();
    public double getMontoTotal(){
        return getPrecioServicio() + (Matematica.sumarIVA(getPrecioServicio()) / 2);
    }
}
