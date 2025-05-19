package Intermediario.Overload;

import Intermediario.Overload.Ninja;

final public class Anbu extends Ninja {

    public void teste01(){
        System.out.println("Eu sou da anbu");
    }

    public Anbu(String nome, String aldeia, int idade) {
        super(nome, aldeia, idade);
    }
}
