package Intermediario.POO.Heranca;

import Intermediario.POO.Heranca.Caracteristicas;
import Intermediario.POO.Heranca.Ninja;

public class Uchiha extends Ninja implements Caracteristicas {
    @Override
    public void Sharingan() {
        System.out.println("Magenkyou Sharingan");
    }
}
