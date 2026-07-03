package dao;

import model.Projeto;
import util.Conexao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProjetoDao {

    public void inserirProjeto(Projeto projeto) {
        String sql = "INSERT INTO projeto(nome, cliente, prazo) VALUES (?, ?, ?)";

        try (Connection conn = Conexao.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, projeto.getNome());
            stmt.setString(2, projeto.getCliente());
            stmt.setString(3, projeto.getPrazo());
            stmt.executeUpdate();

        } catch (SQLException e) {
            System.out.println("Erro ao inserir projeto: " + e.getMessage());
        }
    }

    public Projeto buscarProjetoNome(String nome) {
        String sql = "SELECT * FROM projeto WHERE nome = ?";

        try (Connection conn = Conexao.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, nome);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                Projeto projeto = new Projeto();
                projeto.setId(rs.getInt("id"));
                projeto.setNome(rs.getString("nome"));
                projeto.setCliente(rs.getString("cliente"));
                projeto.setPrazo(rs.getString("prazo"));
                return projeto;
            }

        } catch (SQLException e) {
            System.out.println("Erro ao buscar projeto: " + e.getMessage());
        }

        return null;
    }

    public List<Projeto> listarProjetos() {
        List<Projeto> lista = new ArrayList<>();
        String sql = "SELECT * FROM projeto";

        try (Connection conn = Conexao.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                Projeto projeto = new Projeto();
                projeto.setId(rs.getInt("id"));
                projeto.setNome(rs.getString("nome"));
                projeto.setCliente(rs.getString("cliente"));
                projeto.setPrazo(rs.getString("prazo"));

                lista.add(projeto);
            }

        } catch (SQLException e) {
            System.out.println("Erro ao listar projetos: " + e.getMessage());
        }

        return lista;
    }

    public boolean deleteProjeto(int id) {
        String sqlVerificar = "SELECT COUNT(*) FROM tarefa WHERE id = ?";
        String sqlDelete = "DELETE FROM projeto WHERE id = ?";

        try (Connection conn = Conexao.getConnection()) {

            try (PreparedStatement stmt = conn.prepareStatement(sqlVerificar)) {
                stmt.setInt(1, id);
                ResultSet rs = stmt.executeQuery();

                if (rs.next() && rs.getInt(1) > 0) {
                    System.out.println("Não é possível deletar: projeto possui tarefas cadastradas.");
                    return false;
                }
            }

            try (PreparedStatement stmt = conn.prepareStatement(sqlDelete)) {
                stmt.setInt(1, id);
                stmt.executeUpdate();
                return true;
            }

        } catch (SQLException e) {
            System.out.println("Erro ao deletar projeto: " + e.getMessage());
            return false;
        }
    }
}