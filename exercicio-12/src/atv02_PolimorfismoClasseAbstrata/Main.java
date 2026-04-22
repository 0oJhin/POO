package atv02_PolimorfismoClasseAbstrata;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
    Funcionario testefreelancer = new FuncionarioFreelancer("Pedro", 100, 20);
    Funcionario testeclt = new FuncionarioCLT("Maria", 1500);

    ArrayList<Funcionario> funcionarios = new ArrayList<>();

    funcionarios.add(testefreelancer);
    funcionarios.add(testeclt);

        for (Funcionario funcionario : funcionarios) {
            System.out.println("Salário de " + funcionario.getNome() + ": " + funcionario.calcularSalario());
        }

    }
}
