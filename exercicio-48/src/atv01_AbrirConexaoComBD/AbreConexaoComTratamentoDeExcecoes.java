package atv01_AbrirConexaoComBD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class AbreConexaoComTratamentoDeExcecoes {

    private static final String URL = "jdbc:mysql://localhost:3306/bancoTeste01";
    private static final String USUARIO = "root";
    private static final String SENHA = "123456";

    public static Connection abrirConexao() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection(URL, USUARIO, SENHA);
        } catch (ClassNotFoundException e) {
            System.out.println("Driver JDBC não encontrado: " + e.getMessage());
        } catch (SQLException e) {
            System.out.println("Erro ao conectar ao banco: " + e.getMessage());
        }

        return null;
    }
}