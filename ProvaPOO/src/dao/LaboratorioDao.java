package dao;
import model.Laboratorio;
import  util.Conexao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
public class LaboratorioDao {
    public void inserirLaboratorio(Laboratorio laboratorio){
        String sql ="INSERT INTo laboratorio(nome,bloco,capacidade,responsavel)VAlues(?,?,?,?)";
        try(Connection conn = Conexao.getConnection();
        PreparedStatement stmt= conn.prepareStatement(sql)){
            stmt.setString(1,laboratorio.getNome());
            stmt.executeUpdate();
        }
        catch(SQLException e){
        System.out.println("Erro ao inserir laboratorio: " + e.getMessage());
        }

    }

    public void delete(int id) {
        String sql = "DELETE FROm laboratorio WHERE id = ?";
        try(Connection conn = Conexao.getConnection();
            PreparedStatement stmt= conn.prepareStatement(sql)){
            stmt.setInt(1,id);
            stmt.executeUpdate();
        }catch(SQLException e){
            System.out.println("Erro ao deletar laboratorio: "+e.getMessage());
        }


    }
}
