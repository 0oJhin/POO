package exercicio55.dao;

import exercicio55.model.Pessoa;
import exercicio55.util.Conexao;

import java.sql.*;

public class PessoaDao {

    public void inserir(Pessoa pessoa) {
        String sql = "INSERT INTO pessoa (nome) VALUES (?)";

        try (Connection conn = Conexao.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, pessoa.getNome());
            stmt.executeUpdate();

        } catch (SQLException e) {
            System.out.println("Erro ao inserir pessoa: " + e.getMessage());
        }
    }

    public Pessoa buscarPorNome(String nome) {
        String sql = "SELECT * FROM pessoa WHERE nome = ?";

        try (Connection conn = Conexao.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, nome);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                return new Pessoa(
                        rs.getInt("id"),
                        rs.getString("nome")
                );
            }

        } catch (SQLException e) {
            System.out.println("Erro ao buscar pessoa: " + e.getMessage());
        }

        return null;
    }

    public void atualizar(Pessoa pessoa) {
        String sql = "UPDATE pessoa SET nome = ? WHERE id = ?";

        try (Connection conn = Conexao.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, pessoa.getNome());
            stmt.setInt(2, pessoa.getId());
            stmt.executeUpdate();

        } catch (SQLException e) {
            System.out.println("Erro ao atualizar pessoa: " + e.getMessage());
        }
    }

    public void excluir(int id) {
        String sql = "DELETE FROM pessoa WHERE id = ?";

        try (Connection conn = Conexao.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, id);
            stmt.executeUpdate();

        } catch (SQLException e) {
            System.out.println("Erro ao excluir pessoa: " + e.getMessage());
        }
    }
}