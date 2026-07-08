package exercicio55.app;

import exercicio55.view.JanelaCadastrarPessoa;

import javax.swing.SwingUtilities;

public class Main {

    public static void main(String[] args) {

        SwingUtilities.invokeLater(() -> {
            new JanelaCadastrarPessoa();
        });

    }
}