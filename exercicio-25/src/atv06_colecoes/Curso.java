package atv06_colecoes;

public class Curso {
    private String nome;
    public Curso(String nome){
        this.nome= nome;
    }
    public void setNome(String nome){
        this.nome= nome;
    }
    public String getNome(){
        return nome;
    }
    @Override
    public String toString(){
        return "Nome :"+ getNome();
    }
}
