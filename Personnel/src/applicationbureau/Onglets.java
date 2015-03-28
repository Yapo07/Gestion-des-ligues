package applicationbureau;

import javax.swing.JTabbedPane;
import javax.swing.JPanel; 

//Classe qui génère les 3 onglets, appellée comme contentPane pour la JFrame
//On appelle les classe des JPanel Accueil Ligues et Compte pour chaque onglet correspondant

public class Onglets extends JTabbedPane {
	public Onglets(){
		this.addTab("Accueil", null, getOnglet1(), null);
		this.addTab("Gestion des ligues", null, getOnglet2(), null);
		this.addTab("Gestion de compte", null, getOnglet3(), null);
	}
	
	public JPanel getOnglet1() { //On appelle le JPanel d'accueil
		return new Accueil();
	}
	
	public JPanel getOnglet2() { //On appelle le JPanel de liste des ligues
		return new Ligues();
	}
	
	public JPanel getOnglet3() { //On appelle le JPanel de gestion de compte
		return new Compte();
	}


}
