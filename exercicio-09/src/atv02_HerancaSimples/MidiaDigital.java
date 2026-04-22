package atv02_HerancaSimples;

public class MidiaDigital extends MaterialBibliografico{
    private String formatoArquivo;
    private int  tamanhoMb;
    private int totalDownloads;

    public MidiaDigital(String titulo, int codigo, String formatoArquivo, int tamanhoMb){
        super(titulo, codigo);
        this.formatoArquivo = formatoArquivo;
        this.tamanhoMb = tamanhoMb;
        this.totalDownloads = 0;
    }
    public String getFormatoArquivo() {
        return formatoArquivo;
    }
    public int getTamanhoMb() {
        return tamanhoMb;
    }
    public int getTotalDownloads() {
        return totalDownloads;
    }
    public void setTotalDownloads(int totalDownloads) {
        this.totalDownloads = totalDownloads;
    }
    public void subirDownload(){
        this.totalDownloads++;
    }
    public void emprestar(){
        super.emprestar();
        System.out.println("Formato do arquivo : "+ getFormatoArquivo());
        System.out.println("Tamanho em MB : "+ getTamanhoMb());
        System.out.println("Total de downloads : "+ getTotalDownloads());
    }
}
