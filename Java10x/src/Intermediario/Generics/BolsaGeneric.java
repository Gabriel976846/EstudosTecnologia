package Intermediario.Generics;

import java.util.ArrayList;
import java.util.List;

public class BolsaGeneric <T> {

    private List <T> ferramentaninja;

    public BolsaGeneric() {
        this.ferramentaninja = new ArrayList<>();
    }

    public void adicionaritens(T ferramenta){
        ferramentaninja.add(ferramenta);
    }

    public void mostraritens(){
        for (T ferramenta : ferramentaninja){
            System.out.println(ferramenta);
        }
    }
}
