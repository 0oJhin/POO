package atv02_excecoes;

public class Main {
    public static void main(String[] args) {

        int numero1 = 10;
        int numero2 = 0;

        try {
            int resultado = numero1 / numero2;
            System.out.println("Resultado da divisão: " + resultado);

        } catch (ArithmeticException e) {
            System.out.println("Erro: divisão por zero não é permitida.");
        }
    }
}