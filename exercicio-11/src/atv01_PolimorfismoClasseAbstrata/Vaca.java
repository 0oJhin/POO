package atv01_PolimorfismoClasseAbstrata;

public class Vaca extends Animal{
    private int quatidadeLeite;
    private String cor;
    private int peso;
    public Vaca(String nome, int quatidadeLeite, String cor, int peso){
        super(nome);
        this.quatidadeLeite = quatidadeLeite;
        this.cor = cor;
        this.peso = peso;
    }
    public int getQuatidadeLeite() {
        return quatidadeLeite;
    }
    public void setQuatidadeLeite(int quatidadeLeite) {
        this.quatidadeLeite = quatidadeLeite;
    }
    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    public int getPeso() {
        return peso;
    }
    public void setPeso(int peso) {
        this.peso = peso;
    }
    @Override
    public void emitirSom(){
        System.out.println("A vaca produziu um som");
    }
    public void emitirSom(String som){
        System.out.println("A vaca produziu um som de "+ som);
    }
    @Override
    public void mover() {
        System.out.println("Vaca andando");
    }
}
