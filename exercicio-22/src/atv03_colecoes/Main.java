package atv03_colecoes;
public class Main {
    public static void main(String[]args){
        Tarefa t1 = new Tarefa("Lavar roupa");
        Tarefa t2 = new Tarefa("prepara almoco");
        Tarefa t3 = new Tarefa("banhar o gato");
        
        ListaTarefas l1= new ListaTarefas();
        l1.adicionarTarefas(t1);
        l1.adicionarTarefas(t2);
        l1.adicionarTarefas(t3);
        l1.mostrarTarefas();
        l1.removerTarefas(t2);
        l1.mostrarTarefas();
    }
}
