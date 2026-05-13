    package atv05_PolimorfismoClasseAbstrata;

    public abstract class Pagamento {
        protected int valor;
        public Pagamento(int valor){
            this.valor = valor;
        }
        public abstract int getValor();
        public abstract void setValor(int valor);
        public abstract void processarPagamento();
        
    }
