package atv05_colecoes;
import java.util.Stack;
public class Main {
    public static void main(String[]args){
        Mercadoria m1 = new Mercadoria("Bolo de Morango");
        Mercadoria m2 = new Mercadoria("Bolo de Cenoura");
        Mercadoria m3 = new Mercadoria("Suco de goiaba");
        Mercadoria m4 = new Mercadoria("Palmito");
        
        
        Stack<Mercadoria> s1 = new Stack<>();
        s1.push(m1);
        s1.push(m2);
        s1.push(m3);
        s1.push(m4);
       System.out.println("Pilha atual");
        for(Mercadoria mercadoria : s1){
    System.out.println(mercadoria);
}
    System.out.println("Tamanho pilha: "+s1.size());
    System.out.println("Topo da pilha "+s1.peek());
    
    System.out.println("Topo da pilha removido "+s1.pop());
    
    System.out.println("Pilha atual");       
       
    System.out.println("Tamanho pilha: "+s1.size());
    for(Mercadoria mercadoria : s1){
    System.out.println(mercadoria);
}
    System.out.println("A pilha está vazia? "+s1.empty());   
    
}
}
