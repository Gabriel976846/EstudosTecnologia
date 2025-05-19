package Intermediario.POO.Heranca;

import Intermediario.POO.Heranca.Anbu;
import Intermediario.POO.Heranca.Caracteristicas;
import Intermediario.POO.Heranca.Ninja;

public class Hatake extends Ninja implements Caracteristicas, Anbu {

    @Override
    public void Sharingan() {
        System.out.println("Sharingan Ativado");
    }

    @Override
    public void anbuNinja() {
        System.out.println("Eu sou da Anbu");
    }
}
