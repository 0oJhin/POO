package atv09_colecoes;
import java.util.HashSet;

public class Loja {
    private HashSet<Cliente> clientes;
    public Loja(){
        clientes = new HashSet<>();
    }
    public void adicionarCliente(Cliente cliente){
        clientes.add(cliente);
        System.out.println(cliente +"cliente adicionado");
    }
    public void removerCliente(Cliente cliente){
        System.out.println(cliente +"cliente adicionado");
        clientes.remove(cliente);

    }
    public void verificarCliente(Cliente cliente){
        if(clientes.contains(cliente)){
            System.out.println("O cliente existe "+cliente.getNome());
        }else{
            System.out.println("O cliente nao existe " );
        }
    }
    public void listarClientes(){
    System.out.println("Lista atual de Clientes");

    for(Cliente cliente : clientes){
        System.out.println(cliente);
    }

    System.out.println("Fim da lista atual de Clientes");
}
    public void mostrarQuantidade(){
        System.out.println("Quantidade da lista-->"+clientes.size());
    }
    public void verificarLojaVazia(){
        if(clientes.isEmpty()){
            System.out.println("A loja esta vazia");
        }else{
            System.out.println("A loja nao esta vazia de Clientes, ainda possui :"+clientes.size());
        } 
    }
}
