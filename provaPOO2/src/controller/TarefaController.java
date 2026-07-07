package controller;

import dao.TarefaDao;
import model.Tarefa;

public class TarefaController {
    private TarefaDao dao;

    public TarefaController() {
        dao = new TarefaDao();
    }

    public void inserirTarefa(Tarefa tarefa) {
        dao.inserirTarefa(tarefa);
    }

    public void excluirTarefa(int id) {
        dao.deleteTarefa(id);
    }
}