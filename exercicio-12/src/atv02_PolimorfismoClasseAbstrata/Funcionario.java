package atv02_PolimorfismoClasseAbstrata;

public abstract class Funcionario {
    protected String nome;
    Funcionario(String nome){
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public abstract double calcularSalario();
}
