package Guia3_Ejercicio10;

public class Metodo implements Calificable{
    private String nombre;
    private int cantParametros;
    private int cantInstrucciones;
    private int cantRamificaciones;

    public Metodo(String nombre, int cantParametros, int cantInstrucciones, int cantRamificaciones) {
        this.nombre = nombre;
        this.cantParametros = cantParametros;
        this.cantInstrucciones = cantInstrucciones;
        this.cantRamificaciones = cantRamificaciones;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCantParametros() {
        return cantParametros;
    }

    public int getCantInstrucciones() {
        return cantInstrucciones;
    }

    public int getCantRamificaciones() {
        return cantRamificaciones;
    }

    public boolean esNombreIgualA(String nombreMetodo){
        return this.nombre.equals(nombreMetodo);
    }

    @Override
    public double getIndiceCalidad() {
        return (double) 5 / (this.cantParametros + 1) + (double) 20 / this.cantInstrucciones + (double) 3 / (this.cantRamificaciones + 1);
    }
}
