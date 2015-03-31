package applicationbureau;

import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class InfoLigue extends JPanel{
	 JLabel lblNom;
     JTextField txtNom;
     String[] tabEmployes;
     JComboBox cboxAdmin;
     JButton btnModifier;
     JButton btnEmployes;
     
     public InfoLigue(String[] tab){
	    setLayout(null);
	    
	    lblNom = new JLabel("Nom de la ligue:");
	    lblNom.setBounds(100, 100, 100, 20);
		txtNom = new JTextField("");
		txtNom.setText("Nom");
		txtNom.setBounds(210, 100, 100, 20);
		txtNom.setColumns(10);
		tabEmployes = tab;
		cboxAdmin = new JComboBox(tabEmployes);
		cboxAdmin.setPreferredSize(new Dimension(100, 20));
		btnModifier = new JButton("MODIFIER");
		btnModifier.setBounds(100, 200, 100, 20);
		btnEmployes = new JButton("Liste des employés");
		btnEmployes.setBounds(210, 200, 150, 20);
		
		add(lblNom);
		add(txtNom);
		add(cboxAdmin);
		add(btnModifier);		
		add(btnEmployes);
		
		
		
     }
}
