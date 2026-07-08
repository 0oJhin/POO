package atv02_CriarTabela;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class CriarTabelaPessoa {

    public void criarTabela() {

        Connection conn = AbrirConexaoComBD.abrirConexao();

        if (conn == null) {
            System.out.println("Não foi possível conectar.");
            return;
        }

        String sql = """
                CREATE TABLE pessoa(
                    id DECIMAL(10,0) PRIMARY KEY,
                    nome VARCHAR(50),
                    endereco VARCHAR(100)
                )
                """;

        try {

            Statement stmt = conn.createStatement();

            stmt.execute(sql);

            System.out.println("Tabela pessoa criada com sucesso!");

            stmt.close();
            conn.close();

        } catch (SQLException e) {

            System.out.println("Erro ao criar tabela.");
            System.out.println(e.getMessage());

        }

    }
}