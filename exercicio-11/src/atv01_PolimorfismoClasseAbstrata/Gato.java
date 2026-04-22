package atv01_PolimorfismoClasseAbstrata;

public class Gato extends Animal{
    private int quantidadeDeVidas;
    public Gato(String nome, int quantidadeDeVidas){
        super(nome);
        this.quantidadeDeVidas = quantidadeDeVidas;
    }
    public int getQuantidadeDeVidas() {
        return quantidadeDeVidas;
    }
    public void setQuantidadeDeVidas(int quantidadeDeVidas) {
        this.quantidadeDeVidas = quantidadeDeVidas;
    }
    @Override
    public void emitirSom(){
        System.out.println("Miau");
    }
    public void emitirSom(String som){
        System.out.println("Miau de "+ som);
    }
    @Override
    public void mover(){
        System.out.println("Gato andando");
    }
}
