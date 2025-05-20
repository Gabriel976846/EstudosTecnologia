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
        this.DataVencimento = (dataVencimentostring == null || dataVencimentostring.isEmpty())
                ? null
                : LocalDate.parse(dataVencimentostring, DateTimeFormatter.ofPattern("ddMMyyyy"));
        this.prioridadeTarefa = PrioridadeTarefa.valueOf(prioridadeTarefastring.toUpperCase());
        this.statusConclusao = StatusConclusao.valueOf(statusConclusaostring.toUpperCase());
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

    public void setStatusConclusao(String statusConclusao) {
        this.prioridadeTarefa = PrioridadeTarefa.valueOf(statusConclusao.toUpperCase());
    }

    public PrioridadeTarefa getPrioridadeTarefa() {
        return prioridadeTarefa;
    }

    public void setPrioridadeTarefa(String prioridadeTarefa) {
        this.prioridadeTarefa = PrioridadeTarefa.valueOf(prioridadeTarefa.toUpperCase());
    }

    @Override
    public String toString() {
        return "Titulo: " + Titulo +
                "\nDescrição: " + Descricao +
                "\nDataVencimento: " + DataVencimento +
                "\nPriorida da Tarefa: " + prioridadeTarefa+
                "\nStatus de Conclusao: " + statusConclusao;
    }
}
