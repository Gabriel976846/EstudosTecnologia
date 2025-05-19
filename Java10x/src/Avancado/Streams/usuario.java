package Avancado.Streams;

public class usuario {
    private String nome;
    private String aldeia;
    private int idade;

    public usuario(String nome, String aldei, int idade) {
        this.nome = nome;
        this.aldeia = aldei;
        this.idade = idade;
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

    @Override
    public String toString() {
        return "Ninja{" +
                "nome='" + nome + '\'' +
                ", aldei='" + aldeia + '\'' +
                ", idade=" + idade +
                '}';
    }
}
