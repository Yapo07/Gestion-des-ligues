package applicationbureau;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class ListeLigues extends JPanel{
	Object[][] donnees;
    String[] entetes;
    TabModel model;
    JTable tableau;
    
    public ListeLigues(Object[][] data, String[] title){
    	this.donnees = data;
    	this.entetes = title;
    	this.model = new TabModel(donnees, entetes);
    	this.tableau = new JTable(model);
    	tableau.getColumnModel().getColumn(2).setPreferredWidth(40);
        tableau.getColumnModel().getColumn(3).setPreferredWidth(40);
        tableau.getColumn("..").setCellRenderer(new ButtonRenderer());
        tableau.getColumn(".").setCellRenderer(new ButtonRenderer());
        add(new JScrollPane(tableau));
    }
    
    //Ajout ligne
    //model.addRow(new String[]{"colonne1","colonne2","colonne3"}); 
    //Suppression ligne
    //model.removeRow(1);
}