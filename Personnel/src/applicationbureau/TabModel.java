package applicationbureau;

import javax.swing.table.AbstractTableModel;


public class TabModel extends AbstractTableModel{
	private Object[][] donnees;
    private String[] entete;

    //Constructeur
    public TabModel(Object[][] data, String[] title){
      this.donnees = data;
      this.entete = title;
    }

    //Retourne le nombre de colonnes
    public int getColumnCount() {
      return this.entete.length;
    }

    //Retourne le nombre de lignes
    public int getRowCount() {
      return this.donnees.length;
    }

    //Retourne la valeur à l'emplacement spécifié
    public Object getValueAt(int row, int col) {
      return this.donnees[row][col];
    }     
    
    //Retourne le titre de la colonne à l'indice spécifié
    public String getColumnName(int col) {
      return this.entete[col];
    }
}