package Intermediario.Enum;

import Intermediario.Enum.RankMissoes;

public class Missoes {

    private String nome;
    private RankMissoes rank;

    public void mostrarinformacoes(){
        System.out.println("Missão: " + nome + " Dificuldade: " + rank + " Descrição: " + rank.getDescricao() + " Dificuldade: " + rank.getDificuldade());
    }
    public Missoes(String nome, RankMissoes rank) {
        this.nome = nome;
        this.rank = rank;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public RankMissoes getRank() {
        return rank;
    }

    public void setRank(RankMissoes rank) {
        this.rank = rank;
    }
}
