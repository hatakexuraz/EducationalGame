package controller;

import dbconnection.DBConnect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;  
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author hatake_47
 */
public class GKChapterController {
    private PreparedStatement pstmt;
    private ResultSet rs;
    private Connection con = null;
    
    //this function is created to make the connection with the database
    public GKChapterController(){
        if(con==null){
            con = DBConnect.getConnection();
        }
    }
    
    
    //this function is created to retrive the content out of the database i.e. questions
    //the parameter is here to help retrive the question of particular numbers
    public ArrayList getContent(int id){                        
        ArrayList<String> content = new ArrayList<>();        //a variable 'content' is created and initialized
                
        String query="Select * from GKChapter where id=?";    //a query to retrive the row of cretain id
        
        try {                                                 //use of 'try' statement
            pstmt = con.prepareStatement(query);              //query is precompiled to send to the database 
            pstmt.setInt(1, id);                              //the value of id is set here
            rs = pstmt.executeQuery();                        //query on 'pstmt' is executed and returns an ResultSet
            
            while(rs.next()){                                 //loops until there is any value on 'rs'

                content.add(rs.getString("question"));        //Add the value on ArrayList 'content'
                content.add(rs.getString("answer"));          //Add the value on ArrayList 'content'
            }
            
        } catch (Exception e) {                              //grabs the error during runtime
            Logger.getLogger(GKChapterController.class.getName()).log(Level.SEVERE, null, e); //
        }
        
        
        return content;                             //return the ArrayList 'content'
    }
    
    public ArrayList getOptions(int id){
        ArrayList<String> option = new ArrayList<>(); 
        
        String query="Select * from GKOptions where id=?";
        
        try {
            pstmt = con.prepareStatement(query);
            pstmt.setInt(1, id);
            rs = pstmt.executeQuery();
            
            while(rs.next()){                                 //loops until there is any value on 'rs'

                option.add(rs.getString("options"));        //Add the options on ArrayList 'option'
                option.add(rs.getString("que_no"));          //Add the options on ArrayList 'option'
            }
        } catch (Exception e) {
            Logger.getLogger(GKChapterController.class.getName()).log(Level.SEVERE, null, e);
        }
        
        return option;
    }
}
