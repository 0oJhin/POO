package exercicio07;

public class Main {
    public static void main(String[] args) {
        Computador teste07 = new Computador("gigabyte","b450","Ryzen 5 5500",8,"giabyte","amd b450",2,"ddr4" );
        teste07.exibirComputadorCompleto();
        teste07.atualizarProcessador("i5-14600k");
        teste07.expandirMemoriaRam(24);
        teste07.atualizarPlacamae("Z790","ddr5");
        teste07.exibirComputadorCompleto();
    }
}
