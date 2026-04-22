package exercicio07;

public class Computador {
   private String marca;
   private String modelo;
   private String processador;
   private int memoriaRam;
   private PlacaMae placaMae;

   public Computador(String marca, String modelo, String processador, int memoriaRam, String fabricante, String chipset, int numeroDeSlots, String tipoDeMemoriaSuportada) {
       this.marca =  marca;
       this.modelo = modelo;
       this.processador = processador;
       this.memoriaRam = memoriaRam;
       this.placaMae = new PlacaMae(fabricante, chipset, numeroDeSlots, tipoDeMemoriaSuportada);
   }

    public int getMemoriaRam() {
        return memoriaRam;
    }

    public void setMemoriaRam(int memoriaRam) {
        this.memoriaRam = memoriaRam;
    }

    public String getProcessador() {
        return processador;
    }

    public void setProcessador(String processador) {
        this.processador = processador;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    public void exibirComputadorCompleto(){
       System.out.println("Marca : "+ getMarca());
       System.out.println("Modelo : "+ getModelo());
       System.out.println("Processador : "+ getProcessador());
       System.out.println("Memoria Ram : "+ getMemoriaRam()+"GB");
       placaMae.exibirInformacoes();
    }
    public void atualizarProcessador(String novoProcessador){
        this.processador = novoProcessador;
    }
    public void expandirMemoriaRam(int adicional){
       this.memoriaRam = memoriaRam + adicional;
    }
    public void atualizarPlacamae(String novoChipset, String novoTipoMemoria){
       this.placaMae.atualizarChipset(novoChipset);
       this.placaMae.definirTipoMemoria(novoTipoMemoria);
    }

}
