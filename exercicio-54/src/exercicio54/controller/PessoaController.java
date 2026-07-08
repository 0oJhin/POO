package exercicio54.controller;


import exercicio54.dao.PessoaDao;
import exercicio54.model.Pessoa;

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
}