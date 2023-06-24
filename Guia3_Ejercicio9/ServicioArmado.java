package Guia3_Ejercicio9;

public class ServicioArmado extends Servicio{

    private static double valorHoras;

    public ServicioArmado(int horas) {
        super(horas);
        ServicioArmado.valorHoras = 250;
    }

    @Override
    public double getPrecioServicio(){
        return getHoras() * ServicioArmado.valorHoras;
    }
}
