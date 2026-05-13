package exercicio06;

public class Curso {
    private String nome;
    private int cargaHoraria;
    private String nivel;
    private String descricao;
    private Instrutor instrutor1;
    private Instrutor instrutor2;

    public Curso(String nome, int cargaHoraria, String nivel, String descricao) {
                this.nome = nome;
                this.cargaHoraria = cargaHoraria;
                this.nivel = nivel;
                this.descricao = descricao;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }
    public void setNivel(String nivel) {
        this.nivel = nivel;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public String getNome() {
        return nome;
    }
    public int getCargaHoraria() {
        return cargaHoraria;
    }
    public String getNivel() {
        return nivel;
    }
    public String getDescricao() {
        return descricao;
    }
    public void associarInstrutor(Instrutor instrutor){
        if(instrutor1 == null){
                instrutor1 = instrutor;
        }else{
              if(instrutor2 == null){
                  instrutor2 = instrutor;
              }else{
                  System.out.println("Curso ja possui 2 instrutores");
              }
        }
    }
    public void exibirCurso(){
        System.out.println("Nome : "+ getNome());
        System.out.println("Carga Horaria : " + getCargaHoraria()+ "h");
        System.out.println("Nivel : "+ getNivel());
        System.out.println("Descricao : "+ getDescricao());
            if(instrutor1 == null){
                System.out.println("Curso nao possui o instrutor 1");
            }else {
                System.out.println("Instrutor 1 : " + instrutor1.getNome());
            }
            if(instrutor2 == null){
                System.out.println("Curso nao possui o instrutor 2");
            }else {
                System.out.println("Instrutor 2 : " + instrutor2.getNome());
            }
    }
}