package atv05_PolimorfismoClasseAbstrata;

public class Main {
    public static void main(String[]args){
        pagamentoCartao p1 = new pagamentoCartao(500);
        pagamentoPix p2 = new pagamentoPix(650);

        p1.processarPagamento();
        p2.processarPagamento();
    }
}
