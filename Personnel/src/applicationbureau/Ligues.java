package applicationbureau;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

public class Ligues extends JPanel{
	
	public Ligues(){
		CardLayout cl = new CardLayout();
		JPanel content = new JPanel();
		JPanel boutonPane = new JPanel();
		String[] listContent = {"listeLigues", "infoLigue", "listeEmploye", "infoEmploye"};
		
		
	//Instanciation panel liste de ligues (tableau de données a récupérer dans la BDD par la suite)
		Object[][] donnees = {
                {"RCMetz Football club", "Le long BOUCHER", "Modifier", "Supprimer"},
                {"AllStarsMetz NBA", "Le long Kevin", "Modifier", "Supprimer"},
                {"Club saute-moutons", "Sheeper", "Modifier", "Supprimer"},
                {"Born2rave music club", "le long Max", "Modifier", "Supprimer"},
        };
        String[] entetes = {"Ligue", "Administrateur", "..", "."};
		JPanel listeLigues = new ListeLigues(donnees, entetes); 
		
		
	//Instaciation panel info ligue, récupérer les infos de la lgues sur laquel on aura cliqué
		String[] tab = {"Employe 1", "Employe 2", "Employe 3", "Employe 4"};
		JPanel infoLigue = new InfoLigue(tab);
		
		
	//Instanciation panel liste employés (tableau à récup dans la BDD aussi par la suite)
        Object[][] donnees2 = {
                {"LELONG", "KEVIN", "kevin@long.com", "kevinmdp", "MODIFIER", "SUPRRIMER"},
                {"LELONG", "CLEMENT", "clement@long.com", "clementmdp", "MODIFIER", "SUPRRIMER"},
                {"LELONG", "MAXIME", "maxime@long.com", "maximemdp", "MODIFIER", "SUPRRIMER"},
                {"MESLE", "ALEXANDRE", "alexandre@mesle.Com", "lelongprof", "MODIFIER", "SUPRRIMER"},
        };
        String[] entetes2 = {"Nom", "Prenom", "Email", "Mot de passe", "..", "."};
        JPanel listeEmploye = new ListeEmployes(donnees2, entetes2);
        
        
    //Instanciation panel info employé, récupérer les infos de l'employé sur lequel on clic
        JPanel infoEmploye = new InfoEmploye();
        
        
    //Bouton de navigation temporaire, on aura juste besoin d'un bouton retour par la suite
        JButton bouton = new JButton("Contenu suivant");
        //Définition de l'action du bouton
        bouton.addActionListener(new ActionListener(){
          public void actionPerformed(ActionEvent event){
            //Via cette instruction, on passe au prochain conteneur de la pile
            cl.next(content);
          }
        });
        JButton bouton2 = new JButton("Précédent");
        //Conteneur précédent
        bouton2.addActionListener(new ActionListener(){
          public void actionPerformed(ActionEvent event){				
        	  cl.next(content);
        	  cl.next(content);
        	  cl.next(content);
          }
        });
        boutonPane.add(bouton);
        boutonPane.add(bouton2);
        
        
    //On définit le layout
        content.setLayout(cl);
   //On ajoute les cartes à la pile avec un nom pour les retrouver
        content.add(listeLigues, listContent[0]);
        content.add(infoLigue, listContent[1]);
        content.add(listeEmploye, listContent[2]);
        content.add(infoEmploye, listContent[3]);

        add(boutonPane, BorderLayout.NORTH);
        add(content, BorderLayout.CENTER);
        setVisible(true);
	}
}
