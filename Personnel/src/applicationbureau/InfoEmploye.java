package applicationbureau;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class InfoEmploye extends JPanel{
	JLabel lblNom;
    JTextField txtNom;
    JLabel lblPrenom;
    JTextField txtPrenom;
    JLabel lblEmail;
    JTextField txtEmail;
    JLabel lblMdp;
    JTextField txtMdp;
    JButton btnModifier;
    
    public InfoEmploye(){
    	setLayout(null);
    	
    	lblNom = new JLabel("Nom de l'employé:");
    	lblNom.setBounds(100, 50, 140, 20);
        txtNom = new JTextField("Nom");
        txtNom.setBounds(250, 50, 140, 20);
        lblPrenom = new JLabel("Prenom de l'employé:");
        lblPrenom.setBounds(100, 100, 140, 20);
        txtPrenom = new JTextField("Prenom");
        txtPrenom.setBounds(250, 100, 140, 20);
        lblEmail = new JLabel("Email de l'employé:");
        lblEmail.setBounds(100, 150, 140, 20);
        txtEmail = new JTextField("Email");
        txtEmail.setBounds(250, 150, 140, 20);
        lblMdp = new JLabel("Mot de passe");
        lblMdp.setBounds(100, 200, 140, 20);
        txtMdp = new JTextField("Mot de passe");
        txtMdp.setBounds(250, 200, 140, 20);
        btnModifier = new JButton("MODIFIER");
        btnModifier.setBounds(180, 250, 100, 20);
        
        add(lblNom);
        add(txtNom);
        add(lblPrenom);
        add(txtPrenom);
        add(lblEmail);
        add(txtEmail);
        add(lblMdp);
        add(txtMdp);
        add(btnModifier);
    }
}
