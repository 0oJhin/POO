package atv04_ConsultarTabela;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConsultarTabelaPessoa {

    public void consultarDados() {

        Connection conn = AbrirConexaoComBD.abrirConexao();

        if (conn == null) {
            System.out.println("Não foi possível conectar ao banco.");
            return;
        }

        try {

            Statement stmt = conn.createStatement();

            ResultSet resultado =
                    stmt.executeQuery("SELECT * FROM pessoa");

            System.out.println("\nDADOS DA TABELA PESSOA\n");

            while (resultado.next()) {

                System.out.println("ID: " + resultado.getInt("id"));
                System.out.println("Nome: " + resultado.getString("nome"));
                System.out.println("Endereço: " + resultado.getString("endereco"));
                System.out.println("---------------------------");

            }

            resultado.close();
            stmt.close();
            conn.close();

        } catch (SQLException e) {

            System.out.println("Erro na consulta.");
            System.out.println(e.getMessage());

        }

    }

}