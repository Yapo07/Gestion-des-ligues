package applicationbureau;

import personnel.GestionPersonnel;

//Class du main

public class Appli {

	public static void main(String[] args) {
		GestionPersonnel gp = personnel.GestionPersonnel.getGestionPersonnel();
		Fenetre fen = new Fenetre(gp);
	}
}