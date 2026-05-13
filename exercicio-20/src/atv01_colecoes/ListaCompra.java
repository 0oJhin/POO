package atv01_colecoes;
import java.util.ArrayList;

public class ListaCompra {

    private ArrayList<Item> lista;

    public ListaCompra() {
        lista = new ArrayList<>();
    }

    public void adicionarItem(Item item) {
        lista.add(item);
        System.out.println("o Item " + item.getNome() + " foi adicionado");
    }

    public void removerItem(Item item) {
        lista.remove(item);
        System.out.println("o Item " + item.getNome() + " foi removido");
    }

    public void mostarLista() {
        System.out.println("Lista de Compras");
        for (Item item : lista) {
            System.out.println(item.getNome());
        }
    }
}