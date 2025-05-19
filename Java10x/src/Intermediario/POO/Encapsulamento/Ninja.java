package Intermediario.POO.Encapsulamento;

public abstract class Ninja {
    private String nome;
    private String aldeia;
    private int idade;
    private int numerodemissoes;

    public Ninja(String nome, String aldeia, int idade, int numerodemissoes) {
        this.nome = nome;
        this.aldeia = aldeia;
        this.idade = idade;
        this.numerodemissoes = numerodemissoes;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAldeia() {
        return aldeia;
    }

    public void setAldeia(String aldeia) {
        this.aldeia = aldeia;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getNumerodemissoes() {
        return numerodemissoes;
    }

    public void setNumerodemissoes(int numerodemissoes) {
        this.numerodemissoes = numerodemissoes;
    }
}


