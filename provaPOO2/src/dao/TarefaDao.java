package dao;

import model.Projeto;
import model.Tarefa;
import util.Conexao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class TarefaDao {

    public void inserirTarefa(Tarefa tarefa) {
        String sql = "INSERT INTO tarefa(titulo, responsavel, prioridade, id) VALUES (?, ?, ?, ?)";

        try (Connection conn = Conexao.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, tarefa.getTitulo());
            stmt.setString(2, tarefa.getResponsavel());
            stmt.setInt(3, tarefa.getPrioridade());
            stmt.setInt(4, tarefa.getProjeto().getId());

            stmt.executeUpdate();

        } catch (SQLException e) {
            System.out.println("Erro ao inserir tarefa: " + e.getMessage());
        }
    }

    public List<Tarefa> listarTarefas() {
        List<Tarefa> lista = new ArrayList<>();

        String sql = """
                SELECT 
                    t.id_tarefa,
                    t.titulo,
                    t.responsavel,
                    t.prioridade,
                    p.id,
                    p.nome,
                    p.cliente,
                    p.prazo
                FROM tarefa t
                INNER JOIN projeto p ON t.id = p.id
                """;

        try (Connection conn = Conexao.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                Projeto projeto = new Projeto();
                projeto.setId(rs.getInt("id"));
                projeto.setNome(rs.getString("nome"));
                projeto.setCliente(rs.getString("cliente"));
                projeto.setPrazo(rs.getString("prazo"));

                Tarefa tarefa = new Tarefa();
                tarefa.setIdTarefa(rs.getInt("id_tarefa"));
                tarefa.setTitulo(rs.getString("titulo"));
                tarefa.setResponsavel(rs.getString("responsavel"));
                tarefa.setPrioridade(rs.getInt("prioridade"));
                tarefa.setProjeto(projeto);

                lista.add(tarefa);
            }

        } catch (SQLException e) {
            System.out.println("Erro ao listar tarefas: " + e.getMessage());
        }

        return lista;
    }

    public void deleteTarefa(int idTarefa) {
        String sql = "DELETE FROM tarefa WHERE id_tarefa = ?";

        try (Connection conn = Conexao.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, idTarefa);
            stmt.executeUpdate();

        } catch (SQLException e) {
            System.out.println("Erro ao deletar tarefa: " + e.getMessage());
        }
    }
}