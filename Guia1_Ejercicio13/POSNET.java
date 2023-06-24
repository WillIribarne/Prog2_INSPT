package Guia1_Ejercicio13;

public class POSNET {

    public POSNET(){
    }

    void efectuarPago(TarjetaCred tarj, double monto, int cuotas){
        boolean reqRec = requiereRecargo(cuotas);
        double recargo;
        Ticket t;

        if (reqRec){
            recargo = generaRecargo(monto, cuotas);
            monto += recargo;
        }

        if (tieneSaldo(tarj, monto)){
            EfectuarPago(tarj, monto);
            System.out.println("Se ha realizado la compra de $" + monto + " en " + cuotas + " cuota/s");
            t = generaTicket(tarj.getNomTitular(), tarj.getApeTitular(), monto, montoCadaCuota(monto, cuotas));
            /* System.out.println(t); */
        } else {
            System.out.println("No se pudo concretar el pago: Saldo insuficiente");
        }
    }

    public boolean requiereRecargo(int cuotas){
        return cuotas > 1;
    }

    public double generaRecargo(double monto, int cuotas){
        return monto * devuelveIncremento(cuotas);
    }

    public double devuelveIncremento(int cuotas){
        return (cuotas - 1) * 0.03;
    }

    public boolean tieneSaldo(TarjetaCred tarj, double monto){
        return tarj.getSaldo() >= monto;
    }

    public void EfectuarPago(TarjetaCred tarj, double monto){
        tarj.restarSaldo(monto);
    }

    Ticket generaTicket(String nom, String ape, double montoTot, double montoPorCuota){
        return new Ticket(nom, ape, montoTot, montoPorCuota);
    }

    public double montoCadaCuota(double monto, int cuotas){
        return monto / cuotas;
    }


}
