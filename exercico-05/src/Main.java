import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        LocalDate hoje = LocalDate.now();
        LocalDate dataDevolucao = LocalDate.of(2026, 5, 30);
        LocalDate dataRetirada = LocalDate.of(2026,5,5);
        Leitor leitorTeste = new Leitor("Pedro", 202020, "pedro@pedro", 94999993);
        Livro livroTeste = new Livro("Pequeno Principe", "princeso", 989898, false);
        Emprestimo emprestimo = new Emprestimo(livroTeste, leitorTeste, dataRetirada, dataDevolucao);

        emprestimo.exibirResumo();

        boolean atrasado = emprestimo.estaAtrasado(hoje);
        System.out.println("Emprestimo atrasado? " + atrasado);

        emprestimo.devolverLivro();

        System.out.println("Status final do livro (emprestado?): " + livroTeste.isEmprestado());
    }
}