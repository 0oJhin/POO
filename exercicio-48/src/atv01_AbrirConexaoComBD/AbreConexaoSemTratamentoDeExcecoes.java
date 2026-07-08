package atv01_AbrirConexaoComBD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class AbreConexaoSemTratamentoDeExcecoes {

    private static final String URL = "jdbc:mysql://localhost:3306/bancoTeste01";
    private static final String USUARIO = "root";
    private static final String SENHA = "123456";

    public static Connection abrirConexao() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        return DriverManager.getConnection(URL, USUARIO, SENHA);
    }
}