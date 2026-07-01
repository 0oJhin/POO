package model;

import model.Projeto;
public class Tarefa extends Projeto {
    private int id_Tarefa;
    private String titulo;
    private String reponsavel;
    private int prioridade;
    private int id;
    private Projeto projeto;
    public Tarefa(){
    }
    public Tarefa(String titulo, String responsavel, int prioridade, int id){
        this.titulo = titulo;
        this.reponsavel= responsavel;
        this.prioridade = prioridade;
        this.id = projeto.getId();
    }
    public Tarefa(int id_Tarefa,String titulo, String responsavel, int prioridade, int id){
        this.id_Tarefa = id_Tarefa;
        this.titulo = titulo;
        this.reponsavel= responsavel;
        this.prioridade = prioridade;
        this.id = projeto.getId();
    }

    public int getId_Tarefa() {
        return id_Tarefa;
    }

    public void setId_Tarefa(int id_Tarefa) {
        this.id_Tarefa = id_Tarefa;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getReponsavel() {
        return reponsavel;
    }

    public void setReponsavel(String reponsavel) {
        this.reponsavel = reponsavel;
    }

    public int getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(int prioridade) {
        this.prioridade = prioridade;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    public Projeto getProjeto() {
        return projeto;
    }

    public void setProjeto(Projeto projeto) {
        this.projeto = projeto;
    }
}
