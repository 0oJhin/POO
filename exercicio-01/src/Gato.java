public class Gato {

    // atributos

    String nome;

    int qtdcomidaDisponivel;

    boolean sono;

    int energia;

    // construtor
    public Gato (String nome, int qtdcomidaDisponivel, boolean sono, int energia){
        this.nome = nome;
        this.qtdcomidaDisponivel = qtdcomidaDisponivel;
        this.sono = sono;
        this.energia = energia;
    };
    // metodos
    void dormir() {
        if (!sono) {
            sono = true;
            energia = 6;
            System.out.println(nome + " dormiu");

        }else{
            System.out.println(nome +" nao tem sono");
        }
    }
    void comer(){
        if(energia >0){
        qtdcomidaDisponivel-= 1;
        energia -=1;
        System.out.println(nome+" comeu. comida restante:"+qtdcomidaDisponivel );
        }else{
            System.out.println(nome+ " não comeu e precisa dormir");
            sono= false;
        }
    }
    void miarrr(){
        if(energia >0){
            energia -=1;
            System.out.println(nome + " miou, como é bonitinho");
        }else{
            System.out.println(nome+ " não miou e precisa dormir");
            sono= false;
        }

    }

}
