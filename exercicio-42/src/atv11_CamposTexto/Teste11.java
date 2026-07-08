package atv11_CamposTexto;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Teste11 extends JFrame {

    private JTextField campoTexto1;
    private JTextField campoTexto2;
    private JTextField campoTexto3;
    private JPasswordField campoSenha;

    public Teste11() {
        super("Testando JTextField e JPasswordField");

        Container container = getContentPane();
        container.setLayout(new FlowLayout());

        campoTexto1 = new JTextField(10);
        container.add(campoTexto1);

        campoTexto2 = new JTextField("Digite seu texto aqui!");
        container.add(campoTexto2);

        campoTexto3 = new JTextField("Campo de texto não editável", 20);
        campoTexto3.setEditable(false);
        container.add(campoTexto3);

        campoSenha = new JPasswordField("Texto oculto");
        container.add(campoSenha);

        GerenciadorTextField gerenteTexto = new GerenciadorTextField();

        campoTexto1.addActionListener(gerenteTexto);
        campoTexto2.addActionListener(gerenteTexto);
        campoTexto3.addActionListener(gerenteTexto);
        campoSenha.addActionListener(gerenteTexto);

        setSize(360, 120);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private class GerenciadorTextField implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent evento) {
            String texto = "";

            if (evento.getSource() == campoTexto1) {
                texto = "campoTexto1: " + evento.getActionCommand();
            }

            if (evento.getSource() == campoTexto2) {
                texto = "campoTexto2: " + evento.getActionCommand();
            }

            if (evento.getSource() == campoTexto3) {
                texto = "campoTexto3: " + evento.getActionCommand();
            }

            if (evento.getSource() == campoSenha) {
                JPasswordField senha = (JPasswordField) evento.getSource();
                texto = "campoSenha: " + new String(senha.getPassword());
            }

            JOptionPane.showMessageDialog(null, texto);
        }
    }

    public static void main(String[] args) {
        Teste11 programaTexto = new Teste11();
        programaTexto.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}