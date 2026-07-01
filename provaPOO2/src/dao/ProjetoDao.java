package dao;
import model.Projeto;
import util.Conexao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ProjetoDao {

        public void inserirProjeto(Projeto projeto){
            String sql ="INSERT INTo projeto(nome,cliente,prazo)VAlues(?,?,?)";
            try(Connection conn = Conexao.getConnection();
                PreparedStatement stmt= conn.prepareStatement(sql)){
                stmt.setString(1,projeto.getNome());
                stmt.setString(2,projeto.getCliente());
                stmt.setString(3,projeto.getPrazo());

                stmt.executeUpdate();
            }
            catch(SQLException e){
                System.out.println("Erro ao inserir projeto : " + e.getMessage());
            }

        }

        public void deleteProjeto(int id) {
            String sql = "DELETE FROm projeto WHERE id = ?";
            try(Connection conn = Conexao.getConnection();
                PreparedStatement stmt= conn.prepareStatement(sql)){
                stmt.setInt(1,id);
                stmt.executeUpdate();
            }catch(SQLException e){
                System.out.println("Erro ao deletar projeto: "+e.getMessage());
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
                    projeto.setNome(rs.getString("mome"));
                    projeto.setCliente(rs.getString("cliente"));
                    projeto.setPrazo(rs.getString("Prazo"));
                }
            } catch (SQLException e) {
                System.out.println("Erro ao buscar projeto : " + e.getMessage());
            }
            return null;
        }

}