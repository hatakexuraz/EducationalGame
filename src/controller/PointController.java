package controller;

import dbconnection.DBConnect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author hatake_47
 */
public class PointController {
    private PreparedStatement pstmt;
    private ResultSet rs;
    private Connection con = null;
    
    //this function is created to make the connection with the database
    public PointController(){
        if(con==null){
            con = DBConnect.getConnection();
        }
    }
    
    public void savePoints(int point, int user, String chapter){
        int pnt=0;
        
        pnt=this.getPoint(user, chapter);
        
        if(pnt>0){
                String query = "Update Point set point = ? where user_id="+user+" and chapter='"+chapter+"'";
                try{                
                    pstmt = con.prepareStatement(query);
                    pstmt.setInt(1, point);

                    pstmt.executeUpdate();            
                }
                catch(SQLException ex){
                    Logger.getLogger(PointController.class.getName()).log(Level.SEVERE, null, ex);
                }
        }
        else{
            String query = "Insert into Point (user_id, chapter, point) values(?,?,?)";
            
             try{                
                pstmt = con.prepareStatement(query);
                pstmt.setInt(1, user);
                pstmt.setString(2, chapter);
                pstmt.setInt(3, point);

                pstmt.executeUpdate();            
            }
            catch(SQLException ex){
                Logger.getLogger(PointController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public int getPoint(int user, String chapter){
        String query = "Select * from Point where user_id="+user+" and chapter='"+chapter+"'";
        int point=0;
        
        try{
            pstmt = con.prepareStatement(query);
            rs = pstmt.executeQuery();
            
            while(rs.next()){
                point = rs.getInt("point");
            }
        }
        catch(SQLException ex){
            Logger.getLogger(PointController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return point;
    }
}
