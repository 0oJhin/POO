package model;

public class Projeto {
    private int id;
    private String nome;
    private String cliente;
    private String prazo;

    public Projeto() {
    }

    public Projeto(String nome, String cliente, String prazo) {
        this.nome = nome;
        this.cliente = cliente;
        this.prazo = prazo;
    }

    public Projeto(int id, String nome, String cliente, String prazo) {
        this.id = id;
        this.nome = nome;
        this.cliente = cliente;
        this.prazo = prazo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }


    public String getPrazo() {
        return prazo;
    }

    public void setPrazo(String prazo) {
        this.prazo = prazo;
    }

    @Override
    public String toString() {
        return nome;
    }
}