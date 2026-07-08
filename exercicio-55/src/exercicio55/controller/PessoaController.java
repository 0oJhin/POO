package exercicio55.controller;

import exercicio55.dao.PessoaDao;
import exercicio55.model.Pessoa;

public class PessoaController {
    private PessoaDao dao;

    public PessoaController() {
        dao = new PessoaDao();
    }

    public void cadastrarPessoa(String nome) {
        Pessoa pessoa = new Pessoa(nome);
        dao.inserir(pessoa);
    }

    public Pessoa consultarPessoa(String nome) {
        return dao.buscarPorNome(nome);
    }

    public void atualizarPessoa(int id, String nome) {
        Pessoa pessoa = new Pessoa(id, nome);
        dao.atualizar(pessoa);
    }

    public void excluirPessoa(int id) {
        dao.excluir(id);
    }
}