package exercicio07;

public class PlacaMae {
    private String fabricante;
    private String chipset;
    private int numeroDeSlots;
    private String tipoDeMemoriaSuportada;

    public PlacaMae(String fabricante, String chipset, int numeroDeSlots, String tipoDeMemoriaSuportada) {
        this.fabricante = fabricante;
        this.chipset = chipset;
        this.numeroDeSlots = numeroDeSlots;
        this.tipoDeMemoriaSuportada = tipoDeMemoriaSuportada;
    }

    public String getTipoDeMemoriaSuportada() {
        return tipoDeMemoriaSuportada;
    }

    public void setTipoDeMemoriaSuportada(String tipoDeMemoriaSuportada) {
        this.tipoDeMemoriaSuportada = tipoDeMemoriaSuportada;
    }

    public int getNumeroDeSlots() {
        return numeroDeSlots;
    }

    public void setNumeroDeSlots(int numeroDeSlots) {
        this.numeroDeSlots = numeroDeSlots;
    }

    public String getChipset() {
        return chipset;
    }

    public void setChipset(String chipset) {
        this.chipset = chipset;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }
    public void exibirInformacoes(){
        System.out.println("Informacoes da placa mae : ");
        System.out.println("Fabricante : "+ getFabricante());
        System.out.println("Chipset : "+ getChipset());
        System.out.println("Numero de slots : "+ getNumeroDeSlots());
        System.out.println("Tipo de memoria suportada : "+ getTipoDeMemoriaSuportada());
    }
    public void atualizarChipset(String novoChipset){
        this.chipset = novoChipset;
    }
    public void adicionarSlot(){
        this.numeroDeSlots=numeroDeSlots+1;
    }
    public void definirTipoMemoria(String tipo){
        this.tipoDeMemoriaSuportada = tipo;
    }
}
