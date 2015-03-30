package applicationbureau;

import personnel.GestionPersonnel;
import javax.swing.SwingUtilities;

//Class du main

public class Appli {

	public static void main(String[] args) {
		GestionPersonnel gp = personnel.GestionPersonnel.getGestionPersonnel();
		SwingUtilities.invokeLater(new Runnable()
		{
					public void run()
					{
						new Fenetre(gp);
					}
		});
	}
}