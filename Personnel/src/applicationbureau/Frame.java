package applicationbureau;

import javax.swing.*;
import personnel.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Frame {
	
	GestionPersonnel gestionPersonnel ;
	JFrame f ;

	public Frame (GestionPersonnel gestionPersonnel){
		f = new JFrame();
		f.setTitle("application bureau");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setContentPane(getMainConnexion());
		f.setVisible(true);
		f.setSize(200,200);
		f.setLocationRelativeTo(null);
		//f.pack();
		
		this.gestionPersonnel = gestionPersonnel;

	}
	
	public JPanel getButtonPanel()
	{
		JPanel panel = new JPanel();
		JButton button = new JButton("Connexion");
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				//test la vérif du mdp 
				//renvoi vers le panel si ok
				//erreur 
				
			}
		});
		panel.add(button);
		return panel;
		
	}
	
	public JPanel getGridPanel() {
		
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(1,1));
		
		panel.add(new JLabel("Password : "));
		panel.add(new JPasswordField());
		
		return panel;
	}
	
	public JPanel getMainConnexion() {
		
		JPanel panel = new JPanel();
		panel.add(getGridPanel());
		panel.add(getButtonPanel());
		return panel;
		
	}
	
	public JPanel getLabelMenu() {
		
		JPanel panel = new JPanel ();
		return panel;
	}
	
	//méthode déonnexion
	
	//méthode gestion compte 
	//méthode affiche info (nom, prénom, mail) + boutton modifier mdp (avec message box)
	
	//méthode gestion ligue	
	//méthode liste des ligues
	//méthode modifier ligue
	//méhode ajouter ligue 
	//méthode supprimer ligue 
	
	//méthode ligue (nom de l'admin, liste employé)
	//méthode ajoutEmployé 
	//méthode modif emplyé
	//méthode supp employé 
	//
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Frame(GestionPersonnel.getGestionPersonnel());
	}

}
