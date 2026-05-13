package atv04_colecoes;

public class Main {
    public static void main(String[]args){
        Produto p1 = new Produto("Arroz", 15);
        Produto p2 = new Produto("Feijao", 25);
        Produto p3 = new Produto("carne", 40);

        Carrinho c1 = new Carrinho();
        c1.adicionarCarrinho(p1);
        c1.adicionarCarrinho(p2);
        c1.adicionarCarrinho(p3);   
        c1.mostrarCarrinho();
        c1.totalProdutos();
        c1.removoerCarrinho(p2);
        c1.mostrarCarrinho();
        c1.totalProdutos();
        
    }
}
