package applicationbureau;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel; 
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Compte extends JPanel{
	JLabel lblNom;
	JTextField txtNom;
	JLabel lblPrenom;
	JTextField txtPrenom;
	JLabel lblEmail;
	JTextField txtEmail;
	JButton btnModifierMdp;
	
	public Compte(){
		setLayout(null);
		
		lblNom = new JLabel("Nom:");
		lblNom.setBounds(29, 33, 46, 14);
		txtNom = new JTextField();
		txtNom.setColumns(10);
		txtNom.setBounds(141, 30, 86, 20);
		lblPrenom = new JLabel("Prenom:");
		lblPrenom.setBounds(29, 76, 46, 14);
		txtPrenom = new JTextField(20);
		txtPrenom.setColumns(10);
		txtPrenom.setBounds(141, 73, 86, 20);
		lblEmail = new JLabel("Email:");
		lblEmail.setBounds(29, 126, 46, 14);
		txtEmail = new JTextField();
		txtEmail.setColumns(10);
		txtEmail.setBounds(141, 123, 86, 20);
		btnModifierMdp = new JButton("Modifier MDP");
		btnModifierMdp.setBounds(84, 200, 110, 23);
		
		add(lblNom);
		add(txtNom);
		add(lblPrenom);
		add(txtPrenom);
		add(lblEmail);
		add(txtEmail);
		add(btnModifierMdp);
	}
}
