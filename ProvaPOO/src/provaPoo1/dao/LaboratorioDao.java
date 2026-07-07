package provaPoo1.dao;

import provaPoo1.model.Laboratorio;
import provaPoo1.util.Conexao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class LaboratorioDao {

    public void inserirLaboratorio(Laboratorio laboratorio) {
        String sql = "INSERT INTO laboratorio(nome, bloco, capacidade, responsavel) VALUES (?, ?, ?, ?)";

        try (Connection conn = Conexao.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, laboratorio.getNome());
            stmt.setInt(2, laboratorio.getBloco());
            stmt.setInt(3, laboratorio.getCapacidade());
            stmt.setString(4, laboratorio.getResponsavel());

            stmt.executeUpdate();

        } catch (SQLException e) {
            System.out.println("Erro ao inserir laboratorio: " + e.getMessage());
        }
    }

    public void delete(int id) {
        String sql = "DELETE FROM laboratorio WHERE id = ?";

        try (Connection conn = Conexao.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, id);
            stmt.executeUpdate();

        } catch (SQLException e) {
            System.out.println("Erro ao deletar laboratorio: " + e.getMessage());
        }
    }
}