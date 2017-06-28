package dbconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class DBConnect {
    
    private static Connection con = null;
    
    public static Connection getConnection(){
        if(con == null){
            connect();
        }
        return con;
    }
    
    private static void connect(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DBConnect.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Educational Game","root","");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog( null, "Could connect to database. Please try again!");
            Logger.getLogger(DBConnect.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
