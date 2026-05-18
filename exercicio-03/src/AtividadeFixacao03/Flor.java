public class Flor {

    //atributos
    String nome;
    String cor;
    Boolean perfume;
    //construtor
    public Flor() {

    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }
    public void setCor(String cor){
        this.cor = cor;
    }
    public String getCor(){
        return cor;
    }
    public void setPerfume(Boolean perfume){
        this.perfume = perfume;
    }
    public Boolean getPerfume(){
        return perfume;
    }
    void mostrarDados(){
        System.out.println("nome: "+ getNome() );
        System.out.println("idade: "+ getCor() );
        System.out.println("status perfume: "+getPerfume());

    }
}
