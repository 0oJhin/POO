package provaPoo1.view;

import provaPoo1.controller.LaboratorioController;
import provaPoo1.model.Laboratorio;

import javax.swing.*;

public class JanelaCadastroLaboratorio extends JFrame {
    private JTextField txtId;
    private JTextField txtNome;
    private JTextField txtBloco;
    private JTextField txtCapacidade;
    private JTextField txtResponsavel;
    private JTextArea txtResultado;

    private JButton btnCadastrar;
    private JButton btnExcluir;

    private LaboratorioController controller;

    public JanelaCadastroLaboratorio() {
        controller = new LaboratorioController();

        setTitle("Cadastro Laboratorio");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblId = new JLabel("ID:");
        lblId.setBounds(30, 30, 100, 25);
        add(lblId);

        txtId = new JTextField();
        txtId.setBounds(140, 30, 180, 25);
        add(txtId);

        JLabel lblNome = new JLabel("Nome:");
        lblNome.setBounds(30, 65, 100, 25);
        add(lblNome);

        txtNome = new JTextField();
        txtNome.setBounds(140, 65, 180, 25);
        add(txtNome);

        JLabel lblBloco = new JLabel("Bloco:");
        lblBloco.setBounds(30, 100, 100, 25);
        add(lblBloco);

        txtBloco = new JTextField();
        txtBloco.setBounds(140, 100, 180, 25);
        add(txtBloco);

        JLabel lblCapacidade = new JLabel("Capacidade:");
        lblCapacidade.setBounds(30, 135, 100, 25);
        add(lblCapacidade);

        txtCapacidade = new JTextField();
        txtCapacidade.setBounds(140, 135, 180, 25);
        add(txtCapacidade);

        JLabel lblResponsavel = new JLabel("Responsavel:");
        lblResponsavel.setBounds(30, 170, 100, 25);
        add(lblResponsavel);

        txtResponsavel = new JTextField();
        txtResponsavel.setBounds(140, 170, 180, 25);
        add(txtResponsavel);

        btnCadastrar = new JButton("Cadastrar");
        btnCadastrar.setBounds(30, 215, 130, 30);
        add(btnCadastrar);

        btnExcluir = new JButton("Excluir");
        btnExcluir.setBounds(190, 215, 130, 30);
        add(btnExcluir);

        txtResultado = new JTextArea();
        txtResultado.setBounds(30, 265, 290, 60);
        add(txtResultado);

        btnCadastrar.addActionListener(e -> {
            String nome = txtNome.getText().trim();
            int bloco = Integer.parseInt(txtBloco.getText().trim());
            int capacidade = Integer.parseInt(txtCapacidade.getText().trim());
            String responsavel = txtResponsavel.getText().trim();

            Laboratorio laboratorio = new Laboratorio(nome, bloco, capacidade, responsavel);
            controller.inserirLaboratorio(laboratorio);

            txtResultado.setText("Laboratório cadastrado com sucesso!");
        });

        btnExcluir.addActionListener(e -> {
            int id = Integer.parseInt(txtId.getText().trim());

            controller.excluir(id);

            txtResultado.setText("Laboratório excluído com sucesso!");
        });
    }
}