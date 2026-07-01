package view;
import controller.ProjetoController;
import model.Projeto;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
public class TelaProjeto extends JFrame {
    private JTextField txtId;
    private JTextField txtNome;
    private JTextField txtCliente;
    private JTextField txtPrazo;
    private JTextArea txtResultado;
    private JButton btncadastrar;
    private JButton btnExcluir;
    private ProjetoController controller;
    public TelaProjeto(){
        controller= new ProjetoController();
        setTitle("Cadastro projeto");
        setSize(400,650);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblId = new JLabel ("ID: ");
        lblId.setBounds(30,30,80,25);
        add(txtId);
        txtId = new JTextField();
        txtId.setBounds(30,30,80,25);
        add(txtId);

        JLabel lblNome = new JLabel ("Nome");
        lblNome.setBounds(90,65,220,25);
        add(txtNome);
        txtNome = new JTextField();
        txtNome.setBounds(90,65,220,25);
        add(txtNome);
        
        JLabel lblCliente = new JLabel ("Cliente: ");
        lblCliente.setBounds(30,60,80,25);
        add(txtCliente);
        
        txtCliente = new JTextField();
        txtCliente.setBounds(30,60,80,25);
        add(txtCliente);
        
        JLabel lblPrazo = new JLabel ("Prazo: ");
        lblPrazo.setBounds(30,90,80,25);
        add(txtPrazo);
        txtPrazo = new JTextField();
        txtPrazo.setBounds(30,90,80,25);
        add(txtPrazo);
        
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
            String cliente = txtCliente.getText().trim();
            String prazo = txtPrazo.getText().trim();
            Projeto projeto = new Projeto(nome,cliente,prazo);
            controller.inserirProjeto(projeto);
            txtResultado.setText("Pessoa Cadastrada");
            txtNome.setText("");
        });

        btnExcluir.addActionListener(e -> {
            int id = Integer.parseInt(txtId.getText());
            controller.excluirProjeto(id);
            txtResultado.setText("Projeto Removido");
            txtId.setText("");
            txtNome.setText("");
            
        });

    }
}
