package atv04_PolimorfismoClasseAbstrata;

public abstract class Veiculo {
    protected String modelo;

    public Veiculo(String modelo){
        this.modelo = modelo;
    }


    public abstract String getModelo();


    public abstract void setModelo(String modelo);

    public abstract void mover();
}
