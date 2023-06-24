package Guia3_Ejercicio9;

public class ServicioReparacion extends Servicio{
    private int dificultad;
    private static double valorHoras;

    public ServicioReparacion(int horas, int dificultad) {
        super(horas);
        this.dificultad = dificultad;
        ServicioReparacion.valorHoras = 180;
    }

    @Override
    public double getPrecioServicio(){
        double precio = getHoras() * ServicioReparacion.valorHoras;
        if (this.dificultad > 3){
            precio += precio * 0.25;
        }
        return precio;
    }

    public boolean esServSimple(){
        return this.dificultad < 2;
    }
}
