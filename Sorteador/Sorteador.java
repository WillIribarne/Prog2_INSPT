package Sorteador;

import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Random;

public class Sorteador<E> {
    private ArrayList<E> elementos;
    private Random random;

    public Sorteador() {
        this.elementos = new ArrayList<>();
        this.random = new Random();
    }

    public void add(E e){
        elementos.add(e);
    }

    public void add(ArrayList<E> els){
        this.elementos.addAll(els);
    }

    public E get(){
        checkEmptyness();
        return elementos.get(rnd());
    }

    public E remove(){
        checkEmptyness();
        return elementos.remove(rnd());
    }

    public boolean isEmpty(){
        return elementos.isEmpty();
    }

    public int rnd(){
        return random.nextInt(elementos.size());
    }

    public void checkEmptyness(){
        if (isEmpty()){
            throw new NoSuchElementException("El sorteador se encuentra vacío");
        }
    }

    public static void delay (int s){ // s = segundos
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException("Error efectuando el retardo");
        }
    }
}
