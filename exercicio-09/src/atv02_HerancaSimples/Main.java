package atv02_HerancaSimples;

public class Main {
    public static void main(String[] args){
        Livro teste01 = new Livro("Pequeno Princeso",5100,"Luis Amilton",5616523);
        Revista teste02 =  new Revista("Caprichoso",8585858,8,5,2021);
        MidiaDigital teste03 = new MidiaDigital("Blogueirinhos",123456789,"mp4",100);
        teste01.emprestar();
        teste02.emprestar();
        teste03.emprestar();
    }
}
