package atv01_interfaces;
public class Main {
    public static void main(String[]args){
        Diretor d1 = new Diretor( "Cleberson", "Norte");
        Professor p1 = new Professor("Cafu","Educacao Fisica");
        Secretaria s1 = new Secretaria("Maria","vespertino");
        Tercerizado t1 = new Tercerizado("Jose");
        
        d1.tomarDecisao();
        
        p1.lecionar();
        p1.registrarPresenca();

        s1.organizarDocumento();
        s1.registrarPresenca();
        
        t1.executarServico();
        t1.registrarPresenca();
    }
}
