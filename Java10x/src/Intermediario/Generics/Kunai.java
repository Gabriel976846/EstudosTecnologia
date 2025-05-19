package Intermediario.Generics;

public class Kunai{

    private String tipokunai;

    public Kunai(String tipokunai) {
        this.tipokunai = tipokunai;
    }

    public String getTipokunai() {
        return tipokunai;
    }

    @Override
    public String toString() {
        return "Tipo Kunai: " + tipokunai;
    }
}
