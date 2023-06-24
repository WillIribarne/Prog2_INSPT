package Guia1_Ejercicio13;

public class TarjetaCred {
    private EntidadBancaria entidadBancaria;
    private EntidadFinanciera entidadFinanciera;
    private Titular tit;
    private int num;
    private double saldo;

    public TarjetaCred(EntidadBancaria entidadBancaria, EntidadFinanciera entidadFinanciera, Titular tit, int num, double saldo) {
        this.entidadBancaria = entidadBancaria;
        this.entidadFinanciera = entidadFinanciera;
        this.tit = tit;
        this.num = num;
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void restarSaldo(double monto){
        this.saldo -= monto;
    }

    public String getNomTitular() {
        return tit.getNombre();
    }

    public String getApeTitular() {
        return tit.getApellido();
    }

    @Override
    public String toString() {
        return "TarjetaCred{" +
                "entidadBancaria=" + entidadBancaria +
                ", entidadFinanciera=" + entidadFinanciera +
                ", num=" + num +
                ", saldo=" + saldo +
                '}';
    }

}
