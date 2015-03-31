package applicationbureau;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC {
	Connection c = null;
	
        private void JDBC() {
                try {
                        Class.forName("com.mysql.jdbc.Driver");
                        String url = "jdbc:mysql://localhost/ppe-gestion-personnel",
                                        user = "root",
                                        password = "";
                        c = DriverManager.getConnection(url, user, password);
                }
                catch (ClassNotFoundException e) {
                        System.out.println("Pilote JDBC non installé.");
                }
                catch (SQLException e) {
                        System.out.println(e);
                }
        }
        
        private void Close(){
        	try
            {
                    if (c != null)
                            c.close();
            }
            catch(SQLException e)
            {
                    System.out.println("Impossible de fermer la connection.");
            }
        }
        
        public void ExecReq(String req){
        	JDBC();
        	try{
        		Statement s = c.createStatement();
                ResultSet rs = s.executeQuery(req);
                while (rs.next()) {
                    System.out.println(rs.getInt(1) + " : " +
                                    rs.getString(2) + " - " +
                                    rs.getString(3) + " - " +
                                    rs.getString(4));
                }
        	}
        	catch (SQLException e) {
                System.out.println(e);
        	}
        	finally{
        		Close();
        	}
        }
        
}