package atv01_excecoes;
public class Main {
    public static void main(String []args){
        Conta c1 = new Conta(5.5,6.3);
        try{
    c1.deposita(3.2);

} catch(IllegalArgumentException e){
    System.out.println(e.getMessage());
}
try{
    c1.deposita(0);

} catch(IllegalArgumentException e){
    System.out.println(e.getMessage());
}
try{
    c1.deposita(-5);

} catch(IllegalArgumentException e){
    System.out.println(e.getMessage());
}
    }
}
