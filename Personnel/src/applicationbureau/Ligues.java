package applicationbureau;

import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JScrollPane;

public class Ligues extends JPanel{
	
	JTable table;
	
	public Ligues(){
		//JTable avec liste de ligues, nom admin, bouton modifier, bouton supprimer
		//supprimer: msgBox de confirmation
		//modifier: change le jpanel actif sur l'onglet -> ModifLigue
		setLayout(new BorderLayout(0, 0));
		
		Object[][] donnees = {
                {"RCMetz Football club", "Le long BOUCHER"},
                {"AllStarsMetz NBA", "Le long Kevin"},
                {"Club saute-moutons", "Sheeper"},
                {"Born2rave music club", "le long Max"},
        };
 
        String[] entetes = {"Ligue", "Administrateur"};
 
        JTable tableau = new JTable(donnees, entetes);
 
        add(new JScrollPane(tableau));
	}
}
