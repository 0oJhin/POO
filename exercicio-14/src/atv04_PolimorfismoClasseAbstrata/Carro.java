package atv04_PolimorfismoClasseAbstrata;

public class Carro extends Veiculo{

    public Carro(String modelo){
        super(modelo);
    }
    
    @Override
    public String getModelo(){
        return modelo;
    }
    @Override
    public void setModelo(String modelo) {
    this.modelo = modelo;
    }


    @Override
    public void mover() {
        System.out.println("o Carro se move pelo motor");

    }
}
