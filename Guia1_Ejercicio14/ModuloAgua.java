package Guia1_Ejercicio14;

public class ModuloAgua {
    private int temp;
    private boolean reqMant;

    public ModuloAgua() {
        this.temp = 20;
        this.reqMant = false;
    }

    public void setTemp(int temp) {
        this.temp = temp;
    }

    public void setReqMant(Boolean reqMant) {
        this.reqMant = reqMant;
    }

    public int getTemp() {
        return temp;
    }

    public boolean isReqMant() {
        return reqMant;
    }
}
