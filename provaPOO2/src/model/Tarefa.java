package model;

public class Tarefa {
    private int idTarefa;
    private String titulo;
    private String responsavel;
    private int prioridade;
    private Projeto projeto;

    public Tarefa() {
    }

    public Tarefa(String titulo, String responsavel, int prioridade, Projeto projeto) {
        this.titulo = titulo;
        this.responsavel = responsavel;
        this.prioridade = prioridade;
        this.projeto = projeto;
    }

    public Tarefa(int idTarefa, String titulo, String responsavel, int prioridade, Projeto projeto) {
        this.idTarefa = idTarefa;
        this.titulo = titulo;
        this.responsavel = responsavel;
        this.prioridade = prioridade;
        this.projeto = projeto;
    }

    public int getIdTarefa() {
        return idTarefa;
    }

    public void setIdTarefa(int idTarefa) {
        this.idTarefa = idTarefa;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(String responsavel) {
        this.responsavel = responsavel;
    }

    public int getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(int prioridade) {
        this.prioridade = prioridade;
    }

    public Projeto getProjeto() {
        return projeto;
    }

    public void setProjeto(Projeto projeto) {
        this.projeto = projeto;
    }
}