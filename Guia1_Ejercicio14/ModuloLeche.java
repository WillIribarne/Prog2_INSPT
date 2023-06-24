package Guia1_Ejercicio14;

public class ModuloLeche {
    private int liquido;
    private Textura textura;

    public ModuloLeche() {
        this.liquido = 0;
        this.textura = Textura.LIQUIDA;
    }

    public void setLiquido(int liquido) {
        this.liquido = liquido;
    }

    public void setTextura(Textura textura) {
        this.textura = textura;
    }

    public int getLiquido() {
        return liquido;
    }

    public Textura getTextura() {
        return textura;
    }
}
