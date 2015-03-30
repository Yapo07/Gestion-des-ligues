package applicationbureau;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel; 
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Compte extends JPanel{
	public Compte(){
		//Afficher les infos du compte root dans des textArea modifiable
		//Un bouton modif MDP qui ouvre 2 msgBox, modif mdp, confirmation nouveau mdp
		
		setLayout(null);
		
		JLabel lblNom = new JLabel("Nom");
		lblNom.setBounds(29, 33, 46, 14);
		
		JTextField nom = new JTextField();
		nom.setColumns(10);
		nom.setBounds(141, 30, 86, 20);
		
		JLabel lblPrenom = new JLabel("Prenom");
		lblPrenom.setBounds(29, 76, 46, 14);
		
		JTextField prenom = new JTextField(20);
		prenom.setColumns(10);
		prenom.setBounds(141, 73, 86, 20);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setBounds(29, 126, 46, 14);
		
		
		JTextField email = new JTextField();
		email.setColumns(10);
		email.setBounds(141, 123, 86, 20);
		
		JButton btnModifierMdp = new JButton("Modifier MDP");
		btnModifierMdp.setBounds(84, 200, 110, 23);
		
		add(lblNom);
		add(nom);
		add(lblPrenom);
		add(prenom);
		add(lblEmail);
		add(email);
		add(btnModifierMdp);
	}
}
