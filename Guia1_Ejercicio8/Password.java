package Guia1_Ejercicio8;

public class Password {
    String password;

    public Password(String password) {
        this.password = password;
    }

    public Password(){
    }

    public boolean esFuerte() {
        return password.length() >= 8;
    }

    public boolean nuevoValor(String newPassword){
        if (newPassword.length() >= 6){
            password = newPassword;
        }
        return newPassword.length() >= 6;
    }

    public String generarAleatorio (int len){
        if (len < 6){
            return null;
        } else {
            //como hago randoms en java :c
            return "sad";
        }
    }
}
