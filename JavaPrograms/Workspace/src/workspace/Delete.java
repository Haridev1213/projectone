/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package workspace;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Delete {

public static void main(String[] args) {
       
    try {
        Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost/workshop","root","");
        PreparedStatement pst=con.prepareStatement("delete from studentdetails where Phoneno=1234567889	");
        pst.executeUpdate();
        System.out.println("The entry was deleted in the Database");
    } catch (ClassNotFoundException ex) {
        Logger.getLogger(Delete.class.getName()).log(Level.SEVERE, null, ex);
    } catch (SQLException ex) {
        Logger.getLogger(Delete.class.getName()).log(Level.SEVERE, null, ex);
    }

        
    }
    
}
