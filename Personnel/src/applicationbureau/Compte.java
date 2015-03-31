package applicationbureau;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel; 
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Compte extends JPanel{
	JLabel lblNom;
	JTextField txtNom;
	JLabel lblPrenom;
	JTextField txtPrenom;
	JLabel lblEmail;
	JTextField txtEmail;
	JButton btnValidéModif;
	JLabel lblMdp;
	JPasswordField jpMdp;
	JLabel lblMdpChange;
	JPasswordField jpMdpChange;
	JLabel lblMdpConf;
	JPasswordField jpMdpConf;
	
	public Compte(){
		setLayout(null);
		
		lblNom = new JLabel("Nom:");
		lblNom.setBounds(29, 33, 46, 14);
		txtNom = new JTextField();
		txtNom.setColumns(10);
		txtNom.setBounds(141, 30, 86, 20);
		lblPrenom = new JLabel("Prenom:");
		lblPrenom.setBounds(29, 76, 56, 14);
		txtPrenom = new JTextField(20);
		txtPrenom.setColumns(10);
		txtPrenom.setBounds(141, 73, 86, 20);
		lblEmail = new JLabel("Email:");
		lblEmail.setBounds(29, 126, 46, 14);
		txtEmail = new JTextField();
		txtEmail.setColumns(10);
		txtEmail.setBounds(141, 123, 86, 20);
		btnValidéModif = new JButton("sauvegarder modification");
		btnValidéModif.setBounds(84, 300, 200, 23);
		lblMdp = new JLabel("Mot de Passe: ");
		lblMdp.setBounds(29,166,86,14);
		jpMdp = new JPasswordField();
		jpMdp.setColumns(10);
		jpMdp.setBounds(141,163,86,20);
		lblMdpChange = new JLabel("Mot de Passe: ");
		lblMdpChange.setBounds(29,206,86,14);
		jpMdpChange = new JPasswordField();
		jpMdpChange.setColumns(10);
		jpMdpChange.setBounds(141,203,86,20);
		lblMdpConf = new JLabel("Mot de Passe: ");
		lblMdpConf.setBounds(29,246,86,14);
		jpMdpConf = new JPasswordField();
		jpMdpConf.setColumns(10);
		jpMdpConf.setBounds(141,243,86,20);

		
		
		add(lblNom);
		add(txtNom);
		add(lblPrenom);
		add(txtPrenom);
		add(lblEmail);
		add(txtEmail);
		add(lblMdp);
		add(jpMdp);
		add(lblMdpChange);
		add(jpMdpChange);
		add(lblMdpConf);
		add(jpMdpConf);
		add(btnValidéModif);
	}
}
