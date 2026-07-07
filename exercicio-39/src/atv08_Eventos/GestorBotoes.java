package atv08_Eventos;

import javax.swing.*;
import java.awt.event.*;

public class GestorBotoes implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(null, "Botão clicado!");
    }
}