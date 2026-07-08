package atv09_Botoes;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Teste09 extends JFrame {

    private JButton botao1;
    private JButton botao2;

    private Icon borbo2;

    private final String strIcone = "icone";
    private final String strFinalizar = "finalizar";

    public Teste09() {
        super("Testando Botões");

        Container container = getContentPane();
        container.setLayout(new FlowLayout());

        borbo2 = new ImageIcon(Teste09.class.getResource("borbo2.jpg"));

        botao1 = new JButton("Botão Java", borbo2);
        botao1.setToolTipText("Pressione o botão");
        botao1.setActionCommand(strIcone);
        container.add(botao1);

        botao2 = new JButton(strFinalizar);
        botao2.setToolTipText("Finaliza o programa");
        botao2.setActionCommand(strFinalizar);
        container.add(botao2);

        GerenciadorBotoes gestorBotoes = new GerenciadorBotoes();

        botao1.addActionListener(gestorBotoes);
        botao2.addActionListener(gestorBotoes);

        setSize(545, 280);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private class GerenciadorBotoes implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent event) {
            if (event.getActionCommand().equals(strIcone)) {
                JOptionPane.showMessageDialog(null, "Você pressionou: botão associado a uma imagem");
            }

            if (event.getActionCommand().equals(strFinalizar)) {
                System.exit(0);
            }
        }
    }

    public static void main(String[] args) {
        Teste09 application = new Teste09();
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}