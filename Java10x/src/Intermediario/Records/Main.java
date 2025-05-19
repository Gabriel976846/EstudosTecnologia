package Intermediario.Records;

import Intermediario.Records.Ninja;
import Intermediario.Records.teste;

public class Main {
    public static void main(String[] args) {
        Ninja ninja1 = new Ninja("Naruto", "xxxx", 984609489);
        System.out.println("Ninja: " + ninja1);

        teste ninjarecord = new teste("Madara Uchiha", "vvbieuveu", 33333333);
        System.out.println(ninjarecord.teste());
    }
}
