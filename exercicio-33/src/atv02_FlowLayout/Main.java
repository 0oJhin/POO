package atv02_FlowLayout;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Main {
    public static void main(String[]args){
        JanelaEvento j1 = new JanelaEvento();
        j1.addWindowListener(new WindowAdapter() {
        public void windowClosing(WindowEvent e){
            super.windowClosing(e);
            System.exit(0);
        }
        });
    }
}