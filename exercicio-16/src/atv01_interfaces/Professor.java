package atv01_interfaces;

public class Professor extends Funcionario implements PresencaRegistravel {
    
    private String disciplina;

    public Professor(String nome, String disciplina){
        super(nome);
        this.disciplina = disciplina;
    }
    public String getDisciplina(){
        return disciplina;
    }
    public void lecionar(){
        System.out.println("O professor "+getNome()+" esta dando aula da disciplina "+getDisciplina());
    }
    public void registrarPresenca(){
            System.out.println("Presenca registrada para o prrofessor(a): "+getNome());
    }
}
