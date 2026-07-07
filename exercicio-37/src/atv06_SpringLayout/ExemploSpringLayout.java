package atv06_SpringLayout;

import javax.swing.*;
import java.awt.*;

public class ExemploSpringLayout extends JFrame {

    public ExemploSpringLayout() {
        super("Exemplo SpringLayout");

        SpringLayout layout = new SpringLayout();
        Container c = getContentPane();
        c.setLayout(layout);

        JButton botao1 = new JButton("Botão 1");
        JButton botao2 = new JButton("Botão 2");

        c.add(botao1);
        c.add(botao2);

        layout.putConstraint(SpringLayout.NORTH, botao1, 20, SpringLayout.NORTH, c);
        layout.putConstraint(SpringLayout.WEST, botao1, 30, SpringLayout.WEST, c);

        layout.putConstraint(SpringLayout.NORTH, botao2, 20, SpringLayout.SOUTH, botao1);
        layout.putConstraint(SpringLayout.WEST, botao2, 0, SpringLayout.WEST, botao1);

        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }
}