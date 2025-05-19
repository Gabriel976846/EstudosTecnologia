package Intermediario.Overload;

import Intermediario.Overload.Anbu;
import Intermediario.Overload.NivelNinja;
import Intermediario.Overload.Uchiha;
import Intermediario.Overload.Uzumaki;

public class Main {
    public static void main(String[] args) {
        // Obj ninja nao da pra ser criado por que é abstrato

        // Obj uzumaki
        System.out.println("============ Naruto ============");
        Uzumaki naruto = new Uzumaki("Naruto Uzumaki", "Konoha", 25, 55, NivelNinja.KAGE);
        System.out.println(naruto);
        // Obj uchiha
        System.out.println("============ Sasuke ============");
        Uchiha sasuke = new Uchiha("Sasuke Uchiha", "Konoha", 18, 25, NivelNinja.JOUNIN);

        // Obj Anbu
        Anbu ninjaAnbu = new Anbu("kakashi", "Konoha", 45);
        ninjaAnbu.teste01();














       /*
        Uchiha itachi = new Uchiha("Itachi Uchiha", "Konoha", 30, 75, NivelNinja.JOUNIN);
        itachi.habilidadeEspecial();


        Uchiha madara = new Uchiha("Madara Uchiha", "Konoha", 45);
        madara.habilidadeEspecial();
        madara.inteligenciaDeCombate(120);

        */

    }
}
