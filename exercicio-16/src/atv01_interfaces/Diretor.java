package atv01_interfaces;

public class Diretor extends Funcionario{
    
    private String setor;
    
    public Diretor(String nome, String setor){
        super(nome);
        this.setor = setor;
    }
    public String getSetor(){
        return setor;
    }
    public void tomarDecisao(){
            System.out.println("o Diretor "+getNome()+" esta tomando decisoes no setor "+getSetor());
    }
}
