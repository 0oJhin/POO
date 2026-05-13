package atv04_interfaces;

public class ProjetorInteligente implements Ligavel , Conectavel {
    public void ligar(){
        System.out.println("O projetor ligou");
    }
    public void conectarInternet(){
        System.out.println("o projetor conectou a internet");
    }
}
