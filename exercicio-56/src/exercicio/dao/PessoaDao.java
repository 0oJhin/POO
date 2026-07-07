package exercicio.dao;

import exercicio.model.Pessoa;
import exercicio.util.Conexao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PessoaDao {

    public void isenrirPessoa(Pessoa pessoa){
        String sql = "INSERT INTO pessoa (nome) VALUES (?)";

        try(Connection conn = Conexao.getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql)){
            stmt.setString(1, pessoa.getNome());
            stmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Erro ao inserir pessoa");
        }
    }
    public Pessoa buscarPessoaNome(String nome) {
        String sql = "SELECT * FROM pessoa WHERE nome = ?";

        try (Connection conn = Conexao.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, nome);

            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                Pessoa pessoa = new Pessoa();
                pessoa.setId(rs.getInt("id"));
                pessoa.setNome(rs.getString("nome"));
                return pessoa;
            }

        } catch (SQLException e) {
            System.out.println("Erro ao buscar pessoa: " + e.getMessage());
        }

        return null;
    }
    public void update(Pessoa pessoa){
        String sql= "UPDATE pessoa SET nome = ? WHERE id = ?";
        try(Connection conn = Conexao.getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql)){
            stmt.setString(1, pessoa.getNome());
            stmt.setInt(2, pessoa.getId());
            stmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Erro ao atualizar pessoa");
        }
    }
    public void delete(int id){
        String sql = "DELETE FROM pessoa WHERE id = ?";
        try(Connection conn = Conexao.getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql)){
            stmt.setInt(1, id);
            stmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Erro ao deletar pessoa");
        }
    }
}
