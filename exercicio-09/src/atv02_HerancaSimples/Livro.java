package atv02_HerancaSimples;

public class Livro extends MaterialBibliografico {
    private String autor;
    private int isbn;
    public Livro(String titulo, int codigo, String autor, int isbn){
        super(titulo, codigo);
        this.autor = autor;
        this.isbn = isbn;
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
    public void emprestar(){
        super.emprestar();
        System.out.println("Autor : "+ getAutor() );
        System.out.println("Isbn : "+ getIsbn());
    }
}
