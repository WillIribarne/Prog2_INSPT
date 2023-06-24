package Guia1_Ejercicio3;

public class main {
    public static void main(String[] args) {
        CBU cbu = new CBU(144, 2332, 6, 1234567890123L, 9);
        CuentaBancaria cuenta = new CuentaBancaria(cbu, TipoCaja.CORRIENTE, 40000);

        System.out.println(cuenta.toString());
        System.out.println("Ultimos 3 digitos CBU: " + cuenta.obtenUltimos3CBU());
        cuenta.depositarDinero(5000);
        System.out.println("El saldo de la cuenta es: " + cuenta.getSaldo());
        cuenta.extraerDinero((46000));
        System.out.println("El saldo de la cuenta es: " + cuenta.getSaldo());

    }
}
