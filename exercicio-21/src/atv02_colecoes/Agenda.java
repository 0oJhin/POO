package atv02_colecoes;
import java.util.ArrayList;

public class Agenda {

    private ArrayList<Contato> contatos;

    public Agenda(){
        contatos= new ArrayList<>();
    }
    public void adicionarContato(Contato contato){
        contatos.add(contato);
        System.out.println("O contato "+contato.getContato()+" foi adicionado" );
    }
    public void removerContato(Contato contato){
        contatos.remove(contato);
        System.out.println("O contato "+contato.getContato()+" foi removido" );
    }
    public void mostrarAgenda(){
            System.out.println("Lista de contatos");
            for(Contato contato: contatos){
                System.out.println("Contato: "+ contato.getContato());
            }
    }
}
