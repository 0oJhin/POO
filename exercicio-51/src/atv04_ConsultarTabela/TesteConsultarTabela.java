package atv04_ConsultarTabela;

public class TesteConsultarTabela {

    public static void main(String[] args) {

        System.out.println("Iniciando consulta da tabela pessoa...\n");

        ConsultarTabelaPessoa consulta = new ConsultarTabelaPessoa();

        consulta.consultarDados();

        System.out.println("\nProcesso finalizado.");

    }

}