package Guia2_Ejercicio1;

import java.util.ArrayList;

public class Agenda {
    private ArrayList<Persona> personas;

    public Agenda() {
        this.personas = new ArrayList<>();
    }

    //Este agregarPersona es el más practico
    /* public void agregarPersona(Persona p){
        this.personas.add(p);
    } */

    public boolean agregarPersona(String DNI, String nombre, String apellido, Domicilio dom){
        boolean existePersona = buscarPersona(DNI) == null; //si verifExist es null, null == null, entonces existePersona es TRUE,

        if (existePersona){
            personas.add(new Persona(DNI, nombre, apellido, dom));
        }
        return existePersona;
    }

    public void listarPersonas(){
        //FOR EACH;
        for (Persona p: this.personas){
            System.out.println(p);
        }
    }

    public Persona devuelveUltimo(){
        Persona p = null;
        if (!personas.isEmpty()){
            p = personas.get(personas.size() - 1);
        }
        return p;
    }

    public Persona buscarPersona(String DNI){
        int i = 0;
        Persona pEncontrada = null;
        Persona p;

        while (i<this.personas.size() && pEncontrada == null){
            p = personas.get(i);
            if (p.getDNI().equals(DNI)){
                pEncontrada = p;
            } else {
                i++;
            }
        }
        return pEncontrada;
    }

    public Persona removerPersona(String DNI){
        Persona p = buscarPersona(DNI);
        this.personas.remove(p);
        return p;
    }

    public boolean modificarPersona(String DNI, Domicilio dom){
        Persona p = buscarPersona(DNI);
        boolean sePuede = (p != null);

        if(sePuede){
            p.setDomicilio(dom);
        }
        return sePuede;
    }

    public void eliminarTodosElementosAMano(){
        while (personas.size() > 0){ // while (!personas.isEmpty())
            personas.remove(0);
        }
    }
}
