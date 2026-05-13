package atv01_colecoes;


public class Main {
    public static void main(String[] args) {
        Item item1 = new Item("cenoura");
        Item item2 = new Item("batata");
        Item item3 = new Item("bisnaguinha");

        ListaCompra Lista = new ListaCompra();

        Lista.adicionarItem(item1);
        Lista.adicionarItem(item2);
        Lista.adicionarItem(item3);
        Lista.mostarLista();
        Lista.removerItem(item2);
        Lista.mostarLista();
    }
}