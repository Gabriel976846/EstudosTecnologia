package Intermediario.Enum;

public enum RankMissoes {
    S("Tu ta na pika", 15),
    A("Dificil", 8),
    B("Confortavel", 5),
    C("Moderado", 3),
    D("Sem Dificuldade", 1);

    private String descricao;
    private int dificuldade;

    RankMissoes(String descricao, int dificuldade) {
        this.descricao = descricao;
        this.dificuldade = dificuldade;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getDificuldade() {
        return dificuldade;
    }

    public void setDificuldade(int dificuldade) {
        this.dificuldade = dificuldade;
    }
}
