package Intermediario.Generics;

public class Pergaminho {

    private String tipopergaminho;

    public Pergaminho(String tipopergaminho) {
        this.tipopergaminho = tipopergaminho;
    }

    public String getTipopergaminho() {
        return tipopergaminho;
    }

    @Override
    public String toString() {
        return "Pergaminho: " + tipopergaminho;
    }
}
