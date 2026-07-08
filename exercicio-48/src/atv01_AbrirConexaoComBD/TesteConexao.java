package atv01_AbrirConexaoComBD;

import java.sql.Connection;

public class TesteConexao {
    public static void main(String[] args) {
        Connection conn = AbreConexaoComTratamentoDeExcecoes.abrirConexao();

        if (conn != null) {
            System.out.println("Conexão realizada com sucesso!");
        } else {
            System.out.println("Não foi possível conectar ao banco.");
        }
    }
}