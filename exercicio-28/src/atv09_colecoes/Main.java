package atv09_colecoes;
public class Main {
    public static void main(String[]args){
        Cliente c1 = new Cliente("Pedro");
        Cliente c2 = new Cliente("Paulo");
        Cliente c3 = new Cliente("Joao");
        Cliente c4 = new Cliente("Maria");
        Cliente c5 = new Cliente("Ana");
        Cliente c6 = new Cliente("Marcela");
        Cliente c7 = new Cliente("Julio");

        Loja l1 = new Loja();

        l1.adicionarCliente(c1);
        l1.adicionarCliente(c2);
        l1.adicionarCliente(c3);
        l1.adicionarCliente(c4);
        l1.adicionarCliente(c5);
        l1.adicionarCliente(c6);
        l1.adicionarCliente(c7);

        l1.mostrarQuantidade();
        l1.verificarLojaVazia();
        l1.verificarCliente(c5);
        l1.listarClientes();
    
        l1.removerCliente(c3);

        l1.mostrarQuantidade();
        l1.verificarLojaVazia();
        l1.verificarCliente(c3);
        l1.verificarCliente(c7);
        l1.listarClientes();
        
    
    }
}
