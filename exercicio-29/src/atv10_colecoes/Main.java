package atv10_colecoes;
public class Main {
    public static void main(String[]args){
        Cidade c1 = new Cidade("Maraba");
        Cidade c2 = new Cidade("Itupiranga");
        Cidade c3 = new Cidade("Sao Felix");
        Cidade c4 = new Cidade("Tucurui");
        Cidade c5 = new Cidade("Maraba");
        Cidade c6 = new Cidade("Muru Muru");
        
        Estado e1 = new Estado();

        e1.adicionarCidade(c1);
        e1.adicionarCidade(c2);
        e1.adicionarCidade(c3);
        e1.adicionarCidade(c4);
        e1.adicionarCidade(c5);
        e1.adicionarCidade(c6);

        e1.listarCidades();
        e1.mostrarPrimeiraCidade();
        e1.mostrarQuantidade();
        e1.mostrarUltimaCidade();
        e1.verificarCidade(c6);
        e1.verificarEstadoVazio();

        e1.removerCidade(c3);

        e1.listarCidades();
        e1.mostrarPrimeiraCidade();
        e1.mostrarQuantidade();
        e1.mostrarUltimaCidade();
        e1.verificarCidade(c3);
        e1.verificarCidade(c4);
        e1.verificarEstadoVazio();


    }
}
