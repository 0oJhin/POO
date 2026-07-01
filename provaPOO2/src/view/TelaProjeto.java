package view;
import controller.ProjetoController;

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

}
}