package atv12_Selecao;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Teste12 extends JFrame {

    private JCheckBox checkB;
    private JCheckBox checkI;

    private JRadioButton rbotao1;
    private JRadioButton rbotao2;
    private JRadioButton rbotao3;

    private ButtonGroup grupoRadio;

    private JPanel painel1;
    private JPanel painel2;

    public Teste12() {
        super("Testando CheckBox e RadioButton");

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container container = getContentPane();
        container.setLayout(new FlowLayout());

        painel1 = new JPanel();
        painel2 = new JPanel();

        checkB = new JCheckBox("Bold");
        checkI = new JCheckBox("Itálico");

        painel1.add(checkB);
        painel1.add(checkI);
        container.add(painel1);

        rbotao1 = new JRadioButton("Plain", true);
        rbotao2 = new JRadioButton("Bold", false);
        rbotao3 = new JRadioButton("Itálico", false);

        painel2.add(rbotao1);
        painel2.add(rbotao2);
        painel2.add(rbotao3);
        container.add(painel2);

        grupoRadio = new ButtonGroup();
        grupoRadio.add(rbotao1);
        grupoRadio.add(rbotao2);
        grupoRadio.add(rbotao3);

        Gerenciador gerente = new Gerenciador();

        checkB.addItemListener(gerente);
        checkI.addItemListener(gerente);
        rbotao1.addItemListener(gerente);
        rbotao2.addItemListener(gerente);
        rbotao3.addItemListener(gerente);

        setSize(320, 120);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private class Gerenciador implements ItemListener {

        @Override
        public void itemStateChanged(ItemEvent event) {
            Object src = event.getSource();
            boolean selecionado = event.getStateChange() == ItemEvent.SELECTED;

            SwingUtilities.invokeLater(() -> {
                if (src == checkB) {
                    if (selecionado) {
                        JOptionPane.showMessageDialog(null, "Checkbox Bold selecionado");
                    } else {
                        JOptionPane.showMessageDialog(null, "Checkbox Bold desmarcado");
                    }
                }

                if (src == checkI) {
                    if (selecionado) {
                        JOptionPane.showMessageDialog(null, "Checkbox Itálico selecionado");
                    } else {
                        JOptionPane.showMessageDialog(null, "Checkbox Itálico desmarcado");
                    }
                }

                if (src == rbotao1 && selecionado) {
                    JOptionPane.showMessageDialog(null, "Radio Plain selecionado");
                }

                if (src == rbotao2 && selecionado) {
                    JOptionPane.showMessageDialog(null, "Radio Bold selecionado");
                }

                if (src == rbotao3 && selecionado) {
                    JOptionPane.showMessageDialog(null, "Radio Itálico selecionado");
                }
            });
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Teste12::new);
    }
}