package atv03_HerancaSimples;

public class Animal {
    protected String nome;
    protected int idade;
    public Animal(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    public void emitirSom(){
        System.out.println(getNome() + " está emitindo um som.");
    }

    public void emitirSom(String som){
        System.out.println(getNome() + " faz: " + som);
    }
}
