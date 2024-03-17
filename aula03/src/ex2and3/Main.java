package ex2and3;

import ex2and3.entites.Trator;

public class Main {
    public static void main(String[] args) {
        Trator trator1 = new Trator("Verde","Porshe");
        Trator trator2 = new Trator("Rosa","Porshe");
        Trator trator3 = new Trator("Preto","Porshe");

        trator1.ligar();
        trator2.ligar();
        trator2.andar();
        trator3.andar();
        trator3.desligar();
        trator1.subirMarcha();
        trator2.subirMarcha();
        trator2.subirMarcha();
        trator2.mostrarCarac();
        trator1.mostrarCarac();
        trator2.desligar();
        trator2.mostrarCarac();
    }
}
