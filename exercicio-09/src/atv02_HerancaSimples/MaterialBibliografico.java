package atv02_HerancaSimples;

public class MaterialBibliografico {
    private String titulo;
    private int codigo;

    public MaterialBibliografico(String titulo, int codigo){
        this.titulo = titulo;
        this.codigo = codigo;
    }
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    public void setCodigo(int codigo){
        this.codigo = codigo;
    }
    public String getTitulo(){
        return titulo;
    }
    public int getCodigo(){
        return codigo;
    }
    public void emprestar(){
        System.out.println("Titulo :"+ getTitulo() );
        System.out.println("Codigo :"+ getCodigo() );
    }

}
