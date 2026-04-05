public class Livro {

    private String titulo;
    private String autor;
    private int isbn;
    private boolean emprestado;

    public Livro(String titulo, String autor,int isbn , boolean emprestado){
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.emprestado  = emprestado;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public int getIsbn() {
        return isbn;
    }
    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }
    public boolean isEmprestado() {
        return emprestado;
    }
    public void setEmprestado(boolean emprestado) {
        this.emprestado = emprestado;
    }
    boolean marcarComoEmprestado(){
        if (!emprestado){
            emprestado = true;
            return true;
        }
        return false;
    }
    boolean marcarComoDisponivel(){
        if(emprestado){
            emprestado = false;
            return true;
        }else{
            return false;
        }
    }
    void exibirInformacoes(){
        System.out.println("o livro :"+ getTitulo());
        System.out.println("o autor :"+ getAutor());
        System.out.println("o isbn :"+ getIsbn());
        if (emprestado) {
            System.out.println("o Status : indiponivel para emprestimo");
        }else{
            System.out.println("o Status : diponivel para emprestimo");
        }
    }


}
