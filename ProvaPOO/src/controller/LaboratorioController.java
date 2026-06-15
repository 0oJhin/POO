package controller;

import model.Laboratorio;
import dao.LaboratorioDao;

public class LaboratorioController {
    private LaboratorioDao dao;
    public LaboratorioController(){
        dao= new LaboratorioDao();
    }
    public void inserirLaboratorio(Laboratorio laboratorio){
        dao.inserirLaboratorio(laboratorio);
    }
    public void excluir(int id){
        dao.delete(id);
    }
}
