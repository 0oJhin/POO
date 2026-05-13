package atv02_interfaces;
public class Main {
    public static void main(String[]args){  
        Notificacao n1 = new Email();
        Notificacao s1 = new Sms();
        
        n1.enviarMensagem();
        s1.enviarMensagem();
    }
}
