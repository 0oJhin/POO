package atv10_Formulario;

import javax.swing.*;

public class Teste10 extends JFrame {

    private JLabel labelCodigo;
    private JLabel labelNome;
    private JLabel labelEmail;

    private JTextField fieldCodigo;
    private JTextField fieldNome;
    private JTextField fieldEmail;

    private JButton buttonCadastrar;

    public Teste10() {
        initComponents();
    }

    private void initComponents() {
        this.setTitle("Cadastrar Cliente");
        this.setSize(400, 300);
        this.setResizable(false);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.getContentPane().setLayout(null);

        labelCodigo = new JLabel();
        labelCodigo.setText("Código:");
        labelCodigo.setBounds(30, 30, 70, 20);
        this.add(labelCodigo);

        labelNome = new JLabel();
        labelNome.setText("Nome:");
        labelNome.setBounds(30, 80, 70, 20);
        this.add(labelNome);

        labelEmail = new JLabel();
        labelEmail.setText("Email:");
        labelEmail.setBounds(30, 130, 70, 20);
        this.add(labelEmail);

        fieldCodigo = new JTextField();
        fieldCodigo.setBounds(90, 30, 50, 20);
        fieldCodigo.setEnabled(false);
        this.add(fieldCodigo);

        fieldNome = new JTextField();
        fieldNome.setBounds(90, 80, 250, 20);
        this.add(fieldNome);

        fieldEmail = new JTextField();
        fieldEmail.setBounds(90, 130, 250, 20);
        this.add(fieldEmail);

        buttonCadastrar = new JButton();
        buttonCadastrar.setText("Cadastrar");
        buttonCadastrar.setBounds(90, 180, 120, 25);
        this.add(buttonCadastrar);

        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Teste10());
    }
}