package atv08_colecoes;

public class Funcionario {
    private String nome;
    public Funcionario(String nome){
        this.nome= nome;
    }
    public void setNome(String nome){
        this.nome=nome;
    }
    public String getNome(){
        return nome;
    }
    public String toString(){
        return "Funcionario: " + getNome();
    }
}
