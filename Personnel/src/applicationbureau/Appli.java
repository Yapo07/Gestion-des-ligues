package applicationbureau;

import personnel.GestionPersonnel;
import javax.swing.SwingUtilities;

//Class du main

public class Appli {

	public static void main(String[] args) {
		GestionPersonnel gp = personnel.GestionPersonnel.getGestionPersonnel();
//		JDBC db = new JDBC();
//		String req = "SELECT * FROM utilisateur";
//		db.ExecReq(req);
		SwingUtilities.invokeLater(new Runnable()
		{
					public void run()
					{
						new Fenetre(gp);
					}
		});
	}
}