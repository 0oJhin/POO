package atv07_colecoes;

public class Main {
    public static void main(String []args){
        Produto p1 = new Produto("Mouse");
        Produto p2 = new Produto("Teclado");
        Produto p3 = new Produto("Monitor");
        Produto p4 = new Produto("Mousepad");
        Produto p5 = new Produto("processador");
        
        Estoque e1 = new Estoque();

        e1.adicionarProduto(1, p5);
        e1.adicionarProduto(2, p4);
        e1.adicionarProduto(3, p3);
        e1.adicionarProduto(4, p2);
        e1.adicionarProduto(5, p1);

        e1.buscarProduto(2);
        e1.verificarCodigo(5);
        
        e1.verificarEstoqueVazio();
        e1.mostrarQuantidade();
        e1.listarProdutos();
        
        e1.removerProduto(4);
        e1.verificarCodigo(4);
        e1.buscarProduto(4);
        e1.verificarCodigo(3);
        
        e1.buscarProduto(3);
        e1.mostrarQuantidade();
        e1.listarProdutos();        
    }
}
