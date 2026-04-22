package atv01_PolimorfismoClasseAbstrata;

public abstract class Animal {
    protected String nome;

    Animal(String nome){
            this.nome = nome;
    }
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public abstract void emitirSom();
    public abstract void mover();
}
