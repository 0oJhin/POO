public class Pessoa {
    //atributos
    String nome;
    int idade;
    //construtor
    public Pessoa() {

    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }
    public int getidade(){
        return idade;
    }
    void mostrarDados(){
        System.out.println("nome: "+ getNome() );
        System.out.println("idade: "+ getidade() );
    }
}
