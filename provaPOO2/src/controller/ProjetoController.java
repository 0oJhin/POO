package controller;

import dao.ProjetoDao;
import model.Projeto;

public class ProjetoController {
    private ProjetoDao dao;

    public ProjetoController() {
        dao = new ProjetoDao();
    }

    public void inserirProjeto(Projeto projeto) {
        if (dao.buscarProjetoNome(projeto.getNome()) != null) {
            System.out.println("Já existe projeto com esse nome.");
            return;
        }

        dao.inserirProjeto(projeto);
    }

    public Projeto buscarProjetoNome(String nome) {
        return dao.buscarProjetoNome(nome);
    }

    public boolean excluirProjeto(int id) {
        return dao.deleteProjeto(id);
    }
}