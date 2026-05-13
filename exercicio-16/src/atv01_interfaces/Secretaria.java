package atv01_interfaces;

public class Secretaria extends Funcionario implements PresencaRegistravel {
    private String turno;

    public Secretaria(String nome, String turno){
        super(nome);
        this.turno = turno;
    }
    public String getTurno(){
        return turno;
    }
    public void organizarDocumento(){
        System.out.println("O secretario(a) "+getNome()+" esta organizando documentos no turno "+getTurno());
    }
    public void registrarPresenca(){
        
            System.out.println("Presenca registrada para o secretario(a) : "+getNome());
    }
}
