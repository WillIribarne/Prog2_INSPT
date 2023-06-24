package INSPT_ProgII_p1Modelo_TodoLibre_IRIBARNE_GUILLERMO;

public abstract class Orden implements Entregable{
    private int numero;
    private int monto;
    private Usuario usuarioVendedor;
    private Usuario usuarioComprador;

    public Orden(int numero, int monto, Usuario usuarioVendedor, Usuario usuarioComprador) {
        this.numero = numero;
        this.monto = monto;
        this.usuarioVendedor = usuarioVendedor;
        this.usuarioComprador = usuarioComprador;
    }

    public Domicilio getDomicilioOrigen(){
       return this.usuarioVendedor.getDomicilio();
    }

    public Usuario getUsuarioComprador() {
        return usuarioComprador;
    }

    public int getComunaOrigen(){
        return usuarioVendedor.getDomicilio().getNumeroComuna();
    }

    public abstract int getComunaDestino();
}
