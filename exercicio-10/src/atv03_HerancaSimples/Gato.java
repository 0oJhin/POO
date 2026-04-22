package atv03_HerancaSimples;

public class Gato extends Animal {
    private String corPelagem;
    public Gato(String nome,int idade, String corPelagem){
     super(nome,idade);
     this.corPelagem = corPelagem;
    }
    public String getCorPelagem() {
        return corPelagem;
    }
    public void setCorPelagem(String corPelagem) {
        this.corPelagem = corPelagem;
    }
    public void emitirSom(){
        super.emitirSom();
        System.out.println("Miau Miau");
    }
    public void brincar(){
        System.out.println(getNome() + " está brincando.");
    }

    public void brincar(String brinquedo){
        System.out.println(getNome() + " está brincando com " + brinquedo + ".");
    }
}
