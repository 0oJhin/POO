package exercicio05;
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
    } // getNome() pedido na atividade
    public void setNome(String nome){
        this.nome = nome;
    }
    public int getMatricula(){
        return matricula;
    }// getMatricula() pedido na atividade
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
    //atualizarContato() pedido na atividade
    public void atualizarContato(String novoEmail, int novoTelefone) {
        this.telefone = novoTelefone;
        this.email = novoEmail;
    }
    // exibirInformacoes() pedido na atividade
    public void exibirInformacoes(){
        System.out.println( "informacoes do leitor:");
        System.out.println( "Nome:"+getNome() + " Email: "+ getEmail() + " Telefone: "+ getTelefone() +" Matricula "+ getMatricula());
    }
    // confirmarEmprestimo() pedido na ativiade
    public void confirmarEmprestimo(Livro livro){
        if(!livro.isEmprestado()){
            livro.marcarComoEmprestado();
            System.out.println("o livro "+ livro.getTitulo() +" foi comfirmado como emprestado para: " + getNome() );
        }else{
            System.out.println("o livro "+ livro.getTitulo() +" nao foi comfirmado como emprestado para: " + getNome() );
        }
    }
}
