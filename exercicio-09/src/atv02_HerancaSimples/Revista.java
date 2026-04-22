package atv02_HerancaSimples;

public class Revista extends MaterialBibliografico {
    private int edicao;
    private int mes;
    private int ano;

    public Revista(String titulo, int codigo, int edicao, int mes, int ano){
        super(titulo, codigo);
        this.edicao = edicao;
        this.mes = mes;
        this.ano = ano;
    }

    public int getEdicao() {
        return edicao;
    }

    public void setEdicao(int edicao) {
        this.edicao = edicao;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
    public void emprestar(){
        super.emprestar();
        System.out.println("Dia: "+ getEdicao());
        System.out.println("Mes: "+ getMes());
        System.out.println("Ano: "+ getAno());
    }
}
