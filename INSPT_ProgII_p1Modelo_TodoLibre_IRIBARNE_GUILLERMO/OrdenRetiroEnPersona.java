package INSPT_ProgII_p1Modelo_TodoLibre_IRIBARNE_GUILLERMO;

public class OrdenRetiroEnPersona extends Orden{
    private SucursalCorreo sucursalCorreo;

    public OrdenRetiroEnPersona(int numero, int monto, Usuario usuarioVendedor, Usuario usuarioComprador, SucursalCorreo sucursalCorreo) {
        super(numero, monto, usuarioVendedor, usuarioComprador);
        this.sucursalCorreo = sucursalCorreo;
    }

    @Override
    public Domicilio getDomicilioDestino() {
        return sucursalCorreo.getDomicilio();
    }

    @Override
    public int getComunaDestino() {
        return sucursalCorreo.getDomicilio().getNumeroComuna();
    }
}
