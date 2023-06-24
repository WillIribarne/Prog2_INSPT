package Guia2_Ejercicio2;

import Guia2_Ejercicio1.Domicilio;

public class main {
    public static void main(String[] args) {
        Inmobiliaria i = new Inmobiliaria();
        Propiedad p1 = new Propiedad(new Domicilio("Bermudez", 1234, "Villa Devoto"), 130000, TipoVivienda.Departamento);
        Propiedad p2 = new Propiedad(new Domicilio("Del Carril", 4321, "Villa Del Parque"), 540000, TipoVivienda.Casa);

        i.agregarPropiedad(p1);
        i.agregarPropiedad(p2);
        System.out.println(i.promedioPrecio());
        System.out.println(i.cantidadDePropiedadesSegunTipo(TipoVivienda.Casa));
        System.out.println(i.propiedadesMasEconomicas());
        System.out.println(i.hayProp());


    }
}
