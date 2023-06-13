/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Thisath Dewsen
 */
import java.sql.*;
import javax.swing.JOptionPane;




public class Javaconnect {
    Connection conn;
    
    public static Connection ConnecrDB(){
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/lms","root","");
            return conn;
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Database Connection failed");
            return null;
        }
    }
 
}
