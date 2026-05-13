package atv04_PolimorfismoClasseAbstrata;

public class Bicicleta extends Veiculo{
    public Bicicleta(String modelo){
        super(modelo);
    }
    @Override
    public String getModelo() {
        return modelo;
    }
    @Override
    public void setModelo(String modelo) {
    this.modelo = modelo;
}

    @Override
    public void mover() {
        System.out.println("o Bicicleta se move pelo pedal");
    }
}
