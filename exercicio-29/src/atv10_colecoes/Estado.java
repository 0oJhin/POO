package atv10_colecoes;
import java.util.TreeSet;
public class Estado {
    private TreeSet<Cidade> cidades;
    public Estado(){
        cidades = new TreeSet<>();
    }
   
    public void adicionarCidade(Cidade cidade){
        cidades.add(cidade);
        System.out.println("Cidade adicionada "+ cidade.getNome());
    }
    public void removerCidade(Cidade cidade){
        System.out.println("Cidade removida "+cidade.getNome());
        cidades.remove(cidade);
    }
    public void verificarCidade(Cidade cidade){
        if(cidades.contains(cidade)){
            System.out.println("Cidade existente "+ cidade.getNome());
        }else{
        System.out.println("Cidade nao existe");
    }
    }      
    public void listarCidades(){
        System.out.println("Lista das cidades ");
        for(Cidade cidade: cidades){
            System.out.println(cidade);
        }
        System.out.println("fim da lista");
    }
    public void mostrarPrimeiraCidade(){
        System.out.println("Primeiro da lista "+ cidades.first());
    }
    public void mostrarUltimaCidade(){
        System.out.println("Ultimo da lista "+ cidades.last());
    }
    public void mostrarQuantidade(){
        System.out.println("Tamanho->"+cidades.size());
    }
    public void verificarEstadoVazio(){
        if(cidades.isEmpty()){
            System.out.println("Lista vazia");
        }else{
            System.out.println("Lista ainda tem cidades tamanho:"+cidades.size());
        }
    } 
}
