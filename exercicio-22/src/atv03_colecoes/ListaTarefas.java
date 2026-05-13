package atv03_colecoes;

import java.util.ArrayList;

public class ListaTarefas {
    private ArrayList<Tarefa> tarefas;

    public ListaTarefas(){
        tarefas = new ArrayList<>();
    } 

    public void adicionarTarefas(Tarefa tarefa){
        tarefas.add(tarefa);
        System.out.println("A tarefa "+tarefa.getDescricao()+" foi adicionada");
    }
    
    public void removerTarefas(Tarefa tarefa){
        tarefas.remove(tarefa);
        System.out.println("A tarefa "+tarefa.getDescricao()+" foi removida");
    }
    public void mostrarTarefas(){
        System.out.println("Tarefas: ");
        for(Tarefa tarefa: tarefas){
            System.out.println("Tarefa : "+tarefa.getDescricao());

        }
    }
}
