package atv04_colecoes;

import java.util.Vector;

public class Carrinho {
    private Vector<Produto> produtos;

    public Carrinho(){
        produtos = new Vector<>();
    }

    public void adicionarCarrinho(Produto produto){
        produtos.add(produto);
        System.out.println("Produto adicionado: "+produto.getNome());
    }
    public void removoerCarrinho(Produto produto){
        produtos.remove(produto);
        System.out.println("Produto removido: "+produto.getNome());
    }
    public void mostrarCarrinho(){
        System.out.println("Carrinho atual: ");
        for(Produto produto: produtos){
            System.out.println("Produto "+produto.getNome()+"Preco: "+produto.getPreco());
        }
    }
    public void totalProdutos(){
        System.out.println("numero total de produtos: "+produtos.size());
    }
}
