package Guia3_Ejercicio8;

import java.util.ArrayList;

public class Empresa {
    private ArrayList<Empleado> personal;

    public Empresa() {
        this.personal = new ArrayList<>();
    }
    public Empresa(ArrayList<Empleado> personal) {
        this.personal = personal;
    }

    public void mostrarSalarios(){
        for (Empleado e: personal){
            System.out.println(e.getNombreCompleto() + " -> Salario = " + e.getSalarioFinal());
        }
    }

    public Empleado empleadoConMasClientes(){
        EmpleadoComision empleadoConMasClientes = new EmpleadoComision();
        for (Empleado e: personal){
            if (e instanceof EmpleadoComision){
                if (((EmpleadoComision) e).getClientesCaptados() > empleadoConMasClientes.getClientesCaptados()){
                    empleadoConMasClientes = (EmpleadoComision) e;
                }
            }
        }
        return empleadoConMasClientes;
    }
}
