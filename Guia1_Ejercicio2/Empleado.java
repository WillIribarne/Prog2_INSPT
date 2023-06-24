package Guia1_Ejercicio2;

public class Empleado {
    int DNI;
    String nombre;
    String apellido;
    double salariobase;
    EstadoCivil estadocivil;
    int hijos;

    public Empleado(int DNI, String nombre, String apellido, double salariobase, EstadoCivil estadocivil, int hijos) {
        this.DNI = DNI;
        this.nombre = nombre;
        this.apellido = apellido;
        this.salariobase = salariobase;
        this.estadocivil = estadocivil;
        this.hijos = hijos;
    }

    public double obtenerSalarioFinal(){
        int extraHijos;
        double salarioFinal;
        if (this.hijos>3){
            extraHijos = 10;
        } else {
            extraHijos = 3 * this.hijos;
        }

        salarioFinal = this.salariobase + this.salariobase * (extraHijos) / 100;

        if (this.estadocivil.equals(EstadoCivil.SOLTERO)){
            salarioFinal = salarioFinal - (salarioFinal * 0.04);
        }
        return salarioFinal;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "DNI=" + DNI +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", salariobase=" + salariobase +
                ", estadocivil=" + estadocivil +
                ", hijos=" + hijos +
                '}';
    }
}
