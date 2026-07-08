package exercicio54.dao;


import exercicio54.model.Pessoa;
import exercicio54.util.Conexao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

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
}
