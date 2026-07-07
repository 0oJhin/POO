package atv07_Rotulos;

import java.awt.*;
import javax.swing.*;

public class Teste07 extends JFrame {

    private final JLabel label;
    private final Icon icone;

    public Teste07() {
        super("Testando JLabel");

        Container container = getContentPane();
        container.setLayout(new FlowLayout());

        ImageIcon imagemOriginal = new ImageIcon(getClass().getResource("ABc.png"));

        Image imagemRedimensionada = imagemOriginal.getImage()
                .getScaledInstance(220, 160, Image.SCALE_SMOOTH);

        icone = new ImageIcon(imagemRedimensionada);

        label = new JLabel();
        label.setText("Label com ícone e texto com alinhamento inferior (BOTTOM)");
        label.setIcon(icone);
        label.setHorizontalTextPosition(SwingConstants.CENTER);
        label.setVerticalTextPosition(SwingConstants.BOTTOM);

        label.setToolTipText("Este é o label");

        container.add(label);

        setSize(500, 300);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        Teste07 application = new Teste07();
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}