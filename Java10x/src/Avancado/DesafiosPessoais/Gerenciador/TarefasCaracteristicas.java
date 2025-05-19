package Avancado.DesafiosPessoais.Gerenciador;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public abstract class TarefasCaracteristicas {
    private String Titulo;
    private String Descricao;
    private LocalDate DataVencimento;
    private StatusConclusao statusConclusao;
    private PrioridadeTarefa prioridadeTarefa;

    public TarefasCaracteristicas(String titulo, String descricao, String dataVencimentostring, String prioridadeTarefastring,  String statusConclusaostring) {
        Titulo = titulo;
        Descricao = descricao;
        this.DataVencimento = LocalDate.parse(dataVencimentostring, DateTimeFormatter.ofPattern("ddMMyyyy"));
        this.prioridadeTarefa = PrioridadeTarefa.valueOf(prioridadeTarefastring.toUpperCase());
        
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String titulo) {
        Titulo = titulo;
    }

    public String getDescricao() {
        return Descricao;
    }

    public void setDescricao(String descricao) {
        Descricao = descricao;
    }

    public LocalDate getDataVencimento() {
        return DataVencimento;
    }

    public void setDataVencimento(LocalDate dataVencimento) {
        DataVencimento = dataVencimento;
    }

    public StatusConclusao getStatusConclusao() {
        return statusConclusao;
    }

    public void setStatusConclusao(StatusConclusao statusConclusao) {
        this.statusConclusao = statusConclusao;
    }

    public PrioridadeTarefa getPrioridadeTarefa() {
        return prioridadeTarefa;
    }

    public void setPrioridadeTarefa(PrioridadeTarefa prioridadeTarefa) {
        this.prioridadeTarefa = prioridadeTarefa;
    }

    @Override
    public String toString() {
        return "Titulo: " + Titulo +
                "\nDescrição: " + Descricao +
                "\nDataVencimento: " + DataVencimento +
                "\nStatus de Conclusao: " + statusConclusao +
                "\nPriorida da Tarefa: " + prioridadeTarefa;
    }
}
