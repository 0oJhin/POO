package exercicio.view;

import exercicio.controller.PessoaController;
import exercicio.model.Pessoa;

import javax.swing.*;

public class JanelaCadastrarPessoa extends JFrame {

    private JTextField txtId;
    private JTextField txtNome;
    private JTextArea txtResultado;

    private JButton btnCadastrar;
    private JButton btnConsultar;
    private JButton btnAtualizar;
    private JButton btnExcluir;

    private PessoaController controller;

    public JanelaCadastrarPessoa() {
        controller = new PessoaController();

        setTitle("Cadastro de Pessoa");
        setSize(400, 350);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblId = new JLabel("ID:");
        lblId.setBounds(30, 30, 80, 25);
        add(lblId);

        txtId = new JTextField();
        txtId.setBounds(90, 30, 80, 25);
        add(txtId);

        JLabel lblNome = new JLabel("Nome:");
        lblNome.setBounds(30, 65, 80, 25);
        add(lblNome);

        txtNome = new JTextField();
        txtNome.setBounds(90, 65, 220, 25);
        add(txtNome);

        btnCadastrar = new JButton("Cadastrar");
        btnCadastrar.setBounds(30, 110, 120, 30);
        add(btnCadastrar);

        btnConsultar = new JButton("Consultar");
        btnConsultar.setBounds(170, 110, 120, 30);
        add(btnConsultar);

        btnAtualizar = new JButton("Atualizar");
        btnAtualizar.setBounds(30, 150, 120, 30);
        add(btnAtualizar);

        btnExcluir = new JButton("Excluir");
        btnExcluir.setBounds(170, 150, 120, 30);
        add(btnExcluir);

        txtResultado = new JTextArea();
        txtResultado.setBounds(30, 200, 300, 80);
        add(txtResultado);

        btnCadastrar.addActionListener(e -> {
            String nome = txtNome.getText().trim();

            Pessoa pessoa = new Pessoa(nome);
            controller.inserirPessoa(pessoa);

            txtResultado.setText("Pessoa cadastrada com sucesso!");
            txtNome.setText("");
        });

        btnConsultar.addActionListener(e -> {
            String nome = txtNome.getText().trim();

            Pessoa pessoa = controller.buscarPessoaNome(nome);

            if (pessoa != null) {
                txtId.setText(String.valueOf(pessoa.getId()));
                txtResultado.setText(
                        "ID: " + pessoa.getId() +
                                "\nNome: " + pessoa.getNome()
                );
            } else {
                txtResultado.setText("Pessoa não encontrada!");
            }
        });

        btnAtualizar.addActionListener(e -> {
            int id = Integer.parseInt(txtId.getText());
            String nome = txtNome.getText().trim();

            controller.update(id, nome);

            txtResultado.setText("Pessoa atualizada com sucesso!");
        });

        btnExcluir.addActionListener(e -> {
            int id = Integer.parseInt(txtId.getText());

            controller.excluir(id);

            txtResultado.setText("Pessoa removida com sucesso!");
            txtId.setText("");
            txtNome.setText("");
        });
    }
}