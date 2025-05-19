package Desafios.Desa06;

public class Candidatos {

    private String nomecandidato;
    private int numeroeleitoral;

    public Candidatos(String nomecandidato, int numeroeleitoral) {
        this.nomecandidato = nomecandidato;
        this.numeroeleitoral = numeroeleitoral;
    }

    public String getNomecandidato() {
        return nomecandidato;
    }

    public void setNomecandidato(String nomecandidato) {
        this.nomecandidato = nomecandidato;
    }

    public int getNumeroeleitoral() {
        return numeroeleitoral;
    }

    public void setNumeroeleitoral(int numeroeleitoral) {
        this.numeroeleitoral = numeroeleitoral;
    }

    @Override
    public String toString() {
        return "==== Candidato ====\n" +
                "Nome: " + nomecandidato + " - Numero: " + numeroeleitoral + "\n";
    }
}
