package atv08_colecoes;

public class Main {
    public static void main(String[]args){
        Funcionario f1 = new Funcionario("Ana");
        Funcionario f2 = new Funcionario("Mariana");
        Funcionario f3 = new Funcionario("Ana viva Mariana");
        Funcionario f4 = new Funcionario("Pedro");
        Funcionario f5 = new Funcionario("Paulo");
        Funcionario f6 = new Funcionario("Joao");
        Funcionario f7 = new Funcionario("Rogerio");
        
        Empresa e1 = new Empresa();

        e1.adicionarFuncionario(9, f7);
        e1.adicionarFuncionario(99, f2);
        e1.adicionarFuncionario(999, f3);
        e1.adicionarFuncionario(9999, f5);
        e1.adicionarFuncionario(99999, f6);
        e1.adicionarFuncionario(999999, f1);
        e1.adicionarFuncionario(9999999, f4);

        e1.mostrarQuantidade();
        e1.mostrarPrimeiraChave();
        e1.mostrarUltimaChave();
        e1.buscarFuncionario(9999);
        e1.listarFuncionarios();

        e1.removerFuncionario(99);
        
        e1.mostrarQuantidade();
        e1.buscarFuncionario(99);
        e1.buscarFuncionario(999);
        e1.mostrarPrimeiraChave();
        e1.mostrarUltimaChave();
        e1.listarFuncionarios();
    }
}
