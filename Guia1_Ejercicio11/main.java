package Guia1_Ejercicio11;

import Guia1_Ejercicio3.TipoCaja;
import Guia1_Ejercicio9.Domicilio;
import Guia1_Ejercicio9.Fecha;
import Guia1_Ejercicio9.Persona;
import Guia1_Ejercicio10.CuentaBancaria;

public class main {
    public static void main(String[] args) {
        Domicilio dom = new Domicilio("Av. Triunvirato", 3174, "Villa Ortuzar");
        Persona fulano = new Persona("Fulano", "Torres", new Fecha(16, 4, 1990), dom);
        Persona mengana = new Persona("Mengana", "Torres", new Fecha(23, 11, 1991), dom);

        CuentaBancaria ahorro = new CuentaBancaria("123456789", TipoCaja.AHORRO, 0, fulano, new Fecha (1, 1, 2001));
        CuentaBancaria corriente = new CuentaBancaria("987654321", TipoCaja.CORRIENTE, 0, mengana, new Fecha(1, 1, 2002));

        System.out.println(ahorro);
        System.out.println(corriente);

        //si ambos se mudan, modifico el domicilio desde la variable comun dom en linea 11
        //dom = new Domicilio("Av. tengo mucha tarea", 1234, "Auxilio Porfavor");
        //aunque tambien puedo generar las personas de vuelta con esta nueva variable pero no sería muy práctico()


        ahorro.CambiarDirecTitular(new Domicilio("Av. tengo mucha tarea", 1234, "Auxilio Porfavor"));
        corriente.CambiarDirecTitular(new Domicilio("Av. tengo mucha tarea", 1234, "Auxilio Porfavor"));

        //Linea 26 y 27 cambian el domicilio del titular desde la clase CuentaBancaria, lo que CAMBIAN LA DIRECCION DE CADA UNO

        System.out.println(fulano);
        System.out.println(mengana);
    }
}
