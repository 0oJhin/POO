public class Pessoa{

    private String nome;

    public Pessoa(String nome){
        this.nome = nome;
    }
    public String getNome() {return nome;}
    public void setNome(String nome) {this.nome = nome;}

    void usarCarro(Carro carro){
        System.out.println("Pessoa : "+getNome());
        carro.dirigir();
    }
}
