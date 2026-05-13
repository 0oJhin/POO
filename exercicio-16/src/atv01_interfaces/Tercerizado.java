package atv01_interfaces;

public class Tercerizado implements PresencaRegistravel{
    private String nome;
    public Tercerizado(String nome){
        this.nome= nome;
    }
    public String getNome(){
        return nome;
    }
    public void executarServico(){
        System.out.println("O terceirizado esta executando servicos de terceirizado ");
    }
    public void registrarPresenca(){
        System.out.println("Presenca registrada para o terceirizado : "+getNome());
    }
}
