package Guia1_Ejercicio14;

import org.w3c.dom.Text;

public enum TipoCafe {
    EXPRESSO(0, null),
    LATTE(2, Textura.ESPUMOSA),
    LAGRIMA (3, Textura.LIQUIDA);

    private int cantLeche;
    private Textura textura;

    private TipoCafe(int cantLeche, Textura textura) {
        this.cantLeche = cantLeche;
        this.textura = textura;
    }

    public int getCantLeche() {
        return cantLeche;
    }

    public Textura getTextura() {
        return textura;
    }
}
