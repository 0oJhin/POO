package atv02_CriarTabela;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class AbrirConexaoComBD {

    private static final String URL = "jdbc:mysql://localhost:3306/bancoTeste01";
    private static final String USUARIO = "root";
    private static final String SENHA = "123456";

    public static Connection abrirConexao() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection(URL, USUARIO, SENHA);

        } catch (ClassNotFoundException e) {
            System.out.println("Driver não encontrado.");

        } catch (SQLException e) {
            System.out.println("Erro de conexão: " + e.getMessage());
        }

        return null;
    }
}