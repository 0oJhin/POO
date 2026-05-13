package atv03_interfaces;

public class Main {
    public static void main(String []args){
        PortaAutomatica p1 = new PortaSala();
        PortaAutomatica p2 = new PortaLaboratorio();
        p1.abrirPorta();
        p2.abrirPorta();
    } 
}
