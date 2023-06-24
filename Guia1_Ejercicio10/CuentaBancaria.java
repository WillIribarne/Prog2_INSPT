package Guia1_Ejercicio10;

import Guia1_Ejercicio3.TipoCaja;
import Guia1_Ejercicio9.Domicilio;
import Guia1_Ejercicio9.Persona;
import Guia1_Ejercicio9.Fecha;

public class CuentaBancaria {
    private String cbu;
    private TipoCaja tipo;
    private double saldo = 0;
    private Persona titular;
    private Fecha fechaDeApertura;

    public CuentaBancaria(String cbu, TipoCaja tipo, double saldo, Persona titular, Fecha fechaDeApertura) {
        this.cbu = cbu;
        this.tipo = tipo;
        this.saldo = saldo;
        this.titular = titular;
        this.fechaDeApertura = fechaDeApertura;
    }

    public void CambiarDirecTitular(Domicilio dom){
        titular.setDomicilio(dom);
    }

    @Override
    public String toString() {
        return "CuentaBancaria{" +
                "tipo=" + tipo +
                ", titular=" + titular +
                '}';
    }
}
