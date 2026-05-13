package atv05_PolimorfismoClasseAbstrata;

public class pagamentoPix extends Pagamento{
    pagamentoPix(int valor){
        super(valor);
    }
    public void setValor(int valor){
        this.valor=valor;
    }
   
    public int getValor(){
        return valor;

    }
    public void processarPagamento(){
        System.out.println("O pagamento de : "+getValor()+" Foi feito no pix");
    }

}
