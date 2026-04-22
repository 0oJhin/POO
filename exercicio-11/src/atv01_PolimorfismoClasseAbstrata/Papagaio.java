package atv01_PolimorfismoClasseAbstrata;

public class Papagaio extends Animal{
    private String corPenas;
    public Papagaio(String nome, String corPenas){
        super(nome);
        this.corPenas = corPenas;
    }
    public String getCorPenas() {
        return corPenas;
    }
    public void setCorPenas(String corPenas) {
        this.corPenas = corPenas;
    }
    @Override
    public void emitirSom(){
        System.out.println("O papagaio " + getNome() + " emitiu um som");
    }
    public void emitirSom(String som){
        System.out.println("O papagaio " + getNome() + " emitiu um som de " + som);
    }
    @Override
    public void mover(){
        System.out.println("Papagaio voando");
    }
}
