package Guia1_Ejercicio3;

public class CBU {

    private final int numEntidad;
    private final int numSucursal;
    private final int verif1;
    private final long numCuenta;
    private final int verif2;

    public CBU(int numEntidad, int numSucursal, int verif1, long numCuenta, int verif2) {
        this.numEntidad = numEntidad;
        this.numSucursal = numSucursal;
        this.verif1 = verif1;
        this.numCuenta = numCuenta;
        this.verif2 = verif2;
    }

    public long getNumCuenta() {
        return numCuenta;
    }

    public int getVerif2() {
        return verif2;
    }

    @Override
    public String toString() {
        return "CBU=" + numEntidad + numSucursal + verif1 + numCuenta + verif2;
    }
}
