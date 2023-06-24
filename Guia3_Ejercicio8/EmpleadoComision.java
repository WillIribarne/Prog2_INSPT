package Guia3_Ejercicio8;

public class EmpleadoComision extends Empleado{
    private static double salarioMin;
    private int clientesCaptados;
    private double montoPorCaptado;

    public EmpleadoComision(int DNI, String nombre, String apellido, int anioIngreso, int clientesCaptados, double montoPorCaptado) {
        super(DNI, nombre, apellido, anioIngreso);
        this.clientesCaptados = clientesCaptados;
        this.montoPorCaptado = montoPorCaptado;
        EmpleadoComision.salarioMin = 20000;
    }

    public EmpleadoComision(){
        super();
    }

    public int getClientesCaptados() {
        return clientesCaptados;
    }

    public double getSalarioFinal(){
        return Math.max(this.clientesCaptados * this.montoPorCaptado, salarioMin);
    }
}
