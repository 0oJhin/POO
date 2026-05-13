package atv05_colecoes;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        Stack<Mercadoria> pilha = new Stack<>();

        Mercadoria m1 = new Mercadoria("Mouse");
        Mercadoria m2 = new Mercadoria("Teclado");
        Mercadoria m3 = new Mercadoria("Monitor");

        pilha.push(m1);
        pilha.push(m2);
        pilha.push(m3);

        System.out.println("=== ELEMENTOS DA PILHA ===");
        for (Mercadoria mercadoria : pilha) {
            System.out.println(mercadoria);
        }

        System.out.println("\n=== TOPO DA PILHA ===");
        System.out.println(pilha.peek());

        System.out.println("\n=== REMOVENDO ELEMENTO ===");
        System.out.println("Removido: " + pilha.pop());

        System.out.println("\n=== PILHA APOS REMOCAO ===");
        for (Mercadoria mercadoria : pilha) {
            System.out.println(mercadoria);
        }

        System.out.println("\n=== QUANTIDADE DE ELEMENTOS ===");
        System.out.println(pilha.size());

        System.out.println("\n=== PILHA ESTA VAZIA? ===");
        System.out.println(pilha.empty());
    }
}