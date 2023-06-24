package Guia3_Ejercicio8;

import java.time.Year;

public class EmpleadoSalarioFijo extends Empleado{
    private double salarioBasico;

    public EmpleadoSalarioFijo(int DNI, String nombre, String apellido, int anioIngreso, double salarioBasico) {
        super(DNI, nombre, apellido, anioIngreso);
        this.salarioBasico = salarioBasico;
    }

    public int calculaDescAntiguedad(){
        int aniosEmpleado = Year.now().getValue() - getAnioIngreso();
        int aumento;

        if (aniosEmpleado > 10){
            aumento = 15;
        } else if (aniosEmpleado >= 6){
            aumento = 10;
        } else if (aniosEmpleado >= 2){
            aumento = 5;
        } else {
            aumento = 0;
        }
        return aumento;
    }

    public double getSalarioFinal(){
        return salarioBasico + (salarioBasico * calculaDescAntiguedad() / 100);
    }
}
