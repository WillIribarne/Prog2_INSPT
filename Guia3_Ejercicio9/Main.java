package Guia3_Ejercicio9;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Historial h = new Historial();
        ArrayList<Insumo> insumos = new ArrayList<>();
        ArrayList<Servicio> servicios = new ArrayList<>();

        insumos.add(new Insumo("Mouse gamer Logitech G544", 35,2500, Tipo.PERIFERICO));
        insumos.add(new Insumo("Placa de Video GTX 1660 GEFORCE GDDR6 6GB", 20, 95000, Tipo.HARDWARE));
        insumos.add(new Insumo("Liquido limpiapantallas gamer LP2552", 55, 760, Tipo.LIMPIEZA));
        insumos.add(new Insumo("Disco SSD 256GB MONTOTOGAMES", 40, 22500, Tipo.HARDWARE));
        insumos.add(new Insumo("Gabinete gamer NZXT PHANTOM T110", 10,  15000, Tipo.HARDWARE));
        servicios.add(new ServicioArmado(2));
        servicios.add(new ServicioReparacion(6, 1));
        servicios.add(new ServicioArmado(5));
        servicios.add(new ServicioReparacion(10, 4));
        servicios.add(new ServicioReparacion(69, 3));
        servicios.add(new ServicioReparacion(7, 5));
        servicios.add(new ServicioArmado(12));

        Comercio c = new Comercio(h);
        c.getHistorial().agregaListaInsumos(insumos);
        c.getHistorial().agregaListaServicios(servicios);
        System.out.println(c.montoTotalFacturado());
        System.out.println(c.cantServiciosSimples());
    }
}