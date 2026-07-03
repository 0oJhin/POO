package view;

import controller.ProjetoController;
import model.Projeto;

import javax.swing.*;

public class TelaProjeto extends JFrame {
    private JTextField txtId;
    private JTextField txtNome;
    private JTextField txtCliente;
    private JTextField txtPrazo;
    private JTextArea txtResultado;
    private JButton btnCadastrar;
    private JButton btnExcluir;
    private ProjetoController controller;

    public TelaProjeto() {
        controller = new ProjetoController();

        setTitle("Cadastro Projeto");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblId = new JLabel("ID:");
        lblId.setBounds(30, 30, 80, 25);
        add(lblId);

        txtId = new JTextField();
        txtId.setBounds(120, 30, 180, 25);
        add(txtId);

        JLabel lblNome = new JLabel("Nome:");
        lblNome.setBounds(30, 65, 80, 25);
        add(lblNome);

        txtNome = new JTextField();
        txtNome.setBounds(120, 65, 180, 25);
        add(txtNome);

        JLabel lblCliente = new JLabel("Cliente:");
        lblCliente.setBounds(30, 100, 80, 25);
        add(lblCliente);

        txtCliente = new JTextField();
        txtCliente.setBounds(120, 100, 180, 25);
        add(txtCliente);

        JLabel lblPrazo = new JLabel("Prazo:");
        lblPrazo.setBounds(30, 135, 80, 25);
        add(lblPrazo);

        txtPrazo = new JTextField();
        txtPrazo.setBounds(120, 135, 180, 25);
        add(txtPrazo);

        btnCadastrar = new JButton("Cadastrar");
        btnCadastrar.setBounds(30, 180, 130, 30);
        add(btnCadastrar);

        btnExcluir = new JButton("Excluir");
        btnExcluir.setBounds(170, 180, 130, 30);
        add(btnExcluir);

        txtResultado = new JTextArea();
        txtResultado.setBounds(30, 230, 270, 80);
        add(txtResultado);

        btnCadastrar.addActionListener(e -> {
            String nome = txtNome.getText().trim();
            String cliente = txtCliente.getText().trim();
            String prazo = txtPrazo.getText().trim();

            Projeto projeto = new Projeto(nome, cliente, prazo);
            controller.inserirProjeto(projeto);

            txtResultado.setText("Projeto cadastrado.");
            limparCampos();
        });

        btnExcluir.addActionListener(e -> {
            int id = Integer.parseInt(txtId.getText().trim());

            boolean excluiu = controller.excluirProjeto(id);

            if (excluiu) {
                txtResultado.setText("Projeto removido.");
            } else {
                txtResultado.setText("Não é possível excluir projeto com tarefas.");
            }

            limparCampos();
        });
    }

    private void limparCampos() {
        txtId.setText("");
        txtNome.setText("");
        txtCliente.setText("");
        txtPrazo.setText("");
    }
}