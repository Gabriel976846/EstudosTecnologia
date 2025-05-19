package Intermediario.POO.Heranca;

import Intermediario.POO.Heranca.Hatake;
import Intermediario.POO.Heranca.Uchiha;

public class Main {
    public static void main(String[] args) {

        Uchiha sasuke = new Uchiha();
        sasuke.nome = "Sasuke Uchiha";
        sasuke.cidade = "Konoha";
        sasuke.idade = 30;
        sasuke.Sharingan();

        Hatake kakashi = new Hatake();
        kakashi.nome = "Kakashi Hataki";
        kakashi.cidade = "Konoha";
        kakashi.idade = 45;
        kakashi.Sharingan();
        kakashi.anbuNinja();
    }
}
