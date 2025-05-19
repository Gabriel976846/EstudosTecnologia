package Intermediario.Enum;

import Intermediario.Enum.Missoes;
import Intermediario.Enum.RankMissoes;

public class Main {
    public static void main(String[] args) {
        Missoes missao1 = new Missoes("Resgatar Cachorro", RankMissoes.A);
        missao1.mostrarinformacoes();
    }
}
