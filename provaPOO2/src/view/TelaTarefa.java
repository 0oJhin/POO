package view;

import controller.TarefaController;
import model.Tarefa;

import javax.swing.*;

public class TelaTarefa extends JFrame {
    private JTextField txtId_tarefa;
    private JTextField txtNome;
    private JTextField txtTitulo;
    private JTextField txtResponsavel;
    private JTextField txtPrioridade;
    private JTextField txtId;
    private JTextArea txtResultado;
    private JButton btncadastrar;
    private JButton btnExcluir;
    private TarefaController controller;
    public TelaTarefa(){
        controller= new TarefaController();
        setTitle("Cadastro projeto");
        setSize(400,650);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblId = new JLabel ("ID_tarefa: ");
        lblId.setBounds(30,30,80,25);
        add(txtId_tarefa);
        txtId_tarefa = new JTextField();
        txtId_tarefa.setBounds(30,30,80,25);
        add(txtId_tarefa);

        JLabel lblNome = new JLabel ("Nome");
        lblNome.setBounds(90,65,220,25);
        add(txtNome);
        txtNome = new JTextField();
        txtNome.setBounds(90,65,220,25);
        add(txtNome);

        JLabel lblTitulo = new JLabel ("Titulo: ");
        lblTitulo.setBounds(30,60,80,25);
        add(txtTitulo);
        txtTitulo = new JTextField();
        txtTitulo.setBounds(30,60,80,25);
        add(txtTitulo);

        JLabel lblPrioridade = new JLabel ("Prioridade: ");
        lblPrioridade.setBounds(30,90,80,25);
        add(txtPrioridade);
        txtPrioridade = new JTextField();
        txtPrioridade.setBounds(30,90,80,25);
        add(txtPrioridade);


        JLabel lblResponsavel = new JLabel ("Responsavel: ");
        lblResponsavel.setBounds(30,90,80,25);
        add(txtResponsavel);
        txtResponsavel = new JTextField();
        txtResponsavel.setBounds(30,90,80,25);
        add(txtResponsavel);

        JLabel lblIdid = new JLabel ("ID: ");
        lblIdid.setBounds(30,30,80,25);
        add(txtId);
        txtId = new JTextField();
        txtId.setBounds(30,30,80,25);
        add(txtId);

        btncadastrar = new JButton("Cadastrar");
        btncadastrar.setBounds(30,120,220,25);
        add(btncadastrar);

        btnExcluir = new JButton("excluir");
        btnExcluir.setBounds(30,150,220,25);
        add(btnExcluir);

        txtResultado = new JTextArea();
        txtResultado.setBounds(170,150,130,30);
        add(txtResultado);

        btncadastrar.addActionListener(e -> {
            String nome = txtNome.getText().trim();
            String titulo = txtTitulo.getText().trim();
            int prioridade = txtPrioridade.getText().trim();
            int id = txtId.getText().trim();
            Tarefa tarefa = new Tarefa(nome,titulo,prioridade,id);
            controller.inserirTarefa(tarefa);
            txtResultado.setText("Pessoa Cadastrada");
            txtNome.setText("");
        });

        btnExcluir.addActionListener(e -> {
            int id_tarefa = Integer.parseInt(txtId_tarefa.getText());
            controller.excluirTarefa(id_tarefa);
            txtResultado.setText("Projeto Removido");
            txtId_tarefa.setText("");
            txtNome.setText("");
            txtTitulo.setText("");
            txtPrioridade.setText("");
            txtTitulo.setText("");
            txtId.setText("");

        });

    }
}
