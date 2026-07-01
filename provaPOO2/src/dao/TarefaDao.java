package dao;

import model.Tarefa;
import util.Conexao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TarefaDao {
    public void inserirTarefa(Tarefa tarefa){
        String sql ="INSERT INTo tarefa(titulo,responsavel,prioridade,projeto)VAlues(?,?,?)";
        try(Connection conn = Conexao.getConnection();
            PreparedStatement stmt= conn.prepareStatement(sql)){
            stmt.setString(1,tarefa.getTitulo());
            stmt.setString(2,tarefa.getReponsavel());
            stmt.setInt(3,tarefa.getPrioridade());
            stmt.setInt(4,tarefa.getId());
            stmt.executeUpdate();
        }
        catch(SQLException e){
            System.out.println("Erro ao inserir tarefa : " + e.getMessage());
        }

    }

    public void deleteTarefa(int id_tarefa) {
        String sql = "DELETE FROm tarefa WHERE id_tarefa = ?";
        try(Connection conn = Conexao.getConnection();
            PreparedStatement stmt= conn.prepareStatement(sql)){
            stmt.setInt(1,id_tarefa);
            stmt.executeUpdate();
        }catch(SQLException e){
            System.out.println("Erro ao deletar tarefa: "+e.getMessage());
        }
    }

}
