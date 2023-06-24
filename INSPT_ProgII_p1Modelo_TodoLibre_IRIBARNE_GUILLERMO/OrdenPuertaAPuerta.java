package INSPT_ProgII_p1Modelo_TodoLibre_IRIBARNE_GUILLERMO;

public class OrdenPuertaAPuerta extends Orden{
    private boolean envioGratis;

    public OrdenPuertaAPuerta(int numero, int monto, Usuario usuarioVendedor, Usuario usuarioComprador, boolean envioGratis) {
        super(numero, monto, usuarioVendedor, usuarioComprador);
        this.envioGratis = envioGratis;
    }

    public boolean isEnvioGratis() {
        return envioGratis;
    }

    @Override
    public Domicilio getDomicilioDestino() {
        return getUsuarioComprador().getDomicilio();
    }

    @Override
    public int getComunaDestino() {
        return getUsuarioComprador().getDomicilio().getNumeroComuna();
    }
}
