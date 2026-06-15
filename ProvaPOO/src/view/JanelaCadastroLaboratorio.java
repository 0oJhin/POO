package view;
import controller.LaboratorioController;
import model.Laboratorio;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
public class JanelaCadastroLaboratorio extends JFrame {
    private JTextField txtId;
    private JTextField txtNome;
    private JTextField txtBloco;
    private JTextField txtCapacidade;
    private JTextField txtResponsavel;
    private JTextArea txtResultado;
    private JButton btncadastrar;
    private JButton btnExcluir;
    private JButton controller;
    public JanelaCadastroLaboratorio(){
        controller= new LaboratorioController();
        setTitle("Cadastro Laboratorio");
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

        JLabel lblBloco = new JLabel ("Bloco");
        lblBloco.setBounds(110,60,80,25);
        add(txtBloco);
        txtBloco = new JTextField();
        txtBloco.setBounds(110,60,80,25);
        add(txtBloco);

        JLabel lblCapacidade = new JLabel ("Capacidade");
        lblCapacidade.setBounds(150,80,220,25);
        add(txtCapacidade);
        txtCapacidade = new JTextField();
        txtCapacidade.setBounds(150,80,220,25);
        add(txtCapacidade);


        JLabel lblResponsavel = new JLabel ("Responsavel");
        lblResponsavel.setBounds(90,30,80,25);
        add(txtResponsavel);
        txtResponsavel = new JTextField();
        txtResponsavel.setBounds(90,65,220,25);
        add(txtResponsavel);
    }

}
