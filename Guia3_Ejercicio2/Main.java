package Guia3_Ejercicio2;

public class Main {
    public static void main(String[] args) {
        Archivo a = new ArchiVideo("Recitalazo", 15, "C:\\Users\\Usuario\\Desktop", false, 35, false, 1080, 1920, FormatoVideo.MP4);
        System.out.println(a.toString());
    }
}