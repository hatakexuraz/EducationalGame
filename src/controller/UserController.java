package controller;

import dbconnection.DBConnect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.User;

public class UserController {
    private Connection con = null;
    private PreparedStatement pstmt;
    private ResultSet rs;    
    
    public UserController(){
       try{
            if(con == null){
            con = DBConnect.getConnection();
        }
       }
       catch(Exception ex){
           JOptionPane.showMessageDialog(null, ex);
       }
    }
    
    public int authenticate(User user){
        int userId=0;
        
        String query = "Select * from User where username = ?";
        
        try{
            pstmt = con.prepareStatement(query,Statement.RETURN_GENERATED_KEYS);
            pstmt.setString(1, user.getUsername());
            rs = pstmt.executeQuery();
            
            while(rs.next()){
                userId = rs.getInt("id");
            }
        }
        catch(SQLException ex){
            Logger.getLogger(UserController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return userId;
    }
    
    public int userRegister(User usr){
        int res=0;
       
        String query = "Insert into User(first_name,last_name,address,school_name,username) values(?,?,?,?,?)";
        
        try{
            pstmt = con.prepareStatement(query);
            pstmt.setString(1, usr.getFirstName());
            pstmt.setString(2, usr.getLastName());
            pstmt.setString(3, usr.getAddress());
            pstmt.setString(4, usr.getSchoolName());
            pstmt.setString(5, usr.getUsername());
            
            res = pstmt.executeUpdate();
        }
        catch(SQLException ex){
            Logger.getLogger(UserController.class.getName()).log(Level.SEVERE, null, ex);
        }
       
      return res;
   }
}
