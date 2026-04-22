package atv03_HerancaSimples;

public class Main {
    public static void main(String[] args){

        Gato teste01 = new Gato("Mila",2,"Rajado");
        Cachorro teste02 = new Cachorro("Doguinho",2,"grande");
        teste01.brincar();
        teste01.brincar("Pelucia");
        teste02.correr();
        teste02.correr(1500);

    }

}
