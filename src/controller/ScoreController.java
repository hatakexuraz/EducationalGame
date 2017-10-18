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
public class ScoreController {
    private PreparedStatement pstmt;
    private ResultSet rs;
    private Connection con = null;
    
    //this function is created to make the connection with the database
    public ScoreController(){
        if(con==null){
            con = DBConnect.getConnection();
        }
    }
    
    public void saveScore(int score, int user, String assessment){
        int scr=0;
        
        scr=this.getScore(user, assessment);
        
        if(scr>0){
                String query = "Update Score set score = ? where user_id="+user+" and assessment='"+assessment+"'";
                try{                
                    pstmt = con.prepareStatement(query);
                    pstmt.setInt(1, score);

                    pstmt.executeUpdate();            
                }
                catch(SQLException ex){
                    Logger.getLogger(ScoreController.class.getName()).log(Level.SEVERE, null, ex);
                }
        }
        else{
            String query = "Insert into Score (user_id, assessment, score) values(?,?,?)";

            try{
                pstmt = con.prepareStatement(query);
                pstmt.setInt(1, user);
                pstmt.setString(2, assessment);
                pstmt.setInt(3, score);

                pstmt.executeUpdate();            
            }
            catch(SQLException ex){
                Logger.getLogger(ScoreController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public int getScore(int user, String assessment){
        String query = "Select * from Score where user_id="+user+" and assessment='"+assessment+"'";
        int score=0;
        
        try{
            pstmt = con.prepareStatement(query);
            rs = pstmt.executeQuery();
            
            while(rs.next()){
                score = rs.getInt("score");
            }
        }
        catch(SQLException ex){
            Logger.getLogger(ScoreController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return score;
    }
}
