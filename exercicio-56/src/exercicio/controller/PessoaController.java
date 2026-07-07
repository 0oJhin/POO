package exercicio.controller;

import exercicio.dao.PessoaDao;
import exercicio.model.Pessoa;

public class PessoaController {
    private PessoaDao dao;
    public PessoaController(){
        dao = new PessoaDao();
    }
    public void inserirPessoa(Pessoa pessoa){
        dao.isenrirPessoa(pessoa);
    }
    public Pessoa buscarPessoaNome(String nome){
       return  dao.buscarPessoaNome(nome);
    }
    public void update(int id, String nome){
        Pessoa pessoa = new Pessoa(id, nome);
        dao.update(pessoa);
    }
    public void excluir(int id){
        dao.delete(id);
    }
}
