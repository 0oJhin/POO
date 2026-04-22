package atv02_PolimorfismoClasseAbstrata;

public class FuncionarioFreelancer extends Funcionario {
    private double valorHora;
    private int horas;
    public FuncionarioFreelancer(String nome ,double valorHora, int horas){
        super(nome);
        this.valorHora = valorHora;
        this.horas = horas;
    }
    public double getValorHora() {
        return valorHora;
    }
    public int getHoras() {
        return horas;
    }

    public double calcularSalario(){
        return getHoras() * getValorHora();
    }
}
