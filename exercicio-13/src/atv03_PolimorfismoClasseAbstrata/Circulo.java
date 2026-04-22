package atv03_PolimorfismoClasseAbstrata;

public class Circulo extends Forma{
    private double raio;

    Circulo(double raio){
        super();
        this.raio = raio;
    }
    public double getRaio() {
        return raio;
    }
    public double calcularArea(){
        return Math.PI * getRaio() * getRaio();
    }
}
