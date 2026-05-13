package atv02_colecoes;
public class Main {
    public static void main(String[]args){
        Contato c1 = new Contato("Pedro");
        Contato c2 = new Contato("Paulo");
        Contato c3 = new Contato("Joao");

        Agenda a1 = new Agenda();
        a1.adicionarContato(c1);
        a1.adicionarContato(c2);
        a1.adicionarContato(c3);
        a1.mostrarAgenda();
        a1.removerContato(c2);
        a1.mostrarAgenda();
        

    } 
}
