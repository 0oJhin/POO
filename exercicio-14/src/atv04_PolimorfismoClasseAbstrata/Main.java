package atv04_PolimorfismoClasseAbstrata;

public class Main {
    public static void main(String[] args) {
        Veiculo v1 = new Carro("Uno");
        Veiculo v2 = new Bicicleta("Caloi");                 
        System.out.println("Modelo: "+v1.getModelo());
        v1.mover();
        System.out.println("Modelo: "+v2.getModelo());
        v2.mover();
    }
}
