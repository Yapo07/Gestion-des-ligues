package applicationbureau;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

import personnel.GestionPersonnel;

public class Fenetre extends JFrame {
	
	GestionPersonnel gestionPersonnel;
	JTabbedPane t;
	JPanel p1,p2,p3;
	
	public Fenetre(GestionPersonnel gestionPersonnel){
		setTitle("Application bureau");
		setSize(550, 500);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		t = new JTabbedPane();
        p1 = new Accueil();
        p2 = new Ligues();
        p3 = new Compte();
        
        t.addTab("Accueil",p1);
        t.addTab("Gestion des ligues",p2);
        t.addTab("Gestion du compte",p3);
        
        t.setTabPlacement(JTabbedPane.TOP);
        t.setVisible(true);
        
        add(t);
		
		this.gestionPersonnel = gestionPersonnel;
	}
}
