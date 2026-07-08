package exercicio54.view;


import exercicio54.controller.PessoaController;
import exercicio54.model.Pessoa;

import javax.swing.*;

public class JanelaCadastrarPessoa extends JFrame {

    private JTextField txtNome;
    private JTextArea txtResultado;
    private JButton btnCadastrar;
    private JButton btnConsultar;

    private PessoaController controller;

    public JanelaCadastrarPessoa() {
        controller = new PessoaController();
        initComponents();
    }

    private void initComponents() {
        setTitle("Cadastro de Pessoa");
        setSize(400, 350);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblNome = new JLabel("Nome:");
        lblNome.setBounds(50, 50, 80, 25);
        add(lblNome);

        txtNome = new JTextField();
        txtNome.setBounds(120, 50, 200, 25);
        add(txtNome);

        btnCadastrar = new JButton("Cadastrar");
        btnCadastrar.setBounds(70, 100, 120, 30);
        add(btnCadastrar);

        btnConsultar = new JButton("Consultar");
        btnConsultar.setBounds(210, 100, 120, 30);
        add(btnConsultar);

        txtResultado = new JTextArea();
        txtResultado.setBounds(70, 160, 250, 80);
        add(txtResultado);

        btnCadastrar.addActionListener(e -> {
            String nome = txtNome.getText().trim();

            controller.cadastrarPessoa(nome);

            txtResultado.setText("Pessoa cadastrada com sucesso!");
            txtNome.setText("");
        });

        btnConsultar.addActionListener(e -> {
            String nome = txtNome.getText().trim();

            Pessoa pessoa = controller.consultarPessoa(nome);

            if (pessoa != null) {
                txtResultado.setText(
                        "ID: " + pessoa.getId() +
                                "\nNome: " + pessoa.getNome()
                );
            } else {
                txtResultado.setText("Pessoa não encontrada!");
            }
        });
    }
}