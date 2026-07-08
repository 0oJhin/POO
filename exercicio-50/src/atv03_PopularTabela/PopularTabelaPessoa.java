package atv03_PopularTabela;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class PopularTabelaPessoa {

    public void inserirDados() {

        Connection conn = AbrirConexaoComBD.abrirConexao();

        if (conn == null) {
            System.out.println("Não foi possível conectar ao banco.");
            return;
        }

        try {

            Statement stmt = conn.createStatement();

            stmt.executeUpdate(
                    "INSERT INTO pessoa VALUES (123,'André Silva','Av. Brasil, 100')");

            stmt.executeUpdate(
                    "INSERT INTO pessoa VALUES (234,'João Bezerra','Av. João Naves, 300')");

            stmt.executeUpdate(
                    "INSERT INTO pessoa VALUES (345,'Maria Bonita','Av. Tiradentes, 400')");

            stmt.executeUpdate(
                    "INSERT INTO pessoa VALUES (456,'Joana Darc','Rua Principal, 200')");

            System.out.println("Dados inseridos com sucesso!");

            stmt.close();
            conn.close();

        } catch (SQLException e) {

            System.out.println("Erro ao inserir dados.");
            System.out.println(e.getMessage());

        }

    }

}