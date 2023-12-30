/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package workspace;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author harid
 */
public class Selection {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con =DriverManager.getConnection("jdbc:mysql://localhost/workshop","root","");
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery("Select *from studentdetails");
            while(rs.next())
            {
                
                System.out.println(rs.getString(1)+"\t"+rs.getString(2)+"\t\t"+rs.getInt(3));    
            }
            
            
         con.close();
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Selection.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Selection.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    
    
    
    }
    
    
    
}


