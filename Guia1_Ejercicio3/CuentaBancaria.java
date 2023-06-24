package Guia1_Ejercicio3;

public class CuentaBancaria {
    private CBU cbu;
    private TipoCaja tipo;
    private double saldo = 0;

    public CuentaBancaria(CBU cbu, TipoCaja tipo, double saldo) {
        this.cbu = cbu;
        this.tipo = tipo;
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositarDinero(int dinero){
        saldo = saldo + dinero;
    }

    public void extraerDinero(int dinero){
        if (this.tipo == TipoCaja.AHORRO && saldo < dinero){
            System.out.println("No hay dinero suficiente en la caja de ahorro");
        } else {
            saldo = saldo - dinero;
            System.out.println("Se han retirado " + dinero + " pesos de la cuenta");
        }
    }

    public int obtenUltimos3CBU(){
        return (int)(this.cbu.getNumCuenta() % 100 * 10 + this.cbu.getVerif2());
    }

    @Override
    public String toString() {
        return "CuentaBancaria{ " + cbu.toString() +
                ", tipo=" + tipo +
                ", saldo=" + saldo +
                '}';
    }
}
