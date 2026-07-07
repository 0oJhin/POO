package provaPoo1.model;

public class Laboratorio {
    private int id;
    private String nome;
    private int bloco;
    private int capacidade;
    private String responsavel;

    public Laboratorio() {
    }

    public Laboratorio(String nome, int bloco, int capacidade, String responsavel) {
        this.nome = nome;
        this.bloco = bloco;
        this.capacidade = capacidade;
        this.responsavel = responsavel;
    }

    public Laboratorio(int id, String nome, int bloco, int capacidade, String responsavel) {
        this.id = id;
        this.nome = nome;
        this.bloco = bloco;
        this.capacidade = capacidade;
        this.responsavel = responsavel;
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

    public int getBloco() {
        return bloco;
    }

    public void setBloco(int bloco) {
        this.bloco = bloco;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public String getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(String responsavel) {
        this.responsavel = responsavel;
    }
}