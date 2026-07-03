package view;

import controller.TarefaController;
import model.Projeto;
import model.Tarefa;

import javax.swing.*;

public class TelaTarefa extends JFrame {
    private JTextField txtIdTarefa;
    private JTextField txtTitulo;
    private JTextField txtResponsavel;
    private JTextField txtPrioridade;
    private JTextField txtIdProjeto;
    private JTextArea txtResultado;
    private JButton btnCadastrar;
    private JButton btnExcluir;
    private TarefaController controller;

    public TelaTarefa() {
        controller = new TarefaController();

        setTitle("Cadastro Tarefa");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblIdTarefa = new JLabel("ID Tarefa:");
        lblIdTarefa.setBounds(30, 30, 100, 25);
        add(lblIdTarefa);

        txtIdTarefa = new JTextField();
        txtIdTarefa.setBounds(140, 30, 180, 25);
        add(txtIdTarefa);

        JLabel lblTitulo = new JLabel("Título:");
        lblTitulo.setBounds(30, 65, 100, 25);
        add(lblTitulo);

        txtTitulo = new JTextField();
        txtTitulo.setBounds(140, 65, 180, 25);
        add(txtTitulo);

        JLabel lblResponsavel = new JLabel("Responsável:");
        lblResponsavel.setBounds(30, 100, 100, 25);
        add(lblResponsavel);

        txtResponsavel = new JTextField();
        txtResponsavel.setBounds(140, 100, 180, 25);
        add(txtResponsavel);

        JLabel lblPrioridade = new JLabel("Prioridade:");
        lblPrioridade.setBounds(30, 135, 100, 25);
        add(lblPrioridade);

        txtPrioridade = new JTextField();
        txtPrioridade.setBounds(140, 135, 180, 25);
        add(txtPrioridade);

        JLabel lblIdProjeto = new JLabel("ID Projeto:");
        lblIdProjeto.setBounds(30, 170, 100, 25);
        add(lblIdProjeto);

        txtIdProjeto = new JTextField();
        txtIdProjeto.setBounds(140, 170, 180, 25);
        add(txtIdProjeto);

        btnCadastrar = new JButton("Cadastrar");
        btnCadastrar.setBounds(30, 215, 140, 30);
        add(btnCadastrar);

        btnExcluir = new JButton("Excluir");
        btnExcluir.setBounds(180, 215, 140, 30);
        add(btnExcluir);

        txtResultado = new JTextArea();
        txtResultado.setBounds(30, 260, 290, 60);
        add(txtResultado);

        btnCadastrar.addActionListener(e -> {
            String titulo = txtTitulo.getText().trim();
            String responsavel = txtResponsavel.getText().trim();
            int prioridade = Integer.parseInt(txtPrioridade.getText().trim());
            int idProjeto = Integer.parseInt(txtIdProjeto.getText().trim());

            Projeto projeto = new Projeto();
            projeto.setId(idProjeto);

            Tarefa tarefa = new Tarefa(titulo, responsavel, prioridade, projeto);

            controller.inserirTarefa(tarefa);

            txtResultado.setText("Tarefa cadastrada.");
            limparCampos();
        });

        btnExcluir.addActionListener(e -> {
            int idTarefa = Integer.parseInt(txtIdTarefa.getText().trim());

            controller.excluirTarefa(idTarefa);

            txtResultado.setText("Tarefa removida.");
            limparCampos();
        });
    }

    private void limparCampos() {
        txtIdTarefa.setText("");
        txtTitulo.setText("");
        txtResponsavel.setText("");
        txtPrioridade.setText("");
        txtIdProjeto.setText("");
    }
}