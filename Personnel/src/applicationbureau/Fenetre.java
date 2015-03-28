package applicationbureau;

import javax.swing.JFrame;
import java.awt.*;

//Class qui génère la Frame de l'application, on lui met la class onglet en ContentPane

import personnel.GestionPersonnel;

public class Fenetre extends JFrame {
	
	GestionPersonnel gestionPersonnel;
	JFrame f;
	
	public Fenetre(GestionPersonnel gestionPersonnel){
		f = new JFrame();
		f.setTitle("Application bureau");
		f.setSize(400, 500);
		f.setLocationRelativeTo(null);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
		Container contentPane = f.getContentPane();
        contentPane.add(new Onglets());
		
		this.gestionPersonnel = gestionPersonnel;
	}
}
