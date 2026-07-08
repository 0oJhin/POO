package exercicio55.view;

import exercicio55.controller.PessoaController;
import exercicio55.model.Pessoa;

import javax.swing.*;
import java.awt.*;

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

        super("Cadastro de Pessoa");

        controller = new PessoaController();

        setLayout(new FlowLayout());

        add(new JLabel("ID"));
        txtId = new JTextField(10);
        add(txtId);

        add(new JLabel("Nome"));
        txtNome = new JTextField(20);
        add(txtNome);

        btnCadastrar = new JButton("Cadastrar");
        btnConsultar = new JButton("Consultar");
        btnAtualizar = new JButton("Atualizar");
        btnExcluir = new JButton("Excluir");

        add(btnCadastrar);
        add(btnConsultar);
        add(btnAtualizar);
        add(btnExcluir);

        txtResultado = new JTextArea(8,30);
        txtResultado.setEditable(false);

        add(new JScrollPane(txtResultado));

        btnCadastrar.addActionListener(e -> {

            String nome = txtNome.getText().trim();

            controller.cadastrarPessoa(nome);

            txtResultado.setText("Pessoa cadastrada com sucesso!");

        });

        btnConsultar.addActionListener(e -> {

            String nome = txtNome.getText().trim();

            Pessoa pessoa = controller.consultarPessoa(nome);

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

            String nome = txtNome.getText();

            controller.atualizarPessoa(id, nome);

            txtResultado.setText("Pessoa atualizada com sucesso!");

        });

        btnExcluir.addActionListener(e -> {

            int id = Integer.parseInt(txtId.getText());

            controller.excluirPessoa(id);

            txtResultado.setText("Pessoa removida com sucesso!");

            txtId.setText("");
            txtNome.setText("");

        });

        setSize(400,350);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);

    }

}