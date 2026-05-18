package atv07_colecoes;

public class Produto {
    private String nome;

    public Produto(String nome){
        this.nome = nome;
    }
    public void setNome(String nome){
        this.nome= nome;
    
    }
    public String getNome(){
        return nome;
    }
    public String toString(){
        return "Produto: "+ getNome();
    }
}
