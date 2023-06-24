//A)Porcentaje de órdenes con destino/origen en la misma comuna. B)Cantidad de órdenes Puerta a Puerta con envío gratis.

package INSPT_ProgII_p1Modelo_TodoLibre_IRIBARNE_GUILLERMO;

import java.util.ArrayList;

public class TodoLibre {
    private ArrayList<Usuario> usuarios;
    private ArrayList<Orden> ordenes;

    public void muestraPorcentajeOrdenesMismoDestinoOrigenComuna(){
        int c = 0;
        int porcentaje = 0;
        if (ordenes.size() != 0){
            for (Orden o: ordenes) {
                if (o.getComunaDestino() == o.getComunaOrigen()){
                    c++;
                }
            }
            porcentaje = c * 100 / ordenes.size();
        }
        System.out.println("Porcentaje de ordenes cuyo destino y origenes son de la misma comuna: " + porcentaje + "%");
    }

    public void muestraCantidadPuertaAPuertaGratisConEnvioGratis(){
        int c = 0;
        for (Orden o: ordenes) {
            if (o instanceof OrdenPuertaAPuerta){
                if (((OrdenPuertaAPuerta) o).isEnvioGratis()){
                    c++;
                }
            }
        }
        System.out.println("Cantidad de ordenes puerta a puerta con envío gratis: " + c);
    }
}
