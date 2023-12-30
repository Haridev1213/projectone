/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *program name : Delete the data in the mysql
 * @author harid
 */
public class Delete_Operation {
public static void main(String[] args) {
       
    try {
        Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost/dbms","root","");
        PreparedStatement pst=con.prepareStatement("delete from student_details where Id=6");
        pst.executeUpdate();
    } catch (ClassNotFoundException ex) {
        Logger.getLogger(Delete_Operation.class.getName()).log(Level.SEVERE, null, ex);
    } catch (SQLException ex) {
        Logger.getLogger(Delete_Operation.class.getName()).log(Level.SEVERE, null, ex);
    }

        
    }
    
    
    
    
    
    
    
}
