package Intermediario.Arraylist;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String [] teste = new String[3];

        List <String> nomesninjas = new ArrayList<>();

        nomesninjas.add("Naruto Uzumaki"); // index 0
        nomesninjas.add("Sakura Haruno"); // index 1
        nomesninjas.add("Sasuke Uchiha"); // index 2
        nomesninjas.add("Kakashi Hatake"); // index 3

        System.out.println("Lista: " + nomesninjas);
        nomesninjas.set(3, "Jiraya"); // troca o elemnto no index que eu escolher
        System.out.println(nomesninjas);
        nomesninjas.remove(1); // remove o elemento pelo index que eu por
        System.out.println(nomesninjas);
        System.out.println("A lista tem: " + nomesninjas.size() + " elementos"); // sizer mostra a quantidade de elementos / espaço na lista
       System.out.println(nomesninjas.get(4));


    }
}
