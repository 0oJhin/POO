package atv07_colecoes;
import java.util.HashMap;
import java.util.Map;
public class Estoque {
    
    private HashMap<Integer, Produto> produtos;
    
    public Estoque(){
        produtos = new HashMap<>();
    }
    
    public void adicionarProduto(Integer codigo, Produto produto){
         produtos.put(codigo, produto);
         System.out.println("Produto adicionado"+produto.getNome());
    }
    public void buscarProduto(Integer codigo){  
        System.out.println("Busca feita Codigo: "+ codigo +" | "+ produtos.get(codigo));
    }
    public void removerProduto(Integer codigo){
        System.out.println("Produto removido Codigo: "+ codigo +" | "+ produtos.remove(codigo));
    }
    public void verificarCodigo(Integer codigo){    
        if(produtos.containsKey(codigo)){
            System.out.println("O codigo existe");
        }else{
            System.out.println("O codigo nao existe");
        }
    }
    public void listarProdutos(){
    System.out.println("Listagem de produtos atual");
    for(Map.Entry<Integer, Produto> entrada : produtos.entrySet()){
        System.out.println("Codigo: " + entrada.getKey() +" | " + entrada.getValue());
    }
    System.out.println("Fim da listagem de produtos");
    }
    public void mostrarQuantidade(){
        System.out.println("Quantidade :"+ produtos.size());
    }
    public void verificarEstoqueVazio(){
        if(produtos.isEmpty()){
            System.out.println("o Estoque esta vazio ");
        }else{
            System.out.println("O Estoque nao esta vazio e tem :"+ produtos.size()+" produtos");
        }
    }


}
