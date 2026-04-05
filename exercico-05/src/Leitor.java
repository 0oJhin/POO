public class Leitor {

    private String nome;
    private int matricula;
    private String email;
    private int telefone;

    public Leitor(String nome, int matricula, String email , int telefone) {
    this.nome = nome;
    this.matricula = matricula;
    this.email = email;
    this.telefone = telefone;
    }
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public int getMatricula(){
        return matricula;
    }
    public void setMatricula(int matricula){
        this.matricula = matricula;
    }

    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public int getTelefone(){
        return telefone;
    }
    public void setTelefone(int telefone){
        this.telefone = telefone;
    }
}
