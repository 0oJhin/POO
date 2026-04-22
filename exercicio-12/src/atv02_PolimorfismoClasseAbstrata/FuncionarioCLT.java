package atv02_PolimorfismoClasseAbstrata;

public class FuncionarioCLT extends Funcionario{
    private double salarioMensal;
    FuncionarioCLT(String nome, double salarioMensal){
        super(nome);
        this.salarioMensal = salarioMensal;
    }
    public double getSalarioMensal() {
        return salarioMensal;
    }


    public double calcularSalario(){
       return salarioMensal;
    }
}
