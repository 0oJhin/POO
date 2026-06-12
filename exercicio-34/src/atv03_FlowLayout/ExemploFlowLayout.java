package atv03_FlowLayout;

import javax.swing.*;
import java.awt.*;

public class ExemploFlowLayout extends JFrame {
    public ExemploFlowLayout(){
        super("Frame com framelayout");
        JButton b1 = new JButton("Botao 1");
        JButton b2 = new JButton("Botao 2");
        JButton b3 = new JButton("Botao 3");
        this.setSize(600,420);
        //Serve para abrir a area interna da janela
        Container container = this.getContentPane();

        container.add(b1);
        container.add(b2);
        container.add(b3);

        container.setLayout(new java.awt.FlowLayout(FlowLayout.RIGHT));
        this.setVisible(true);
           }
}