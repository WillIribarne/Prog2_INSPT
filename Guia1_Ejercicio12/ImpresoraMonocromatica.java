package Guia1_Ejercicio12;

public class ImpresoraMonocromatica {
    private boolean encendido;
    private int cantHojas;
    private int toner = 100;

    public ImpresoraMonocromatica() {
    }

    public void Encender(){
        if (!encendido){
            this.encendido = true;
        } else {
            System.out.println("La impresora ya esta encendida");
        }
    }

    public void Apagar(){
        if (encendido){
            this.encendido = false;
        } else {
            System.out.println("La impresora ya esta apagada");
        }
    }

    public void MuestraEstadoImpresora(){
        System.out.println(toString());
    }

    public void recargarBandeja(int cantHojas){
        if ((this.cantHojas + cantHojas) > 35){
            this.cantHojas = 35;
            System.out.println("Se ha excedido la capacidad maxima de hojas (35). Se ha recargado la bandeja");
        } else if (cantHojas <= 0) {
            System.out.println("Cantidad de horas menor o = a 0. No se han cargado hojas.");
        } else {
            this.cantHojas = this.cantHojas + cantHojas;
            System.out.println("Se cargaron " + cantHojas + " hojas. La bandeja ahora tiene " + this.cantHojas + " hojas");
        }
    }

    public int nivelSegunCantCaracteres(int caracteres){
        return caracteres / 50;
    }

    public boolean puedeImprimir(Documento doc){
        boolean hayHojas = (this.cantHojas >= DevuelveCaracteresPorHojas(doc));
        boolean hayTinta = (this.toner >= DevuelveCaracteresPorTinta(doc));

        return hayTinta && hayHojas;
    }

    public int DevuelveCaracteresPorHojas(Documento doc){
        return doc.getCuerpo().length() / 20;
    }

    public int DevuelveCaracteresPorTinta(Documento doc){
        return doc.getCuerpo().length() / 50;
    }

    public void imprimirDocumento(Documento doc){
        boolean sePuedeImprimir = puedeImprimir(doc);

        if (!sePuedeImprimir){
            System.out.println("No se puede imprimir el documento");
        } else {
            this.toner -= DevuelveCaracteresPorTinta(doc);
            this.cantHojas -= DevuelveCaracteresPorHojas(doc);
            System.out.println(doc.getFecha() + doc.getTitulo());
            System.out.println(doc.getCuerpo());
        }
    }


    @Override
    public String toString() {
        return "ImpresoraMonocromatica{" +
                "encendido=" + encendido +
                ", cantHojas=" + cantHojas +
                ", toner=" + toner +
                '}';
    }
}
