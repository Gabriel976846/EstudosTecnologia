package Intermediario.Generics;

public class Shuriken {

    private int quantidade;

    public Shuriken(int quantidade) {
        this.quantidade = quantidade;
    }

    public int getQuantidade() {
        return quantidade;
    }

    @Override
    public String toString() {
        return "Quantidade de Shurikens: " + quantidade;
    }
}
