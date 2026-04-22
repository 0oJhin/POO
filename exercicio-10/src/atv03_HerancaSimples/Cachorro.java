package atv03_HerancaSimples;

public class Cachorro extends Animal{
    private String porte;
    public Cachorro(String nome, int idade, String porte){
        super(nome,idade);
        this.porte = porte;
    }
    public String getPorte() {
        return porte;
    }
    public void setPorte(String porte) {
        this.porte = porte;
    }
    public void emitirSom(){
        super.emitirSom();
        System.out.println("Au Au");
    }

    public void correr(){
        System.out.println(getNome() + " está correndo.");
    }

    public void correr(int distancia){
        System.out.println(getNome() + " correu " + distancia + " metros.");
    }
}
