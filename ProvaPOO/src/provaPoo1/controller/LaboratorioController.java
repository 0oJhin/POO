package provaPoo1.controller;

import provaPoo1.model.Laboratorio;
import provaPoo1.dao.LaboratorioDao;

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
