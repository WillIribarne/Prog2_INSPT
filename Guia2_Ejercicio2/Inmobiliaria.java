package Guia2_Ejercicio2;

import java.util.ArrayList;

public class Inmobiliaria {

    private ArrayList<Propiedad> propiedades;

    public Inmobiliaria() {
        this.propiedades = new ArrayList<>();
    }

    public void agregarPropiedad(Propiedad prop){
        this.propiedades.add(prop);
    }

    public boolean hayProp(){
        return !propiedades.isEmpty();
    }

    public double promedioPrecio(){
        int i = 0;
        Propiedad prop;
        double prom = 0;

        while (propiedades.size() > i){
            prop = propiedades.get(i);
            prom += prop.getPrecio();
            i++;
        }
        return prom / propiedades.size();
    }

    public int propiedadesMasEconomicas(){
        int i = 0, propEcon = 0;
        Propiedad prop;
        double promGral = promedioPrecio();

        while (propiedades.size() > i){
            prop = propiedades.get(i);
            if (prop.getPrecio() < promGral){
                propEcon++;
            }
            i++;
        }
        return propEcon;
    }

    public int cantidadDePropiedadesSegunTipo(TipoVivienda tipo){
        int i = 0, cantTipo = 0;
        Propiedad prop;

        while (propiedades.size() > i){
            prop = propiedades.get(i);
            if (prop.getTipo() == tipo){
                cantTipo++;
            }
            i++;
        }
        return cantTipo;
    }
}
