package Intermediario.Overload;

import Intermediario.Overload.EstrategiaDeBatalha;
import Intermediario.Overload.NivelNinja;

public abstract class Ninja implements EstrategiaDeBatalha {
    //TODO: Incluir novos 2 atributos: numeroDeMissoesConcluidas , Rank
    // TODO: Rank: Gennin, Chunnin, Jounnin, Hokage

    String nome;
    String aldeia;
    int idade;
    int numeroDeMissoesConcluidas;
    NivelNinja rank;

    public Ninja() {
    }

    // Metodo existente: Primeiro metodo
    public Ninja(String nome, String aldeia, int idade) {
        this.nome = nome;
        this.aldeia = aldeia;
        this.idade = idade;
    }

    // TODO: Sobrecarga do construtor chamado os novos atributos
    // Sobrecarga de metodos voce nao precisa redeclarar o construtor so os novos atributos
    public Ninja(String nome, String aldeia, int idade, int numeroDeMissoesConcluidas, NivelNinja rank) {
        this(nome, aldeia, idade);
        this.numeroDeMissoesConcluidas = numeroDeMissoesConcluidas;
        this.rank = rank;
    }

    // Metodos geral! Todos os ninjas vao ter
    public void habilidadeEspecial() {
        System.out.println("Meu nome é " + nome + " e esse é meu ataque especial");
    }

    // Sobreescrevendo o metodo da interface
    @Override
    public void estrategiaDeBatalhaNinja() {
        System.out.println("Meu nome é: " + nome + " Essa é minha estrategia de combate");
    }

    @Override
    public void inteligenciaDeCombate(){
        System.out.println("Meu nome é: " + nome + " Essa é minha inteliigência");
    }

    @Override
    public void inteligenciaDeCombate(int qi){
        if (qi >= 150){
            System.out.println("você é um gênio");
        } else if (qi> 100) {
            System.out.println("VoCê tem futuro");
        } else {
            System.out.println("VoCê é um animal");
        }
    }

    @Override
    public String toString() {
        return "Meu nome é: " + nome + " e sou de " + aldeia;
    }
}
