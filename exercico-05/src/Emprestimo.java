import java.time.LocalDate;

public class Emprestimo {



    private Livro livro;
    private Leitor leitor;
    private LocalDate dataRetirada;
    private LocalDate dataDevolucao;
    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    public Leitor getLeitor() {
        return leitor;
    }

    public void setLeitor(Leitor leitor) {
        this.leitor = leitor;
    }

    public LocalDate getDataRetirada() {
        return dataRetirada;
    }

    public LocalDate getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(LocalDate dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public void setDataRetirada(LocalDate dataRetirada) {
        this.dataRetirada = dataRetirada;
    }

    // construtor
    public Emprestimo(Livro livro, Leitor leitor, LocalDate dataRetirada, LocalDate dataDevolucao){
        this.livro = livro;
        this.leitor = leitor;
        this.dataRetirada = dataRetirada;
        this.dataDevolucao = dataDevolucao;
        //marcarComoEmprestado() esta dentro de confirmarEmprestimo
        leitor.confirmarEmprestimo(livro);
    }
    //metodos
    public void exibirResumo(){
        System.out.println("Nome: "+leitor.getNome() );
        System.out.println("Matricula: " + leitor.getMatricula());
        System.out.println("Livro: "+livro.getTitulo() );
        System.out.println("Autor: "+livro.getAutor() );
        System.out.println("Data da retirada : "+ getDataRetirada());
        System.out.println("Previsao devolucao : "+ getDataDevolucao());
    }
    public void devolverLivro(){
        if(livro.isEmprestado()){
            livro.marcarComoDisponivel();
            System.out.println("o livro "+ livro.getTitulo() +" foi devolvido por : " + leitor.getNome() );
        }else{
            System.out.println("o livro "+ livro.getTitulo() +" ja esta disponivel " );
        }
    }
    public boolean estaAtrasado(LocalDate hoje){
        if(hoje.isAfter(getDataDevolucao())){
            System.out.println("o livro: " + livro.getTitulo() + " esta atrasado pelo leitor: " + leitor.getNome());
            return true;
        }else{
            System.out.println("o livro: " + livro.getTitulo() + " ainda esta no prazo pelo leitor: " + leitor.getNome());
            return false;
        }
    }
}
