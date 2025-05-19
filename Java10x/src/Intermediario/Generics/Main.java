package Intermediario.Generics;

import Intermediario.Generics.BolsaGeneric;
import Intermediario.Generics.Kunai;
import Intermediario.Generics.Pergaminho;
import Intermediario.Generics.Shuriken;

public class Main {
    public static void main(String[] args) {

        BolsaGeneric<Object> bolsaninja = new BolsaGeneric<>();
        bolsaninja.adicionaritens(new Kunai("Kunai explosiva"));
        bolsaninja.adicionaritens(new Shuriken(3));
        bolsaninja.adicionaritens(new Pergaminho("Invocação"));



        System.out.println("Ferramentas Ninjas");
        bolsaninja.mostraritens();
    }
}
