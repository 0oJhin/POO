package atv01_excecoes;

public class Conta {
    private double saldo;
    private double limite;

    public Conta(double saldo, double limite){
        this.limite= limite;
        this.saldo = saldo ;
    }
    
    public void deposita(double valor){
        if(valor <= 0){
            throw new IllegalArgumentException("Valor de deposito invalido: " + valor + ". O valor deve ser positivo.");
        }
        this.saldo = valor + getSaldo();
        System.out.println("Operacao relaizada, novo saldo : "+ getSaldo());
    }
    public double getSaldo(){
        return saldo;
    }
    public double getLimite(){
        return limite;
    }
}
