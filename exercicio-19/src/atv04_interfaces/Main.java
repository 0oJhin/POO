package atv04_interfaces;

public class Main {
    public static void main(String []args){
        ProjetorInteligente p0= new ProjetorInteligente();
        Ligavel l1 = p0;
        Conectavel c1 = p0;

        l1.ligar();
        c1.conectarInternet();
        
    }
}
